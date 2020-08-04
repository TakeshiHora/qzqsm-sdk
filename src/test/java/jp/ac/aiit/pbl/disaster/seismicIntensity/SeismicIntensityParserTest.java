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
        System.out.println(seismicIntensity.toString());
    }
    @Test
    public void seismicIntensityDigitTest(){
        SeismicIntensityParser seismicIntensityParser = new SeismicIntensityParser();
        SeismicIntensity seismicIntensity = seismicIntensityParser.parse("1100011010101101100110101100010100010110100000000000001011000100011101010101100010001111110010110001011111000001011001011101110000101100110000011010110110000011000000001011001111101000000101000010000000100000000000000000000000");
        
        assertThat(seismicIntensity.getDisasterCategory(), is(DisasterCategory.SeismicIntensity));
        assertThat(seismicIntensity.getRegions().size(), is(16));
        assertThat(seismicIntensity.getOccurrenceTime(), is(LocalDateTime.of(2020,8,5,17,7)));
    }
}