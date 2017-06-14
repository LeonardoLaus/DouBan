package cherry.android.douban.home;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import cherry.android.douban.R;
import cherry.android.douban.adapter.HomePageAdapter;
import cherry.android.douban.common.Constants;
import cherry.android.douban.common.ui.ToolbarFragment;
import cherry.android.router.annotations.Route;

/**
 * Created by Administrator on 2017/6/2.
 */
@Route("movie://fragment/home")
public class HomeFragment extends ToolbarFragment {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.tv_location)
    TextView locationView;
    @BindView(R.id.tv_search)
    TextView searchView;
    @BindView(R.id.tab_layout)
    TabLayout tabLayout;
    @BindView(R.id.view_pager)
    ViewPager viewPager;

    private HomePageAdapter mPagerAdapter;

    @Override
    protected int getViewLayoutId() {
        return R.layout.fragment_home;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);
        init();
    }

    void init() {
        List<HomeMovieFragment> list = new ArrayList<>(2);
        list.add(HomeMovieFragment.newInstance(Constants.TAB_IN_THEATER));
        list.add(HomeMovieFragment.newInstance(Constants.TAB_COMING_SOON));
        mPagerAdapter = new HomePageAdapter(this.getChildFragmentManager(), list);
        viewPager.setAdapter(mPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }

    @Override
    protected Toolbar getToolbar() {
        return toolbar;
    }
}
