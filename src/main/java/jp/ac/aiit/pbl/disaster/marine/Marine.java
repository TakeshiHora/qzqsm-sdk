package jp.ac.aiit.pbl.disaster.marine;
import jp.ac.aiit.pbl.disaster.Disaster;
import jp.ac.aiit.pbl.disaster.DisasterCategory;
import jp.ac.aiit.pbl.disaster.prefix.MessageType;
import jp.ac.aiit.pbl.disaster.prefix.Prefix;
import java.util.List;

/**
 * Class for Marine disaster.
 * It consists of Prefix, Warning Code and Marine Forecast Region.
 */
public class Marine implements Disaster {
    private Prefix prefix;
    private List<WarningCodeMarineForecastRegion> warningCodeMarineForecastRegion;

    public Prefix getPrefix() {
        return prefix;
    }

    public void setPrefix(Prefix prefix) {
        this.prefix = prefix;
    }

    public List<WarningCodeMarineForecastRegion> getWarningCodeMarineForecastRegion() {
        return warningCodeMarineForecastRegion;
    }

    public void setWarningCodeMarineForecastRegion(List<WarningCodeMarineForecastRegion> warningCodeMarineForecastRegion) {
        this.warningCodeMarineForecastRegion = warningCodeMarineForecastRegion;
    }

    @Override
    public String toString() {
        return "Marine{" +
                "prefix=" + prefix +
                ", warningCodeMarineForecastRegion=" + warningCodeMarineForecastRegion +
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
