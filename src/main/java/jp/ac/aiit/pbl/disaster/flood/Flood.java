package jp.ac.aiit.pbl.disaster.flood;

import jp.ac.aiit.pbl.disaster.Disaster;
import jp.ac.aiit.pbl.disaster.DisasterCategory;
import jp.ac.aiit.pbl.disaster.prefix.MessageType;
import jp.ac.aiit.pbl.disaster.prefix.Prefix;

import java.util.List;

/**
 * This class is the information of Flood transmitted by QZSS.
 * It has properties about disaster Warning level and forecast region, etc.
 * And It provides setter/getter of their properties.
 */

public class Flood implements Disaster {
    private Prefix prefix;
    private List<FloodWarningLevelAndForecastRegion> floodWarningLevelAndForecastRegions;

    public Prefix getPrefix() {
        return prefix;
    }

    public void setPrefix(Prefix prefix) {
        this.prefix = prefix;
    }

    public List<FloodWarningLevelAndForecastRegion> getFloodWarningLevelAndForecastRegion() {
        return floodWarningLevelAndForecastRegions;
    }

    public void setFloodWarningLevelAndForecastRegion(List<FloodWarningLevelAndForecastRegion> floodWarningLevelAndForecastRegions) {
        this.floodWarningLevelAndForecastRegions = floodWarningLevelAndForecastRegions;
    }

    @Override
    public String toString() {
        return "{" +
                "    \"Flood\": {" +
                "        \"prefix\": " + prefix + "," +
                "        \"WarningLevelRegion1\": " + floodWarningLevelAndForecastRegions.get(0).getWarningLevel() + "," +
                "        \"ForecastRegionRegion1\": " + floodWarningLevelAndForecastRegions.get(0).getFloodForecastRegion() + "," +
                "    }" +
                "}";
    }

    @Override
    public MessageType getMessageType() {
        return prefix.getMessageType();
    }

    @Override
    public DisasterCategory getDisasterCategory() {
        return prefix.getDisasterCategory();
    }

    @Override
    public Prefix getDisasterPrefix() {
        return this.getPrefix();
    }
}
