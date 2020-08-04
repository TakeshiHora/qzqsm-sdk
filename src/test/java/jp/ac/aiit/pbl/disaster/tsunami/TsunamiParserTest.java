package jp.ac.aiit.pbl.disaster.tsunami;

import static org.junit.Assert.*;

import jp.ac.aiit.pbl.disaster.DisasterCategory;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * This Class is Tsunami Parser Test.
 * To test that the parameter values ​​are properly parsed or not, according to the definition.
 */

public class TsunamiParserTest {
    
    @Test
    public void tsunamiParserTest(){
        TsunamiParser tsunamiParser = new TsunamiParser();
        Tsunami tsunami = tsunamiParser.parse(
                "110001101010110110101010110001010001011010000000000000011001010011001100011001111111011111111111111100011001001101111111111111000110010011011111101111110001100100" +
                        "1101111110111111000110010011011111101111110001100100000000000000");
        System.out.println(tsunami);
    }
    /**
     * (day:0) -> sameday as the Issueday
     */
    @Test
    public void inCaseOfValueOfDayIs0CanGetSameDateOfIssueDate(){
        TsunamiParser tsunamiParser = new TsunamiParser();
        Tsunami tsunami = tsunamiParser.parse("110001101010110110101010110001010001011010000000000000011001010011001100011001111111011111111111111100011001001101111111111111000110010011011111101111110001100100" +
                "1101111110111111000110010011011111101111110001100100000000000000");
        assertThat(tsunami.getTsunamiRegions().get(0).getExpectedArrivalDate().getDayOfMonth(), is(17));
    }
    /**
     * (day:1) -> Nextday after the Issueday
     */
    @Test
    public void inCaseOfValueOfDayIs1CanGetNextDateOfIssueDate(){
        TsunamiParser tsunamiParser = new TsunamiParser();
        Tsunami tsunami = tsunamiParser.parse("110001101010110110101010110001010001011010000000000000011001010011001100011001111111011111111111111100011001001101111111111111000110010011011111101111110001100100" +
                "1101111110111111000110010011011111101111110001100100000000000000");
        assertThat(tsunami.getTsunamiRegions().get(1).getExpectedArrivalDate().getDayOfMonth(), is(18));
    }
    /**
     * (hour:0 or minute:0) -> Year is 9999, UnknownNumber
     */
    @Test
    public void inCaseOfUnknownNumberOfHourCanGetUnknownYear(){
        TsunamiParser tsunamiParser = new TsunamiParser();
        Tsunami tsunami = tsunamiParser.parse("110001101010110110101010110001010001011010000000000000011001010011001100011001111111011111111111111100011001001101111111111111000110010011011111101111110001100100" +
                "1101111110111111000110010011011111101111110001100100000000000000");
        assertThat(tsunami.getTsunamiRegions().get(0).getExpectedArrivalDate().getYear(), is(9999));
    }
    /**
     * (hour:0) -> Hour is 0, UnknownNumber
     */
    @Test
    public void inCaseOfUnknownHourCanGetUnknownHour(){
        TsunamiParser tsunamiParser = new TsunamiParser();
        Tsunami tsunami = tsunamiParser.parse("110001101010110110101010110001010001011010000000000000011001010011001100011001111111011111111111111100011001001101111111111111000110010011011111101111110001100100" +
                "1101111110111111000110010011011111101111110001100100000000000000");
        assertThat(tsunami.getTsunamiRegions().get(0).getExpectedArrivalDate().getHour(), is(0));
    }
    /**
     * (hour:0-23)
     */
    @Test
    public void inCaseOfValueOfHourIs23CanGetHour23(){
        TsunamiParser tsunamiParser = new TsunamiParser();
        Tsunami tsunami = tsunamiParser.parse("110001101010110110101010110001010001011010000000000000011001010011001100011001111111011111111111111100011001001101111111111111000110010011011111101111110001100100" +
                "1101111110111111000110010011011111101111110001100100000000000000");
        assertThat(tsunami.getTsunamiRegions().get(2).getExpectedArrivalDate().getHour(), is(23));
    }
    /**
     * (minute:0) -> Minute is 0, UnknownNumber
     */
    @Test
    public void inCaseOfUnknownMinuteCanGetUnknownMinute(){
        TsunamiParser tsunamiParser = new TsunamiParser();
        Tsunami tsunami = tsunamiParser.parse("110001101010110110101010110001010001011010000000000000011001010011001100011001111111011111111111111100011001001101111111111111000110010011011111101111110001100100" +
                "1101111110111111000110010011011111101111110001100100000000000000");
        assertThat(tsunami.getTsunamiRegions().get(0).getExpectedArrivalDate().getMinute(), is(0));
    }
    /**
     * (hour:0 or minute:0) -> Year is 9999, UnknownNumber
     */
    @Test
    public void inCaseOfValueOfMinuteIs0CanGetUnknownYear(){
        TsunamiParser tsunamiParser = new TsunamiParser();
        Tsunami tsunami = tsunamiParser.parse("110001101010110110101010110001010001011010000000000000011001010011001100011001111111011111111111111100011001001101111111111111000110010011011111101111110001100100" +
                "1101111110111111000110010011011111101111110001100100000000000000");
        assertThat(tsunami.getTsunamiRegions().get(0).getExpectedArrivalDate().getYear(), is(9999));
    }
    /**
     * (minute:0-59)
     */
    @Test
    public void inCaseOfValueOfMinuteIs59CanGetMinute59(){
        TsunamiParser tsunamiParser = new TsunamiParser();
        Tsunami tsunami = tsunamiParser.parse("110001101010110110101010110001010001011010000000000000011001010011001100011001111111011111111111111100011001001101111111111111000110010011011111101111110001100100" +
                "1101111110111111000110010011011111101111110001100100000000000000");
        assertThat(tsunami.getTsunamiRegions().get(3).getExpectedArrivalDate().getMinute(), is(59));
    }
    
    @Test
    public void tsunamiDigitTest(){
        TsunamiParser tsunamiParser = new TsunamiParser();
        Tsunami tsunami = tsunamiParser.parse("110001101010110110101010110001010001011010000000000000011001010011001100011001111111011111111111111100011001001101111111111111000110010011011111101111110001100100" +
                "1101111110111111000110010011011111101111110001100100000000000000");
        assertThat(tsunami.getDisasterCategory(), is(DisasterCategory.Tsunami));
        assertThat(tsunami.getNotifications().size(), is(3));
        assertThat(tsunami.getWarningCode().getCode(), is(15));
        assertThat(tsunami.getTsunamiRegions().size(), is(5));
    }
}
