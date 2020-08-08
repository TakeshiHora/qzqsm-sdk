package jp.ac.aiit.pbl.disaster.seismicIntensity;

import jp.ac.aiit.pbl.disaster.DisasterCategory;
import jp.ac.aiit.pbl.disaster.seismicIntensity.SeismicIntensity;
import jp.ac.aiit.pbl.disaster.seismicIntensity.SeismicIntensityParser;
import org.junit.Test;

import java.time.LocalDateTime;
import java.time.LocalTime;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * This Class is SeismicIntensity Parser Test.
 * To test that the parameter values ​​are properly parsed or not, according to the definition.
 */

public class SeismicIntensityParserTest {
    
    @Test
    public void seismicIntensityParserTest() {
        SeismicIntensityParser seismicIntensityParser = new SeismicIntensityParser();

        SeismicIntensity seismicIntensity = seismicIntensityParser.parse("1100011010101101100110101100010100010110100000000000001011000100011101010101100010001111110010110001011111000001011001011101110000101100110000011010110110000011000000001011001111101000000101000010000000100000000000000000000000");
    }
    @Test
    public void seismicIntensityDigitTest(){
        SeismicIntensityParser seismicIntensityParser = new SeismicIntensityParser();
        SeismicIntensity seismicIntensity = seismicIntensityParser.parse("1100011010101101100110101100010100010110100000000000001011000100011101010101100010001111110010111101011111000001011001011101110000101100110000011010110110011001000010111011001111101000000101000011000000100100010110000000000000");
        
        assertThat(seismicIntensity.getDisasterCategory(), is(DisasterCategory.SeismicIntensity));
        assertThat(seismicIntensity.getRegions().size(), is(16));
        assertThat(seismicIntensity.getOccurrenceTime(), is(LocalDateTime.of(2020,8,5,17,7)));
        assertThat(seismicIntensity.getRegions().get(0).getPrefecture(), is(Prefecture.Shizuoka));
        assertThat(seismicIntensity.getRegions().get(0).getWarning(), is(Warning.SeismicIntensity6Lower));
        assertThat(seismicIntensity.getRegions().get(1).getPrefecture(), is(Prefecture.Fukushima));
        assertThat(seismicIntensity.getRegions().get(1).getWarning(), is(Warning.SeismicIntensityLessThan4));
        assertThat(seismicIntensity.getRegions().get(2).getPrefecture(), is(Prefecture.Saitama));
        assertThat(seismicIntensity.getRegions().get(2).getWarning(), is(Warning.SeismicIntensity7));
        assertThat(seismicIntensity.getRegions().get(3).getPrefecture(), is(Prefecture.Okinawa));
        assertThat(seismicIntensity.getRegions().get(3).getWarning(), is(Warning.SeismicIntensityUpper6));
        assertThat(seismicIntensity.getRegions().get(4).getPrefecture(), is(Prefecture.Akita));
        assertThat(seismicIntensity.getRegions().get(4).getWarning(), is(Warning.SeismicIntensityUpper5));
        assertThat(seismicIntensity.getRegions().get(5).getPrefecture(), is(Prefecture.Kagoshima));
        assertThat(seismicIntensity.getRegions().get(5).getWarning(), is(Warning.SeismicIntensityUpper5));
        assertThat(seismicIntensity.getRegions().get(6).getPrefecture(), is(Prefecture.Aomori));
        assertThat(seismicIntensity.getRegions().get(6).getWarning(), is(Warning.SeismicIntensity7));
        assertThat(seismicIntensity.getRegions().get(7).getPrefecture(), is(Prefecture.Mie));
        assertThat(seismicIntensity.getRegions().get(7).getWarning(), is(Warning.SeismicIntensityUpper6));
        assertThat(seismicIntensity.getRegions().get(8).getPrefecture(), is(Prefecture.Kumamoto));
        assertThat(seismicIntensity.getRegions().get(8).getWarning(), is(Warning.SeismicIntensityLessThan4));
        assertThat(seismicIntensity.getRegions().get(9).getPrefecture(), is(Prefecture.Chiba));
        assertThat(seismicIntensity.getRegions().get(9).getWarning(), is(Warning.SeismicIntensity5Lower));
        assertThat(seismicIntensity.getRegions().get(10).getPrefecture(), is(Prefecture.Saitama));
        assertThat(seismicIntensity.getRegions().get(10).getWarning(), is(Warning.SeismicIntensityUpper5));
        assertThat(seismicIntensity.getRegions().get(11).getPrefecture(), is(Prefecture.Kochi));
        assertThat(seismicIntensity.getRegions().get(11).getWarning(), is(Warning.SeismicIntensity6Lower));
        assertThat(seismicIntensity.getRegions().get(12).getPrefecture(), is(Prefecture.Shimane));
        assertThat(seismicIntensity.getRegions().get(12).getWarning(), is(Warning.SeismicIntensityUpper6));
        assertThat(seismicIntensity.getRegions().get(13).getPrefecture(), is(Prefecture.Okayama));
        assertThat(seismicIntensity.getRegions().get(13).getWarning(), is(Warning.SeismicIntensity4));
        assertThat(seismicIntensity.getRegions().get(14).getPrefecture(), is(Prefecture.Aomori));
        assertThat(seismicIntensity.getRegions().get(14).getWarning(), is(Warning.SeismicIntensityUpper5));
        assertThat(seismicIntensity.getRegions().get(15).getPrefecture(), is(Prefecture.Saitama));
        assertThat(seismicIntensity.getRegions().get(15).getWarning(), is(Warning.SeismicIntensity4));
        
    }
}