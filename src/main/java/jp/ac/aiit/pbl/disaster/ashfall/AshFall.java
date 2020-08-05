package jp.ac.aiit.pbl.disaster.ashfall;

import jp.ac.aiit.pbl.disaster.Disaster;
import jp.ac.aiit.pbl.disaster.DisasterCategory;
import jp.ac.aiit.pbl.disaster.prefix.MessageType;
import jp.ac.aiit.pbl.disaster.prefix.Prefix;
import jp.ac.aiit.pbl.disaster.volcano.VolcanoName;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Class for Ash fall disaster.
 * It consists of Activity Time, Warning Type, Volcano Name, Expected Ash Fall time, Warning Code and Local Government.
 */

public class AshFall implements Disaster {
    private Prefix prefix;
    private LocalDateTime activityTime;                     //Activity Time(Td)Day(D1)  Hour(H1) Minute(M1)
    private WarningType warningtype;                        //WWarning Type(Dw1)
    private VolcanoName volcanoName;                        //Volcano Name(Vo)
    private List<AshFallTimeWarningCodeLocalGovernment> ashFallTimeWarningCodeLocalGovernments;

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

    public WarningType getWarningtype() {
        return warningtype;
    }

    public void setWarningtype(WarningType warningtype) {
        this.warningtype = warningtype;
    }

    public VolcanoName getVolcanoName() {
        return volcanoName;
    }

    public void setVolcanoName(VolcanoName volcanoName) {
        this.volcanoName = volcanoName;
    }

    public List<AshFallTimeWarningCodeLocalGovernment> getAshFallTimeWarningCodeLocalGovernments() {
        return ashFallTimeWarningCodeLocalGovernments;
    }

    public void setAshFallTimeWarningCodeLocalGovernments(List<AshFallTimeWarningCodeLocalGovernment> ashFallTimeWarningCodeLocalGovernments) {
        this.ashFallTimeWarningCodeLocalGovernments = ashFallTimeWarningCodeLocalGovernments;
    }

    @Override
    public String toString() {
        return "AshFalll{" +
                "prefix=" + prefix +
                ", activityTime=" + activityTime +
                ", warningtype=" + warningtype +
                ", volcanoName=" + volcanoName +
                ", AshFallTimeWarningCodeLocalGovernments=" + ashFallTimeWarningCodeLocalGovernments +
                '}';
    }

    @Override
    public MessageType getMessageType() {
        return null;
    }

    @Override
    public DisasterCategory getDisasterCategory() {
        return null;
    }
}

