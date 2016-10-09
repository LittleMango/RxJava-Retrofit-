package mango.mango.rxjavaretrofitreview.Bean;

public class Boxlist {

    private String boxId;
    private String title;
    private String desc;
    private String pic;
    private String icon;
    private String count;
    private Boolean isDefault;
    private String width;
    private String height;

    public String getBoxId() {
        return boxId;
    }

    public void setBoxId(String boxId) {
        this.boxId = boxId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public Boolean getDefault() {
        return isDefault;
    }

    public void setDefault(Boolean aDefault) {
        isDefault = aDefault;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Boxlist{" +
                "boxId='" + boxId + '\'' +
                ", title='" + title + '\'' +
                ", desc='" + desc + '\'' +
                ", pic='" + pic + '\'' +
                ", icon='" + icon + '\'' +
                ", count='" + count + '\'' +
                ", isDefault=" + isDefault +
                ", width='" + width + '\'' +
                ", height='" + height + '\'' +
                '}';
    }
}