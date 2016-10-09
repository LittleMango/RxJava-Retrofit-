package mango.mango.rxjavaretrofitreview.Bean;

public class Pic {

    private String pic;
    private String width;
    private String height;

    /**
     *
     * @return
     * The pic
     */
    public String getPic() {
        return pic;
    }

    /**
     *
     * @param pic
     * The pic
     */
    public void setPic(String pic) {
        this.pic = pic;
    }

    /**
     *
     * @return
     * The width
     */
    public String getWidth() {
        return width;
    }

    /**
     *
     * @param width
     * The width
     */
    public void setWidth(String width) {
        this.width = width;
    }

    /**
     *
     * @return
     * The height
     */
    public String getHeight() {
        return height;
    }

    /**
     *
     * @param height
     * The height
     */
    public void setHeight(String height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Pic{" +
                "pic='" + pic + '\'' +
                ", width='" + width + '\'' +
                ", height='" + height + '\'' +
                '}';
    }
}