package mango.mango.rxjavaretrofitreview.Bean;

import java.util.ArrayList;
import java.util.List;

public class TopicData {

    private String id;
    private String category;
    private String title;
    private String desc;
    private String type;
    private String pic;
    private String width;
    private String height;
    private String likes;
    private String shareUrl;
    private String sharePic;
    private Boolean islike;
    private Activity activity;
    private List<Product> product = new ArrayList<Product>();

    /**
     * @return The id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return The category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category The category
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * @return The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return The desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * @param desc The desc
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * @return The type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return The pic
     */
    public String getPic() {
        return pic;
    }

    /**
     * @param pic The pic
     */
    public void setPic(String pic) {
        this.pic = pic;
    }

    /**
     * @return The width
     */
    public String getWidth() {
        return width;
    }

    /**
     * @param width The width
     */
    public void setWidth(String width) {
        this.width = width;
    }

    /**
     * @return The height
     */
    public String getHeight() {
        return height;
    }

    /**
     * @param height The height
     */
    public void setHeight(String height) {
        this.height = height;
    }

    /**
     * @return The likes
     */
    public String getLikes() {
        return likes;
    }

    /**
     * @param likes The likes
     */
    public void setLikes(String likes) {
        this.likes = likes;
    }

    /**
     * @return The shareUrl
     */
    public String getShareUrl() {
        return shareUrl;
    }

    /**
     * @param shareUrl The share_url
     */
    public void setShareUrl(String shareUrl) {
        this.shareUrl = shareUrl;
    }

    /**
     * @return The sharePic
     */
    public String getSharePic() {
        return sharePic;
    }

    /**
     * @param sharePic The share_pic
     */
    public void setSharePic(String sharePic) {
        this.sharePic = sharePic;
    }

    /**
     * @return The islike
     */
    public Boolean getIslike() {
        return islike;
    }

    /**
     * @param islike The islike
     */
    public void setIslike(Boolean islike) {
        this.islike = islike;
    }

    /**
     * @return The activity
     */
    public Activity getActivity() {
        return activity;
    }

    /**
     * @param activity The activity
     */
    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    /**
     * @return The product
     */
    public List<Product> getProduct() {
        return product;
    }

    /**
     * @param product The product
     */
    public void setProduct(List<Product> product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "TopicData{" +
                "id='" + id + '\'' +
                ", category='" + category + '\'' +
                ", title='" + title + '\'' +
                ", desc='" + desc + '\'' +
                ", type='" + type + '\'' +
                ", pic='" + pic + '\'' +
                ", width='" + width + '\'' +
                ", height='" + height + '\'' +
                ", likes='" + likes + '\'' +
                ", shareUrl='" + shareUrl + '\'' +
                ", sharePic='" + sharePic + '\'' +
                ", islike=" + islike +
                ", activity=" + activity +
                ", product=" + product +
                '}';
    }
}