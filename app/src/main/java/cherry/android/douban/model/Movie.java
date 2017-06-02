package cherry.android.douban.model;

import java.util.List;

/**
 * Created by Administrator on 2017/6/2.
 */

public class Movie {
    /**
     * rating : {"max":10,"average":8.2,"stars":"45","min":0}
     * genres : ["动作","奇幻","冒险"]
     * title : 神奇女侠
     * casts : [{"alt":"https://movie.douban.com/celebrity/1044996/","avatars":{"small":"http://img7.doubanio.com/img/celebrity/small/8710.jpg","large":"http://img7.doubanio.com/img/celebrity/large/8710.jpg","medium":"http://img7.doubanio.com/img/celebrity/medium/8710.jpg"},"name":"盖尔·加朵","id":"1044996"},{"alt":"https://movie.douban.com/celebrity/1053621/","avatars":{"small":"http://img3.doubanio.com/img/celebrity/small/32637.jpg","large":"http://img3.doubanio.com/img/celebrity/large/32637.jpg","medium":"http://img3.doubanio.com/img/celebrity/medium/32637.jpg"},"name":"克里斯·派恩","id":"1053621"},{"alt":"https://movie.douban.com/celebrity/1002676/","avatars":{"small":"http://img3.doubanio.com/img/celebrity/small/51737.jpg","large":"http://img3.doubanio.com/img/celebrity/large/51737.jpg","medium":"http://img3.doubanio.com/img/celebrity/medium/51737.jpg"},"name":"罗宾·怀特","id":"1002676"}]
     * collect_count : 4938
     * original_title : Wonder Woman
     * subtype : movie
     * directors : [{"alt":"https://movie.douban.com/celebrity/1023041/","avatars":{"small":"http://img3.doubanio.com/img/celebrity/small/55167.jpg","large":"http://img3.doubanio.com/img/celebrity/large/55167.jpg","medium":"http://img3.doubanio.com/img/celebrity/medium/55167.jpg"},"name":"派蒂·杰金斯","id":"1023041"}]
     * year : 2017
     * images : {"small":"http://img7.doubanio.com/view/movie_poster_cover/ipst/public/p2460006593.webp","large":"http://img7.doubanio.com/view/movie_poster_cover/lpst/public/p2460006593.webp","medium":"http://img7.doubanio.com/view/movie_poster_cover/spst/public/p2460006593.webp"}
     * alt : https://movie.douban.com/subject/1578714/
     * id : 1578714
     */

    private Rating rating;
    private String title;
    private int collect_count;
    private String original_title;
    private String subtype;
    private String year;
    private Images images;
    private String alt;
    private String id;
    private List<String> genres;
    private List<Casts> casts;
    private List<Directors> directors;

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCollect_count() {
        return collect_count;
    }

    public void setCollect_count(int collect_count) {
        this.collect_count = collect_count;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Images getImages() {
        return images;
    }

    public void setImages(Images images) {
        this.images = images;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public List<Casts> getCasts() {
        return casts;
    }

    public void setCasts(List<Casts> casts) {
        this.casts = casts;
    }

    public List<Directors> getDirectors() {
        return directors;
    }

    public void setDirectors(List<Directors> directors) {
        this.directors = directors;
    }

    public static class Rating {
        /**
         * max : 10
         * average : 8.2
         * stars : 45
         * min : 0
         */

        private int max;
        private double average;
        private String stars;
        private int min;

        public int getMax() {
            return max;
        }

        public void setMax(int max) {
            this.max = max;
        }

        public double getAverage() {
            return average;
        }

        public void setAverage(double average) {
            this.average = average;
        }

        public String getStars() {
            return stars;
        }

        public void setStars(String stars) {
            this.stars = stars;
        }

        public int getMin() {
            return min;
        }

        public void setMin(int min) {
            this.min = min;
        }
    }

    public static class Images {
        /**
         * small : http://img7.doubanio.com/view/movie_poster_cover/ipst/public/p2460006593.webp
         * large : http://img7.doubanio.com/view/movie_poster_cover/lpst/public/p2460006593.webp
         * medium : http://img7.doubanio.com/view/movie_poster_cover/spst/public/p2460006593.webp
         */

        private String small;
        private String large;
        private String medium;

        public String getSmall() {
            return small;
        }

        public void setSmall(String small) {
            this.small = small;
        }

        public String getLarge() {
            return large;
        }

        public void setLarge(String large) {
            this.large = large;
        }

        public String getMedium() {
            return medium;
        }

        public void setMedium(String medium) {
            this.medium = medium;
        }
    }

    public static class Casts {
        /**
         * alt : https://movie.douban.com/celebrity/1044996/
         * avatars : {"small":"http://img7.doubanio.com/img/celebrity/small/8710.jpg","large":"http://img7.doubanio.com/img/celebrity/large/8710.jpg","medium":"http://img7.doubanio.com/img/celebrity/medium/8710.jpg"}
         * name : 盖尔·加朵
         * id : 1044996
         */

        private String alt;
        private Avatars avatars;
        private String name;
        private String id;

        public String getAlt() {
            return alt;
        }

        public void setAlt(String alt) {
            this.alt = alt;
        }

        public Avatars getAvatars() {
            return avatars;
        }

        public void setAvatars(Avatars avatars) {
            this.avatars = avatars;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public static class Avatars {
            /**
             * small : http://img7.doubanio.com/img/celebrity/small/8710.jpg
             * large : http://img7.doubanio.com/img/celebrity/large/8710.jpg
             * medium : http://img7.doubanio.com/img/celebrity/medium/8710.jpg
             */

            private String small;
            private String large;
            private String medium;

            public String getSmall() {
                return small;
            }

            public void setSmall(String small) {
                this.small = small;
            }

            public String getLarge() {
                return large;
            }

            public void setLarge(String large) {
                this.large = large;
            }

            public String getMedium() {
                return medium;
            }

            public void setMedium(String medium) {
                this.medium = medium;
            }
        }
    }

    public static class Directors {
        /**
         * alt : https://movie.douban.com/celebrity/1023041/
         * avatars : {"small":"http://img3.doubanio.com/img/celebrity/small/55167.jpg","large":"http://img3.doubanio.com/img/celebrity/large/55167.jpg","medium":"http://img3.doubanio.com/img/celebrity/medium/55167.jpg"}
         * name : 派蒂·杰金斯
         * id : 1023041
         */

        private String alt;
        private AvatarsX avatars;
        private String name;
        private String id;

        public String getAlt() {
            return alt;
        }

        public void setAlt(String alt) {
            this.alt = alt;
        }

        public AvatarsX getAvatars() {
            return avatars;
        }

        public void setAvatars(AvatarsX avatars) {
            this.avatars = avatars;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public static class AvatarsX {
            /**
             * small : http://img3.doubanio.com/img/celebrity/small/55167.jpg
             * large : http://img3.doubanio.com/img/celebrity/large/55167.jpg
             * medium : http://img3.doubanio.com/img/celebrity/medium/55167.jpg
             */

            private String small;
            private String large;
            private String medium;

            public String getSmall() {
                return small;
            }

            public void setSmall(String small) {
                this.small = small;
            }

            public String getLarge() {
                return large;
            }

            public void setLarge(String large) {
                this.large = large;
            }

            public String getMedium() {
                return medium;
            }

            public void setMedium(String medium) {
                this.medium = medium;
            }
        }
    }
}