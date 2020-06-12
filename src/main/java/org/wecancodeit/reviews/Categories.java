package org.wecancodeit.reviews;

    public class Categories {

            private String adultAnimationTitle;
            private String kidsShowsTitle;
            private String tags;

            public Categories(String adultAnimation, String kidsShows, String tags) {
                this.adultAnimationTitle = adultAnimation;
                this.kidsShowsTitle = kidsShows;
                this.tags = tags;
            }
            public String getAdultAnimation() {
                return adultAnimationTitle;
            }

            public String getKidsShows() {
                return kidsShowsTitle;
            }

            public String getTags() {
                return tags;
            }
        }

