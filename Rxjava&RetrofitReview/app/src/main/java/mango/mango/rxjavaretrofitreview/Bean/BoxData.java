package mango.mango.rxjavaretrofitreview.Bean;

import java.util.ArrayList;
import java.util.List;
public class BoxData {

    private List<Boxlist> boxlist = new ArrayList<Boxlist>();

    /**
     *
     * @return
     * The boxlist
     */
    public List<Boxlist> getBoxlist() {
        return boxlist;
    }

    /**
     *
     * @param boxlist
     * The boxlist
     */
    public void setBoxlist(List<Boxlist> boxlist) {
        this.boxlist = boxlist;
    }

    @Override
    public String toString() {
        return "BoxData{" +
                "boxlist=" + boxlist +
                '}';
    }
}