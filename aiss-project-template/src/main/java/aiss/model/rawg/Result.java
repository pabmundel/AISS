
package aiss.model.rawg;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "slug",
    "name",
    "released",
    "tba",
    "background_image",
    "rating",
    "rating_top",
    "ratings",
    "ratings_count",
    "reviews_text_count",
    "added",
    "added_by_status",
    "metacritic",
    "playtime",
    "suggestions_count"
})
public class Result {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("slug")
    private String slug;
    @JsonProperty("name")
    private String name;
    @JsonProperty("released")
    private String released;
    @JsonProperty("tba")
    private Boolean tba;
    @JsonProperty("background_image")
    private String backgroundImage;
    @JsonProperty("rating")
    private Integer rating;
    @JsonProperty("rating_top")
    private Integer ratingTop;
    @JsonProperty("ratings")
    private Ratings ratings;
    @JsonProperty("ratings_count")
    private Integer ratingsCount;
    @JsonProperty("reviews_text_count")
    private String reviewsTextCount;
    @JsonProperty("added")
    private Integer added;
    @JsonProperty("added_by_status")
    private AddedByStatus addedByStatus;
    @JsonProperty("metacritic")
    private Integer metacritic;
    @JsonProperty("playtime")
    private Integer playtime;
    @JsonProperty("suggestions_count")
    private Integer suggestionsCount;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("slug")
    public String getSlug() {
        return slug;
    }

    @JsonProperty("slug")
    public void setSlug(String slug) {
        this.slug = slug;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("released")
    public String getReleased() {
        return released;
    }

    @JsonProperty("released")
    public void setReleased(String released) {
        this.released = released;
    }

    @JsonProperty("tba")
    public Boolean getTba() {
        return tba;
    }

    @JsonProperty("tba")
    public void setTba(Boolean tba) {
        this.tba = tba;
    }

    @JsonProperty("background_image")
    public String getBackgroundImage() {
        return backgroundImage;
    }

    @JsonProperty("background_image")
    public void setBackgroundImage(String backgroundImage) {
        this.backgroundImage = backgroundImage;
    }

    @JsonProperty("rating")
    public Integer getRating() {
        return rating;
    }

    @JsonProperty("rating")
    public void setRating(Integer rating) {
        this.rating = rating;
    }

    @JsonProperty("rating_top")
    public Integer getRatingTop() {
        return ratingTop;
    }

    @JsonProperty("rating_top")
    public void setRatingTop(Integer ratingTop) {
        this.ratingTop = ratingTop;
    }

    @JsonProperty("ratings")
    public Ratings getRatings() {
        return ratings;
    }

    @JsonProperty("ratings")
    public void setRatings(Ratings ratings) {
        this.ratings = ratings;
    }

    @JsonProperty("ratings_count")
    public Integer getRatingsCount() {
        return ratingsCount;
    }

    @JsonProperty("ratings_count")
    public void setRatingsCount(Integer ratingsCount) {
        this.ratingsCount = ratingsCount;
    }

    @JsonProperty("reviews_text_count")
    public String getReviewsTextCount() {
        return reviewsTextCount;
    }

    @JsonProperty("reviews_text_count")
    public void setReviewsTextCount(String reviewsTextCount) {
        this.reviewsTextCount = reviewsTextCount;
    }

    @JsonProperty("added")
    public Integer getAdded() {
        return added;
    }

    @JsonProperty("added")
    public void setAdded(Integer added) {
        this.added = added;
    }

    @JsonProperty("added_by_status")
    public AddedByStatus getAddedByStatus() {
        return addedByStatus;
    }

    @JsonProperty("added_by_status")
    public void setAddedByStatus(AddedByStatus addedByStatus) {
        this.addedByStatus = addedByStatus;
    }

    @JsonProperty("metacritic")
    public Integer getMetacritic() {
        return metacritic;
    }

    @JsonProperty("metacritic")
    public void setMetacritic(Integer metacritic) {
        this.metacritic = metacritic;
    }

    @JsonProperty("playtime")
    public Integer getPlaytime() {
        return playtime;
    }

    @JsonProperty("playtime")
    public void setPlaytime(Integer playtime) {
        this.playtime = playtime;
    }

    @JsonProperty("suggestions_count")
    public Integer getSuggestionsCount() {
        return suggestionsCount;
    }

    @JsonProperty("suggestions_count")
    public void setSuggestionsCount(Integer suggestionsCount) {
        this.suggestionsCount = suggestionsCount;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
