package mango.mango.rxjavaretrofitreview.Bean;

import java.util.ArrayList;
import java.util.List;
public class Product {

    private String id;
    private String topicId;
    private String number;
    private String category;
    private String title;
    private String desc;
    private String price;
    private String url;
    private Boolean iscomments;
    private String comments;
    private Boolean islike;
    private String likes;
    private List<Pic> pic = new ArrayList<Pic>();
    private String itemId;
    private String platform;
    private String shareUrl;
    private String type;

    /**
     *
     * @return
     * The id
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     *
     * @return
     * The topicId
     */
    public String getTopicId() {
        return topicId;
    }

    /**
     *
     * @param topicId
     * The topic_id
     */
    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }

    /**
     *
     * @return
     * The number
     */
    public String getNumber() {
        return number;
    }

    /**
     *
     * @param number
     * The number
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     *
     * @return
     * The category
     */
    public String getCategory() {
        return category;
    }

    /**
     *
     * @param category
     * The category
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     *
     * @return
     * The title
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @param title
     * The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     * @return
     * The desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     *
     * @param desc
     * The desc
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     *
     * @return
     * The price
     */
    public String getPrice() {
        return price;
    }

    /**
     *
     * @param price
     * The price
     */
    public void setPrice(String price) {
        this.price = price;
    }

    /**
     *
     * @return
     * The url
     */
    public String getUrl() {
        return url;
    }

    /**
     *
     * @param url
     * The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     *
     * @return
     * The iscomments
     */
    public Boolean getIscomments() {
        return iscomments;
    }

    /**
     *
     * @param iscomments
     * The iscomments
     */
    public void setIscomments(Boolean iscomments) {
        this.iscomments = iscomments;
    }

    /**
     *
     * @return
     * The comments
     */
    public String getComments() {
        return comments;
    }

    /**
     *
     * @param comments
     * The comments
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

    /**
     *
     * @return
     * The islike
     */
    public Boolean getIslike() {
        return islike;
    }

    /**
     *
     * @param islike
     * The islike
     */
    public void setIslike(Boolean islike) {
        this.islike = islike;
    }

    /**
     *
     * @return
     * The likes
     */
    public String getLikes() {
        return likes;
    }

    /**
     *
     * @param likes
     * The likes
     */
    public void setLikes(String likes) {
        this.likes = likes;
    }

    /**
     *
     * @return
     * The pic
     */
    public List<Pic> getPic() {
        return pic;
    }

    /**
     *
     * @param pic
     * The pic
     */
    public void setPic(List<Pic> pic) {
        this.pic = pic;
    }

    /**
     *
     * @return
     * The itemId
     */
    public String getItemId() {
        return itemId;
    }

    /**
     *
     * @param itemId
     * The item_id
     */
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    /**
     *
     * @return
     * The platform
     */
    public String getPlatform() {
        return platform;
    }

    /**
     *
     * @param platform
     * The platform
     */
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     *
     * @return
     * The shareUrl
     */
    public String getShareUrl() {
        return shareUrl;
    }

    /**
     *
     * @param shareUrl
     * The share_url
     */
    public void setShareUrl(String shareUrl) {
        this.shareUrl = shareUrl;
    }

    /**
     *
     * @return
     * The type
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     * The type
     */
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", topicId='" + topicId + '\'' +
                ", number='" + number + '\'' +
                ", category='" + category + '\'' +
                ", title='" + title + '\'' +
                ", desc='" + desc + '\'' +
                ", price='" + price + '\'' +
                ", url='" + url + '\'' +
                ", iscomments=" + iscomments +
                ", comments='" + comments + '\'' +
                ", islike=" + islike +
                ", likes='" + likes + '\'' +
                ", pic=" + pic +
                ", itemId='" + itemId + '\'' +
                ", platform='" + platform + '\'' +
                ", shareUrl='" + shareUrl + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}