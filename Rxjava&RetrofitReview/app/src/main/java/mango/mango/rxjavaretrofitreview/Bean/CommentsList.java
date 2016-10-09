package mango.mango.rxjavaretrofitreview.Bean;

public class CommentsList {

    private String id;
    private String userId;
    private String username;
    private String avatar;
    private String conent;
    private String dateline;
    private String datestr;
    private String praise;
    private String replys;
    private Boolean isPraise;
    private Boolean isHot;
    private AtUser atUser;
    private Integer isOfficial;

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
     * The userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     *
     * @param userId
     * The user_id
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     *
     * @return
     * The username
     */
    public String getUsername() {
        return username;
    }

    /**
     *
     * @param username
     * The username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     *
     * @return
     * The avatar
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     *
     * @param avatar
     * The avatar
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
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
     * The dateline
     */
    public String getDateline() {
        return dateline;
    }

    /**
     *
     * @param dateline
     * The dateline
     */
    public void setDateline(String dateline) {
        this.dateline = dateline;
    }

    /**
     *
     * @return
     * The datestr
     */
    public String getDatestr() {
        return datestr;
    }

    /**
     *
     * @param datestr
     * The datestr
     */
    public void setDatestr(String datestr) {
        this.datestr = datestr;
    }

    /**
     *
     * @return
     * The praise
     */
    public String getPraise() {
        return praise;
    }

    /**
     *
     * @param praise
     * The praise
     */
    public void setPraise(String praise) {
        this.praise = praise;
    }

    /**
     *
     * @return
     * The replys
     */
    public String getReplys() {
        return replys;
    }

    /**
     *
     * @param replys
     * The replys
     */
    public void setReplys(String replys) {
        this.replys = replys;
    }

    /**
     *
     * @return
     * The isPraise
     */
    public Boolean getIsPraise() {
        return isPraise;
    }

    /**
     *
     * @param isPraise
     * The is_praise
     */
    public void setIsPraise(Boolean isPraise) {
        this.isPraise = isPraise;
    }

    /**
     *
     * @return
     * The isHot
     */
    public Boolean getIsHot() {
        return isHot;
    }

    /**
     *
     * @param isHot
     * The is_hot
     */
    public void setIsHot(Boolean isHot) {
        this.isHot = isHot;
    }

    /**
     *
     * @return
     * The atUser
     */
    public AtUser getAtUser() {
        return atUser;
    }

    /**
     *
     * @param atUser
     * The at_user
     */
    public void setAtUser(AtUser atUser) {
        this.atUser = atUser;
    }

    /**
     *
     * @return
     * The isOfficial
     */
    public Integer getIsOfficial() {
        return isOfficial;
    }

    /**
     *
     * @param isOfficial
     * The is_official
     */
    public void setIsOfficial(Integer isOfficial) {
        this.isOfficial = isOfficial;
    }

    @Override
    public String toString() {
        return "CommentsList{" +
                "id='" + id + '\'' +
                ", userId='" + userId + '\'' +
                ", username='" + username + '\'' +
                ", avatar='" + avatar + '\'' +
                ", conent='" + conent + '\'' +
                ", dateline='" + dateline + '\'' +
                ", datestr='" + datestr + '\'' +
                ", praise='" + praise + '\'' +
                ", replys='" + replys + '\'' +
                ", isPraise=" + isPraise +
                ", isHot=" + isHot +
                ", atUser=" + atUser +
                ", isOfficial=" + isOfficial +
                '}';
    }
}