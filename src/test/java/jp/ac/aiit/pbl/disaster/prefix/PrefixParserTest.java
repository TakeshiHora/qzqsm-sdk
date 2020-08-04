package jp.ac.aiit.pbl.disaster.prefix;

import jp.ac.aiit.pbl.disaster.DisasterCategory;
import jp.ac.aiit.pbl.disaster.prefix.Prefix;
import jp.ac.aiit.pbl.disaster.prefix.PrefixParser;
import org.junit.Test;

import java.time.LocalDateTime;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class PrefixParserTest {
    /**
     * Case of Marine
     */
    @Test
    public void inCaseOfParsingMarine(){
        PrefixParser parser = new PrefixParser();
        Prefix prefix = parser.parse("1001101010101101111100101100010100010001100000000000001011000011111100100101");
        assertThat(prefix.getPreamble(),is(Preamble.PatternB));
        assertThat(prefix.getMessageType(),is(MessageType.MT43));
        assertThat(prefix.getReportClassification(),is(ReportClassification.Regular));
        assertThat(prefix.getDisasterCategory(),is(DisasterCategory.Marine));
        assertThat(prefix.getReportTime(),is(LocalDateTime.of(2020,5,17,8,35)));
        assertThat(prefix.getInformationType(),is(InformationType.Issue));
        assertThat(prefix.getSpare1(),is("0000000000"));
    }

    /**
     * Case of AshFall
     */
    @Test
    public  void inCaseOfParsingAshFall(){
        PrefixParser parser = new PrefixParser();
        Prefix prefix = parser.parse("0101001110101101110010101100010100010100000000000000010100010000000010000111");
        assertThat(prefix.getPreamble(),is(Preamble.PatternA));
        assertThat(prefix.getMessageType(),is(MessageType.MT43));
        assertThat(prefix.getReportClassification(),is(ReportClassification.Regular));
        assertThat(prefix.getDisasterCategory(),is(DisasterCategory.AshFall));
        assertThat(prefix.getReportTime(),is(LocalDateTime.of(2020,5,17,8,40)));
        assertThat(prefix.getInformationType(),is(InformationType.Issue));
        assertThat(prefix.getSpare1(),is("0000000000"));
    }

    /**
     * Case of EarthQuakeEarlyWarning
     */
    @Test
    public void inCaseOfParsingEarthQuakeEarlyWarning(){
        PrefixParser parser = new PrefixParser();
        Prefix prefix = parser.parse("1001101010101111100010111010100000100000000000000000000110010100000000000000");
        assertThat(prefix.getPreamble(),is(Preamble.PatternB));
        assertThat(prefix.getMessageType(),is(MessageType.MT43));
        assertThat(prefix.getReportClassification(),is(ReportClassification.TrainingTest));
        assertThat(prefix.getDisasterCategory(),is(DisasterCategory.EarthquakeEarlyWarning));
        assertThat(prefix.getReportTime(),is(LocalDateTime.of(2020,7,10,1,0)));
        assertThat(prefix.getInformationType(),is(InformationType.Issue));
        assertThat(prefix.getSpare1(),is("0000000000"));
    }

    /**
     * Case of Flood
     */
    @Test
    public void inCaseOfParsingFlood(){
        PrefixParser parser = new PrefixParser();
        Prefix prefix = parser.parse("1100011010101101010110111111000001101111000000000000000100001000001001100101");
        assertThat(prefix.getPreamble(),is(Preamble.PatternC));
        assertThat(prefix.getMessageType(),is(MessageType.MT43));
        assertThat(prefix.getReportClassification(),is(ReportClassification.Priority));
        assertThat(prefix.getDisasterCategory(),is(DisasterCategory.Flood));
        assertThat(prefix.getReportTime(),is(LocalDateTime.of(2020,7,28,3,30)));
        assertThat(prefix.getInformationType(),is(InformationType.Issue));
        assertThat(prefix.getSpare1(),is("0000000000"));
     }
}
