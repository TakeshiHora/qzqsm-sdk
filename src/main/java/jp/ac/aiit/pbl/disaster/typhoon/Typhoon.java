package jp.ac.aiit.pbl.disaster.typhoon;

import jp.ac.aiit.pbl.disaster.Disaster;
import jp.ac.aiit.pbl.disaster.DisasterCategory;
import jp.ac.aiit.pbl.disaster.prefix.MessageType;
import jp.ac.aiit.pbl.disaster.prefix.Prefix;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;

/**
 * Class for Typhoon disaster.
 * Typhoon situation, estimation and forecast.
 */
public class Typhoon implements Disaster {

    private Prefix prefix;
    private LocalDateTime referenceTime;
    private ZonedDateTime referenceTimeDayZone;
    private TypeOfReferenceTime typeOfReferenceTime;
    private int elapsedTimeFromReferenceTime;
    private int typhoonNumber;
    private ScaleCategory scaleCategory;
    private IntensityCategory intensityCategory;
    private boolean northLatitude;
    private double latitude;
    private boolean eastLongitude;
    private double longitude;
    private int centralPressure;
    private int maximumWindSpeed;
    private int maximumGustSpeed;

    public Prefix getPrefix() {
        return prefix;
    }

    public void setPrefix(Prefix prefix) {
        this.prefix = prefix;
    }

    public LocalDateTime getReferenceTime() {
        return referenceTime;
    }

    public TypeOfReferenceTime getTypeOfReferenceTime() {
        return typeOfReferenceTime;
    }

    public void setTypeOfReferenceTime(TypeOfReferenceTime typeOfReferenceTime) {
        this.typeOfReferenceTime = typeOfReferenceTime;
    }

    public int getElapsedTimeFromReferenceTime() {
        return elapsedTimeFromReferenceTime;
    }

    public void setElapsedTimeFromReferenceTime(int elapsedTimeFromReferenceTime) {
        this.elapsedTimeFromReferenceTime = elapsedTimeFromReferenceTime;
    }

    public int getTyphoonNumber() {
        return typhoonNumber;
    }

    public void setTyphoonNumber(int typhoonNumber) {
        this.typhoonNumber = typhoonNumber;
    }

    public ScaleCategory getScaleCategory() {
        return scaleCategory;
    }

    public void setScaleCategory(ScaleCategory scaleCategory) {
        this.scaleCategory = scaleCategory;
    }

    public IntensityCategory getIntensityCategory() {
        return intensityCategory;
    }

    public void setIntensityCategory(IntensityCategory intensityCategory) {
        this.intensityCategory = intensityCategory;
    }

    public boolean isNorthLatitude() {
        return northLatitude;
    }

    public boolean getNorthLatitude() {
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

    public boolean getEastLongitude() {
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

    public int getCentralPressure() {
        return centralPressure;
    }

    public void setCentralPressure(int centralPressure) {
        this.centralPressure = centralPressure;
    }

    public int getMaximumWindSpeed() {
        return maximumWindSpeed;
    }

    public void setMaximumWindSpeed(int maximumWindSpeed) {
        this.maximumWindSpeed = maximumWindSpeed;
    }

    public int getMaximumGustSpeed() {
        return maximumGustSpeed;
    }

    public void setMaximumGustSpeed(int maximumGustSpeed) {
        this.maximumGustSpeed = maximumGustSpeed;
    }

    public ZonedDateTime getReferenceTimeDate() {
        return referenceTimeDayZone;
    }

    public void setReferenceTimeDate(ZonedDateTime referenceTimeday) {
        this.referenceTimeDayZone = referenceTimeday;
        this.referenceTime = referenceTimeday.toLocalDateTime();
    }

    @Override
    public String toString() {
        return "Typhoon{" +
                "prefix=" + prefix +
                ", referenceTime=" + referenceTime +
                /*", referenceTimedayZone=" + referenceTimedayZone +*/
                ", typeofReferenceTime=" + typeOfReferenceTime +
                ", elapsedTimeFromReferenceTime=" + elapsedTimeFromReferenceTime +
                ", typhoonNumber=" + typhoonNumber +
                ", scaleCategory=" + scaleCategory +
                ", intensityCategory=" + intensityCategory +
                ", northLatitude=" + northLatitude +
                ", latitude=" + latitude +
                ", eastLongitude=" + eastLongitude +
                ", longitude=" + longitude +
                ", centralPressure=" + centralPressure +
                ", maximumWindSpeed=" + maximumWindSpeed +
                ", maximumGustSpeed=" + maximumGustSpeed +
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
