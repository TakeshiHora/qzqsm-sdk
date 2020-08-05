package jp.ac.aiit.pbl.disaster.ashfall;

import jp.ac.aiit.pbl.disaster.DisasterCategory;
import jp.ac.aiit.pbl.disaster.prefix.InformationType;
import jp.ac.aiit.pbl.disaster.prefix.MessageType;
import jp.ac.aiit.pbl.disaster.prefix.Preamble;
import jp.ac.aiit.pbl.disaster.prefix.ReportClassification;
import jp.ac.aiit.pbl.disaster.volcano.LocalGovernment;
import jp.ac.aiit.pbl.disaster.volcano.VolcanoName;
import org.junit.Test;

import java.time.LocalDateTime;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * AshFall parser test
 * To verify if parse handling is performed as expected or not.
 * To verify if each parameter value is obtained as expected or not.
 */
public class AshFallParserTest {

    @Test
    public void parseTest() {
        AshFallParser parser = new AshFallParser();
        AshFall ashFall = parser.parse("0101001110101101110010101100010100010100000000000000010100010000000010000111000011000101000000101001010110111000001010000001010010101101110000010100000010100101011011100000101000000101001010110111000111000101001010111010100");
        assertThat(ashFall.getPrefix().getPreamble(),is(Preamble.PatternA));
        assertThat(ashFall.getPrefix().getMessageType(),is(MessageType.MT43));
        assertThat(ashFall.getPrefix().getReportClassification(),is(ReportClassification.Regular));
        assertThat(ashFall.getPrefix().getDisasterCategory(),is(DisasterCategory.AshFall));
        assertThat(ashFall.getPrefix().getInformationType(),is(InformationType.Issue));
        assertThat(ashFall.getActivityTime(),is(LocalDateTime.of(2020,8,10,4,00)));
        assertThat(ashFall.getWarningtype(),is(WarningType.AshFallForecastDetailed));
        assertThat(ashFall.getVolcanoName(),is(VolcanoName.NewActiveVolcano));
        assertThat(ashFall.getAshFallTimeWarningCodeLocalGovernments().get(0).getExpectedAshFall(),is(1));
        assertThat(ashFall.getAshFallTimeWarningCodeLocalGovernments().get(0).getWarningCode(),is(WarningCode.MediumAshFall));
        assertThat(ashFall.getAshFallTimeWarningCodeLocalGovernments().get(0).getLocalGovernment(),is(LocalGovernment.HokkaidoRausucho));
        assertThat(ashFall.getAshFallTimeWarningCodeLocalGovernments().get(1).getExpectedAshFall(),is(1));
        assertThat(ashFall.getAshFallTimeWarningCodeLocalGovernments().get(1).getWarningCode(),is(WarningCode.MediumAshFall));
        assertThat(ashFall.getAshFallTimeWarningCodeLocalGovernments().get(1).getLocalGovernment(),is(LocalGovernment.HokkaidoRausucho));
        assertThat(ashFall.getAshFallTimeWarningCodeLocalGovernments().get(2).getExpectedAshFall(),is(1));
        assertThat(ashFall.getAshFallTimeWarningCodeLocalGovernments().get(2).getWarningCode(),is(WarningCode.MediumAshFall));
        assertThat(ashFall.getAshFallTimeWarningCodeLocalGovernments().get(2).getLocalGovernment(),is(LocalGovernment.HokkaidoRausucho));
        assertThat(ashFall.getAshFallTimeWarningCodeLocalGovernments().get(3).getExpectedAshFall(),is(1));
        assertThat(ashFall.getAshFallTimeWarningCodeLocalGovernments().get(3).getWarningCode(),is(WarningCode.MediumAshFall));
        assertThat(ashFall.getAshFallTimeWarningCodeLocalGovernments().get(3).getLocalGovernment(),is(LocalGovernment.HokkaidoRausucho));


    }

}
