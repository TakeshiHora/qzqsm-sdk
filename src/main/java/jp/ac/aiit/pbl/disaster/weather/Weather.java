package jp.ac.aiit.pbl.disaster.weather;

import jp.ac.aiit.pbl.disaster.Disaster;
import jp.ac.aiit.pbl.disaster.DisasterCategory;
import jp.ac.aiit.pbl.disaster.prefix.MessageType;
import jp.ac.aiit.pbl.disaster.prefix.Prefix;

import java.util.List;

public class Weather implements Disaster {

    private Prefix prefix;

    private WarningState warningState;

    private List<WeatherSubcategoryAndRegion> weatherSubcategoryAndRegions;

    public Prefix getPrefix() {
        return prefix;
    }

    public void setPrefix(Prefix prefix) {
        this.prefix = prefix;
    }

    public WarningState getWarningState() {
        return warningState;
    }
    public void setWarningState(WarningState warningState) {
        this.warningState = warningState;
    }

    public List<WeatherSubcategoryAndRegion> getWeatherSubcategoryAndRegions() {
        return weatherSubcategoryAndRegions;
    }
    public void setWeatherSubcategoryAndRegions(List<WeatherSubcategoryAndRegion> weatherSubcategoryAndRegions) {
        this.weatherSubcategoryAndRegions = weatherSubcategoryAndRegions;
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