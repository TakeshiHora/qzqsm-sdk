package jp.ac.aiit.pbl.disaster.seismicIntensity;
import jp.ac.aiit.pbl.disaster.Disaster;
import jp.ac.aiit.pbl.disaster.DisasterCategory;
import jp.ac.aiit.pbl.disaster.prefix.MessageType;
import jp.ac.aiit.pbl.disaster.prefix.Prefix;

import java.time.LocalDateTime;
import java.util.List;

/*
This class is the information about the SeismicIntensity of the signals received from QZSS.
The contents are seismicIntensity when earthquake occurred each Prefectures.
 */

public class SeismicIntensity implements Disaster {
    
    private Prefix prefix;
    private LocalDateTime occurrenceTime;
    private List<SeismicIntensityRegion> regions;
    
    
    public List<SeismicIntensityRegion> getRegions() {
        return regions;
    }
    
    public void setRegions(List<SeismicIntensityRegion> regions) {
        this.regions = regions;
    }
    
    public LocalDateTime getOccurrenceTime() {
        return occurrenceTime;
    }
    
    public void setOccurrenceTime(LocalDateTime occurrenceTime) {
        this.occurrenceTime = occurrenceTime;
    }
    
    public void setPrefix(Prefix prefix) {
        this.prefix = prefix;
    }
    
    public Prefix getPrefix() {
        return prefix;
    }
    
    @Override
    public String toString() {
        return "SeismicIntensity{" +
                "prefix=" + prefix +
                ", occurrenceTime=" + occurrenceTime +
                ", regions=" + regions +
                '}';
    }
    
    @Override
    public MessageType getMessageType() {
        return prefix.getMessageType();
    }
    
    @Override
    public DisasterCategory getDisasterCategory() {
        return prefix.getDisasterCategory();
    }
}
