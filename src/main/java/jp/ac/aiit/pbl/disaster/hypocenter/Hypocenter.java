package jp.ac.aiit.pbl.disaster.hypocenter;

import jp.ac.aiit.pbl.disaster.Disaster;
import jp.ac.aiit.pbl.disaster.DisasterCategory;
import jp.ac.aiit.pbl.disaster.earthquakeearlywarning.Notification;
import jp.ac.aiit.pbl.disaster.prefix.MessageType;
import jp.ac.aiit.pbl.disaster.prefix.Prefix;

import java.time.LocalDateTime;
import java.util.List;
/*
This class is the information about the Hypocenter of the signals received from QZSS.
It has the properties of the region where the earthquake occurred.
The contents are the notification when it occurred, and the latitude and longitude,
magnitude and depthOfHypocenter.
 */
public class Hypocenter implements Disaster {
    private Prefix prefix;
    private List<Notification> notifications;
    private LocalDateTime occurrenceTimeOfEarthquake;
    private int depthOfHypocenter;
    private double magnitude;
    private SeismicEpicenter seismicEpicenter;
    private boolean northLatitude;
    private double latitude;
    private boolean eastLongitude;
    private double longitude;
    
    
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
    
    public int getDepthOfHypocenter() {
        return depthOfHypocenter;
    }
    
    public void setDepthOfHypocenter(int depthOfHypocenter) {
        this.depthOfHypocenter = depthOfHypocenter;
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
    
    public boolean isNorthLatitude() {
        return northLatitude;
    }
    
    public void setNorthLatitude(boolean northLatitude) {
        this.northLatitude = northLatitude;
    }
    
    public double getLatitude() {
        return latitude;
    }
    
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
    
    public boolean isEastLongitude() {
        return eastLongitude;
    }
    
    public void setEastLongitude(boolean eastLongitude) {
        this.eastLongitude = eastLongitude;
    }
    
    public double getLongitude() {
        return longitude;
    }
    
    public void setLongitude(double longitude) {
        this.longitude = longitude;
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

    @Override
    public String toString() {
        return "Hypocenter{" +
                "prefix=" + prefix +
                ", notifications=" + notifications +
                ", occurrenceTimeOfEarthquake=" + occurrenceTimeOfEarthquake +
                ", depthOfHypocenter=" + depthOfHypocenter +
                ", magnitude=" + magnitude +
                ", SeismicEpicenter=" + seismicEpicenter +
                ", northLatitude=" + northLatitude +
                ", latitude=" + latitude +
                ", eastLongitude=" + eastLongitude +
                ", longitude=" + longitude +
                '}';
    }
}
