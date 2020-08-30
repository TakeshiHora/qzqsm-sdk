package jp.ac.aiit.pbl.disaster.volcano;
import jp.ac.aiit.pbl.disaster.Disaster;
import jp.ac.aiit.pbl.disaster.DisasterCategory;
import jp.ac.aiit.pbl.disaster.prefix.MessageType;
import jp.ac.aiit.pbl.disaster.prefix.Prefix;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Class for Volcano parser.
 * It consists of Prefix, Activity time, Warning Code, Volcano Name and Local Government.
 */

public class Volcano implements Disaster {
    private Prefix prefix;

    private LocalDateTime activityTime;                     //Activity Time(Td)Day(D1)  Hour(H1) Minute(M1)

    private WarningCode warningCode;                 //Warning Code(Dw)

    private VolcanoName volcanoName;                        //Volcano Name(Vo)

    private List<LocalGovernment> localGovernments;

    public Prefix getPrefix() {
        return prefix;
    }

    public void setPrefix(Prefix prefix) {
        this.prefix = prefix;
    }

    public LocalDateTime getActivityTime() {
        return activityTime;
    }
    public void setActivityTime(LocalDateTime activityTime) {
        this.activityTime = activityTime;
    }
    public WarningCode getWarningCode() {
        return warningCode;
    }
    public void setWarningCode(WarningCode warningCode) {
        this.warningCode = warningCode;
    }
    public VolcanoName getVolcanoName() {
        return volcanoName;
    }
    public void setVolcanoName(VolcanoName volcanoName) {
        this.volcanoName = volcanoName;
    }

    public List<LocalGovernment> getLocalGovernments() {
        return localGovernments;
    }

    public void setLocalGovernments(List<LocalGovernment> localGovernments) {
        this.localGovernments = localGovernments;
    }

    @Override
    public String toString() {
        return "Volcano{" +
                "prefix=" + prefix +
                ", activityTime=" + activityTime +
                ", warningCode=" + warningCode +
                ", volcanoName=" + volcanoName +
                ", localGovernments=" + localGovernments +
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

    @Override
    public Prefix getDisasterPrefix() {
        return this.getPrefix();
    }
}