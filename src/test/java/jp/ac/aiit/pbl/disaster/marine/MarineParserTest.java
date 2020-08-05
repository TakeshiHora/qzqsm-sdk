package jp.ac.aiit.pbl.disaster.marine;

import jp.ac.aiit.pbl.disaster.DisasterCategory;
import jp.ac.aiit.pbl.disaster.prefix.InformationType;
import jp.ac.aiit.pbl.disaster.prefix.MessageType;
import jp.ac.aiit.pbl.disaster.prefix.Preamble;
import jp.ac.aiit.pbl.disaster.prefix.ReportClassification;
import org.junit.Test;

import java.time.LocalDateTime;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MarineParserTest {
    /**
     * Marine parser test
     * To verify if parse handling is performed as expected or not.
     * To verify if each parameter value is obtained as expected or not.
     */

    @Test
    public void MarineParser() {
        MarineParser parser = new MarineParser();
        Marine marine = parser.parse("0101001110101101111100101100010100010100000000000000010100010000000011101010001000000001110101000100000000111010100010000000011101010001000000001110101000100000000111010100010000000011101010001000000001110101000100000000111010100010000000011100111010100");
        assertThat(marine.getPrefix().getPreamble(),is(Preamble.PatternA));
        assertThat(marine.getPrefix().getReportClassification(),is(ReportClassification.Regular));
        assertThat(marine.getPrefix().getDisasterCategory(),is(DisasterCategory.Marine));
        assertThat(marine.getPrefix().getInformationType(),is(InformationType.Issue));
        assertThat(marine.getMessageType(),is(MessageType.MT43));
        assertThat(marine.getWarningCodeMarineForecastRegion().get(0).getWarningCode(),is(WarningCode.SeaWindAlert));
        assertThat(marine.getWarningCodeMarineForecastRegion().get(0).getMarineForecastRegion(),is(MarineForecastRegion.NihonKaiNorthernWest));
        assertThat(marine.getWarningCodeMarineForecastRegion().get(1).getWarningCode(),is(WarningCode.SeaWindAlert));
        assertThat(marine.getWarningCodeMarineForecastRegion().get(1).getMarineForecastRegion(),is(MarineForecastRegion.NihonKaiNorthernWest));
        assertThat(marine.getWarningCodeMarineForecastRegion().get(2).getWarningCode(),is(WarningCode.SeaWindAlert));
        assertThat(marine.getWarningCodeMarineForecastRegion().get(2).getMarineForecastRegion(),is(MarineForecastRegion.NihonKaiNorthernWest));
        assertThat(marine.getWarningCodeMarineForecastRegion().get(3).getWarningCode(),is(WarningCode.SeaWindAlert));
        assertThat(marine.getWarningCodeMarineForecastRegion().get(3).getMarineForecastRegion(),is(MarineForecastRegion.NihonKaiNorthernWest));
    }
}