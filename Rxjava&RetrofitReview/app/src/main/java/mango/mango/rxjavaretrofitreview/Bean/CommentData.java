package mango.mango.rxjavaretrofitreview.Bean;

import java.util.ArrayList;
import java.util.List;
public class CommentData {

    private String id;
    private String conent;
    private Boolean iscomments;
    private Boolean islike;
    private Integer comments;
    private Integer likes;
    private Product product;
    private List<CommentsList> commentsList = new ArrayList<CommentsList>();
    private List<LikesList> likesList = new ArrayList<LikesList>();

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
     * The conent
     */
    public String getConent() {
        return conent;
    }

    /**
     *
     * @param conent
     * The conent
     */
    public void setConent(String conent) {
        this.conent = conent;
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
     * The comments
     */
    public Integer getComments() {
        return comments;
    }

    /**
     *
     * @param comments
     * The comments
     */
    public void setComments(Integer comments) {
        this.comments = comments;
    }

    /**
     *
     * @return
     * The likes
     */
    public Integer getLikes() {
        return likes;
    }

    /**
     *
     * @param likes
     * The likes
     */
    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    /**
     *
     * @return
     * The product
     */
    public Product getProduct() {
        return product;
    }

    /**
     *
     * @param product
     * The product
     */
    public void setProduct(Product product) {
        this.product = product;
    }

    /**
     *
     * @return
     * The commentsList
     */
    public List<CommentsList> getCommentsList() {
        return commentsList;
    }

    /**
     *
     * @param commentsList
     * The comments_list
     */
    public void setCommentsList(List<CommentsList> commentsList) {
        this.commentsList = commentsList;
    }

    /**
     *
     * @return
     * The likesList
     */
    public List<LikesList> getLikesList() {
        return likesList;
    }

    /**
     *
     * @param likesList
     * The likes_list
     */
    public void setLikesList(List<LikesList> likesList) {
        this.likesList = likesList;
    }

    @Override
    public String toString() {
        return "CommentData{" +
                "id='" + id + '\'' +
                ", conent='" + conent + '\'' +
                ", iscomments=" + iscomments +
                ", islike=" + islike +
                ", comments=" + comments +
                ", likes=" + likes +
                ", product=" + product +
                ", commentsList=" + commentsList +
                ", likesList=" + likesList +
                '}';
    }
}