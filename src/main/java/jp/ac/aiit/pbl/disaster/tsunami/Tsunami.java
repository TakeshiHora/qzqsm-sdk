package jp.ac.aiit.pbl.disaster.tsunami;

import jp.ac.aiit.pbl.disaster.Disaster;
import jp.ac.aiit.pbl.disaster.DisasterCategory;
import jp.ac.aiit.pbl.disaster.earthquakeearlywarning.Notification;
import jp.ac.aiit.pbl.disaster.prefix.MessageType;
import jp.ac.aiit.pbl.disaster.prefix.Prefix;

import java.util.List;

/*
This class is the information about the Tsunami of the signals received from QZSS.
The contents are the notification when earthquake occurred, and the height of the tsunami,
the type of warning, the tsunami forecast area, and the estimated arrival time when the tsunami occurs.
 */

public class Tsunami implements Disaster {
    private Prefix prefix;
    private List<Notification> notifications;
    private WarningCode warningCode;
    private List<TsunamiRegion> tsunamiRegions;

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
    
    public WarningCode getWarningCode() {
        return warningCode;
    }
    
    public void setWarningCode(WarningCode warningCode) {
        this.warningCode = warningCode;
    }
    
    public List<TsunamiRegion> getTsunamiRegions() {
        return tsunamiRegions;
    }
    
    public void setTsunamiRegions(List<TsunamiRegion> tsunamiRegions) {
        this.tsunamiRegions = tsunamiRegions;
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
        return "Tsunami{" +
                "prefix=" + prefix +
                ", notifications=" + notifications +
                ", warningCode=" + warningCode +
                ", tsunamiRegions=" + tsunamiRegions +
                '}';
    }
}
