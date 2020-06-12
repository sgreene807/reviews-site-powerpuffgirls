package org.wecancodeit.reviews;

public class Hashtags extends Reviews {
    private String hashtagName;

    public Hashtags(String hashtagName, String showTitle, Integer showRating, String airDate, String description) {
        super(showTitle, showRating, airDate, description);
        this.hashtagName = hashtagName;
    }

}

