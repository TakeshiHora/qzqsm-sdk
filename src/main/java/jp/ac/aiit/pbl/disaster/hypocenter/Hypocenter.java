package jp.ac.aiit.pbl.disaster.hypocenter;

import jp.ac.aiit.pbl.*;

import java.time.LocalDateTime;
import java.util.List;
/*
This class holds the converted information about the Hypocenter of the signals received from QZSS.
It retains the information of the region where the earthquake occurred,
the content of the notification when it occurred, and the latitude and longitude.
 */
public class Hypocenter implements Disaster {
    private Prefix prefix;
    private List<Notification> notifications;
    private LocalDateTime occurrenceTimeOfEarthquake;
    private int depthOfHypocenter;
    private int magnitude;
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
    
    public int getMagnitude() {
        return magnitude;
    }
    
    public void setMagnitude(int magnitude) {
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
        return null;
    }
    
    @Override
    public DisasterCategory getDisasterCategory() {
        return null;
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
