package jp.ac.aiit.pbl.disaster.earthquakeearlywarning;

import jp.ac.aiit.pbl.disaster.Disaster;
import jp.ac.aiit.pbl.disaster.DisasterCategory;
import jp.ac.aiit.pbl.disaster.hypocenter.SeismicEpicenter;
import jp.ac.aiit.pbl.disaster.prefix.MessageType;
import jp.ac.aiit.pbl.disaster.prefix.Prefix;

import java.time.LocalDateTime;
import java.util.List;

/**
 * This class is the information of Earthquake Early Warning transmitted by QZSS.
 * It has properties about disaster region, magnitude and seismic intensity etc.
 * And It provides setter/getter of their properties.
 */

public class EarthquakeEarlyWarning implements Disaster {
    private Prefix prefix;
    private List<Notification> notifications;
    private LocalDateTime occurrenceTimeOfEarthquake;
    private int depthOfSeismicEpicenter;
    private double magnitude;
    private SeismicEpicenter seismicEpicenter;
    private SeismicIntensityLowerLimit seismicIntensityLowerLimit;
    private SeismicIntensityUpperLimit seismicIntensityUpperLimit;
    private List<ForecastRegionEarthquakeEarlyWarning> forecastRegionEarthquakeEarlyWarnings;

    public Prefix getPrefix() {
        return prefix;
    }

    public void setPrefix(Prefix prefix) {
        this.prefix = prefix;
    }

    public List<Notification> getNotifications() {
        return notifications;
    }

    public void setNotifications(List<Notification> notifications) {
        this.notifications = notifications;
    }

    public LocalDateTime getOccurrenceTimeOfEarthquake() {
        return occurrenceTimeOfEarthquake;
    }

    public void setOccurrenceTimeOfEarthquake(LocalDateTime occurrenceTimeOfEarthquake) {
        this.occurrenceTimeOfEarthquake = occurrenceTimeOfEarthquake;
    }

    public int getDepthOfSeismicEpicenter() {
        return depthOfSeismicEpicenter;
    }

    public void setDepthOfSeismicEpicenter(int depthOfSeismicEpicenter) {
        this.depthOfSeismicEpicenter = depthOfSeismicEpicenter;
    }

    public double getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(double magnitude) {
        this.magnitude = magnitude;
    }

    public SeismicEpicenter getSeismicEpicenter() {
        return seismicEpicenter;
    }

    public void setSeismicEpicenter(SeismicEpicenter seismicEpicenter) {
        this.seismicEpicenter = seismicEpicenter;
    }

    public SeismicIntensityLowerLimit getSeismicIntensityLowerLimit() {
        return seismicIntensityLowerLimit;
    }

    public void setSeismicIntensityLowerLimit(SeismicIntensityLowerLimit seismicIntensityLowerLimit) {
        this.seismicIntensityLowerLimit = seismicIntensityLowerLimit;
    }

    public SeismicIntensityUpperLimit getSeismicIntensityUpperLimit() {
        return seismicIntensityUpperLimit;
    }

    public void setSeismicIntensityUpperLimit(SeismicIntensityUpperLimit seismicIntensityUpperLimit) {
        this.seismicIntensityUpperLimit = seismicIntensityUpperLimit;
    }

    public List<ForecastRegionEarthquakeEarlyWarning> getForecastRegionEarthquakeEarlyWarning() {
        return forecastRegionEarthquakeEarlyWarnings;
    }

    public void setForecastRegionEarthquakeEarlyWarning(List<ForecastRegionEarthquakeEarlyWarning> forecastRegionEarthquakeEarlyWarnings) {
        this.forecastRegionEarthquakeEarlyWarnings = forecastRegionEarthquakeEarlyWarnings;
    }

    @Override
    public String toString() {
        return "{" +
                "    \"EarthquakeEarlyWarning\": {" +
                "        \"prefix\": " + prefix + "," +
                "        \"notification\": " + notifications + "," +
                "        \"occurrenceTimeOfEarthquake\": " + occurrenceTimeOfEarthquake + "," +
                "        \"depthOfSeismicEpicenter\": " + depthOfSeismicEpicenter + "," +
                "        \"seismicEpicenter\": " + seismicEpicenter + "," +
                "        \"seismicIntensityLowerLimit\": " + seismicIntensityLowerLimit + "," +
                "        \"seismicIntensityUpperLimit\": " + seismicIntensityUpperLimit + "," +
                "        \"forecastRegionEarthquakeEarlyWarning\": " + forecastRegionEarthquakeEarlyWarnings + "," +
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
