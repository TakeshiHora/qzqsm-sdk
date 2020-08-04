package jp.ac.aiit.pbl.disaster.volcano;
import jp.ac.aiit.pbl.disaster.DisasterCategory;
import jp.ac.aiit.pbl.disaster.prefix.InformationType;
import jp.ac.aiit.pbl.disaster.prefix.MessageType;
import jp.ac.aiit.pbl.disaster.prefix.Preamble;
import jp.ac.aiit.pbl.disaster.prefix.ReportClassification;
import org.junit.Test;

import java.time.LocalDateTime;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class VolcanoParserTest {
    /**
     * Volcano parser test
     * To verify if parse handling is performed as expected or not.
     * To verify if each parameter value is obtained as expected or not.
     */
        @Test
        public void parseTest(){
            VolcanoParser parser = new VolcanoParser();
            Volcano volcano = parser.parse("010100111010110111000010110001010001010000000000000001010001000000001000000100000110010100000101000101100101100000001010001011001011000000010100010110010110000000101000101100101100000001010001011001011000000000000000000100000001111000101001010111010100");
            assertThat(volcano.getPrefix().getPreamble(),is(Preamble.PatternA));
            assertThat(volcano.getPrefix().getReportClassification(),is(ReportClassification.Regular));
            assertThat(volcano.getPrefix().getDisasterCategory(),is(DisasterCategory.Volcano));
            assertThat(volcano.getPrefix().getInformationType(),is(InformationType.Issue));
            assertThat(volcano.getMessageType(),is(MessageType.MT43));
            assertThat(volcano.getActivityTime(),is(LocalDateTime.of(2020,8,10,4,0)));
            assertThat(volcano.getVolcanoName(),is(VolcanoName.Shiretokoiozan));
            assertThat(volcano.getWarningCode(),is(WarningCode.EruptionWarning));
            assertThat(volcano.getLocalGovernments().get(0),is(LocalGovernment.HokkaidoTsuruimura));
            assertThat(volcano.getLocalGovernments().get(1),is(LocalGovernment.HokkaidoTsuruimura));
            assertThat(volcano.getLocalGovernments().get(2),is(LocalGovernment.HokkaidoTsuruimura));
            assertThat(volcano.getLocalGovernments().get(3),is(LocalGovernment.HokkaidoTsuruimura));
        }
    }
