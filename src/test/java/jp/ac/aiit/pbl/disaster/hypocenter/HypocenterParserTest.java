package jp.ac.aiit.pbl.disaster.hypocenter;

import jp.ac.aiit.pbl.disaster.DisasterCategory;
import jp.ac.aiit.pbl.disaster.earthquakeearlywarning.Notification;
import jp.ac.aiit.pbl.disaster.hypocenter.Hypocenter;
import jp.ac.aiit.pbl.disaster.hypocenter.HypocenterParser;
import org.junit.Test;

import java.time.LocalDateTime;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * This Class is Hypocenter parser test.
 * To test that the parameter values ​​are properly parsed or not, according to the definition.
 */

public class HypocenterParserTest {
    
    @Test
    public void hypocenterParserTest() {
        HypocenterParser hypocenterParser = new HypocenterParser();
    
        Hypocenter hypocenter = hypocenterParser.parse("1100011010101101100100101100010100010110100000000000000110010100110011000110011101011000100011101111101011100101000000101111011001111011111011010110011111011111011000000000000000000000000000000000000000000000000000000000000000");
        System.out.println(hypocenter);
    }
    
    /**
     * lad (degree:89, minute:59, second:59)
     * lon (degree:179, minute:59, second:59)
     */
    @Test
    public void inCaseOfMaxValueOfLatLon(){
        HypocenterParser hypocenterParser = new HypocenterParser();
        Hypocenter hypocenter = hypocenterParser.parse("1100011010101101100100101100010100010110100000000000000110010100110011000110011101011000100011101111101011100101000000101111011001111011111011010110011111011111011000000000000000000000000000000000000000000000000000000000000000");
    
        assertThat(hypocenter.getLatitude(), is(89.99972222222222));
        assertThat(hypocenter.getLongitude(), is(179.9997222222222));
    }
    
    /**
     * lad (degree:0, minute:0, second:0)
     * lon (degree:0, minute:0, second:0)
     */
    @Test
    public void inCaseOfMinValueOfLatLon(){
        HypocenterParser hypocenterParser = new HypocenterParser();
        Hypocenter hypocenter = hypocenterParser.parse("1100011010101101100100101100010100010110100000000000000110010100110011000110011101011000100011101111101011100101000000101110000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
        
        assertThat(hypocenter.getLatitude(), is(0.0));
        assertThat(hypocenter.getLongitude(), is(0.0));
    }
    
    /**
     * lad (degree:30, minute:30, second:30)
     * lon (degree:30, minute:30, second:30)
     */
    @Test
    public void inCaseOfMidValueLatLon(){
        HypocenterParser hypocenterParser = new HypocenterParser();
        Hypocenter hypocenter = hypocenterParser.parse("1100011010101101100100101100010100010110100000000000000110010100110011000110011101011000100011100000000000001000000000101110011110011110011110000011110011110011110000000000000000000000000000000000000000000000000000000000000000");
        
        assertThat(hypocenter.getLatitude(), is(30.5083333333333333));
        assertThat(hypocenter.getLongitude(), is(30.508333333333333));
    }
    /**
     * Magnitude (101 if more than 10.0, and 127 if unknown.
     * 126 if more than 8.0 under the
     * condition that moment magnitude is unknown.
     * Return the decimal point.)
     */
    @Test
    public void inCaseOfMagnitudeUnknown(){
        HypocenterParser hypocenterParser = new HypocenterParser();
        Hypocenter hypocenter = hypocenterParser.parse("1100011010101101100100101100010100010110100000000000000110010100110011000110011101011000100011101111101010000000000000101111011010011110011110010110100011110011110000000000000000000000000000000000000000000000000000000000000000");
        
        assertThat(hypocenter.getMagnitude(), is(12.7));
    }
    /**
     * Magnitude (101 if more than 10.0, and 127 if unknown.
     * 126 if more than 8.0 under the
     * condition that moment magnitude is unknown.
     * Return the decimal point.)
     */
    @Test
    public void inCaseOfMagnitudeUnknownOver10(){
        HypocenterParser hypocenterParser = new HypocenterParser();
        Hypocenter hypocenter = hypocenterParser.parse("1100011010101101100100101100010100010110100000000000000110010100110011000110011101011000100011100000000000001010000000101110011110011110011110000011110011110011110000000000000000000000000000000000000000000000000000000000000000");
        
        assertThat(hypocenter.getMagnitude(), is(10.1));
        assertThat(hypocenter.getDepthOfHypocenter(), is(0));
    }
    /**
     * Magnitude (101 if more than 10.0, and 127 if unknown.
     * 126 if more than 8.0 under the
     * condition that moment magnitude is unknown.
     * Return the decimal point.)
     */
    @Test
    public void inCaseOfMagnitudeUnknownOver8(){
        HypocenterParser hypocenterParser = new HypocenterParser();
        Hypocenter hypocenter = hypocenterParser.parse("1100011010101101100100101100010100010110100000000000000110010100110011000110011101011000100011101111101010001000011111010110011110011110011110000011110011110011110000000000000000000000000000000000000000000000000000000000000000");
  
        assertThat(hypocenter.getMagnitude(), is(12.6));
    }
    /**
     * Magnitude (Return the magnitude that occurred,
     * other than special conditions.
     * Return the decimal point.)
     */
    @Test
    public void inCaseOfMagnitude5(){
        HypocenterParser hypocenterParser = new HypocenterParser();
        Hypocenter hypocenter = hypocenterParser.parse("1100011010101101100100101100010100010110100000000000000110010100110011000110011101011000100011101111101010000101011111010110011110011110011110000011110011110011110000000000000000000000000000000000000000000000000000000000000000");
        
        assertThat(hypocenter.getMagnitude(), is(0.5));
    }
    
    @Test
    public void hypocenterDigitTest(){
        HypocenterParser hypocenterParser = new HypocenterParser();
        Hypocenter hypocenter = hypocenterParser.parse("110001101010110110010010110001010001011010000000000000011001010011110010011011110101100010001110000000000000101000000010111001111001111001111000001111001111001111000000000000000000000000000000000000000000000000000000000000000");
        
        assertThat(hypocenter.getDisasterCategory(), is(DisasterCategory.Hypocenter));
        assertThat(hypocenter.getOccurrenceTimeOfEarthquake(), is(LocalDateTime.of(2020,8,05,17,7)));
        assertThat(hypocenter.getDepthOfHypocenter(), is(0));
        assertThat(hypocenter.getMagnitude(), is(10.1));
        assertThat(hypocenter.getNotifications().size(), is(3));
        assertThat(hypocenter.getNotifications().get(0), is(Notification.Notification101));
        assertThat(hypocenter.getNotifications().get(1), is(Notification.Notification121));
        assertThat(hypocenter.getNotifications().get(2), is(Notification.Notification111));
        assertThat(hypocenter.getSeismicEpicenter().getCode(), is(11));
        assertThat(hypocenter.getSeismicEpicenter(), is(SeismicEpicenter.HokkaidoRegion));
        assertThat(hypocenter.isNorthLatitude(), is(false));
        assertThat(hypocenter.getLatitude(), is(30.508333333333333));
        assertThat(hypocenter.isEastLongitude(), is(true));
        assertThat(hypocenter.getLongitude(), is(30.508333333333333));
    }
}