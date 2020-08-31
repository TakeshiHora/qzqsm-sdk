package jp.ac.aiit.pbl.disaster.nankaiTroughEarthquake;

import jp.ac.aiit.pbl.disaster.Disaster;
import jp.ac.aiit.pbl.disaster.DisasterCategory;
import jp.ac.aiit.pbl.disaster.prefix.MessageType;
import jp.ac.aiit.pbl.disaster.prefix.Prefix;

/**
 * Class for NankaiTroughEarthquake disaster.
 * NankaiTroughEarthquake "Information on earthquake active status etc."
 * Character information(getText() please.), one page (6 characters) in up to 63 pages in total.
 */
public class NankaiTroughEarthquake implements Disaster {
    private Prefix prefix;
    private String text;
    private int pageNumber;
    private int totalPage;

    public Prefix getPrefix() {
        return prefix;
    }

    public void setPrefix(Prefix prefix) {
        this.prefix = prefix;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    @Override
    public String toString() {
        return "NankaiTroughEarthquake{" +
                "prefix=" + prefix +
                ", text='" + text + '\'' +
                ", pageNumber=" + pageNumber +
                ", totalPage=" + totalPage +
                '}';
    }

    @Override
    public MessageType getMessageType() {
        return this.prefix.getMessageType();
    }

    @Override
    public DisasterCategory getDisasterCategory() {
        return this.prefix.getDisasterCategory();
    }
}
