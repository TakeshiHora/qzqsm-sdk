package jp.ac.aiit.pbl.disaster.earthquakeearlywarning;

import jp.ac.aiit.pbl.disaster.hypocenter.SeismicEpicenter;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class EarthquakeEarlyWarningTest {

    @Test
    public void shouldParseEarthquakeEarlyWarning(){
        String qzMessage = "1001101010101111100010111010100000100000000000000000000110010100000000000000000001010000010000000000010101000100000000110010001011100001111100000000010000000000000000000000000000000000000100010000000000000000010000000001001011000111100111100111001001000000";
        EarthquakeEarlyWarningParser earlyWarningParser = new EarthquakeEarlyWarningParser();
        EarthquakeEarlyWarning earthquakeEarlyWarning = earlyWarningParser.parse(qzMessage);
        assertThat(earthquakeEarlyWarning.getNotifications().get(0), is(Notification.Notification101));
        assertThat(earthquakeEarlyWarning.getNotifications().get(1), is(Notification.Notification0));
        assertThat(earthquakeEarlyWarning.getNotifications().get(2), is(Notification.Notification0));
        assertThat(earthquakeEarlyWarning.getOccurrenceTimeOfEarthquake().getDayOfMonth(), is(10));
        assertThat(earthquakeEarlyWarning.getOccurrenceTimeOfEarthquake().getHour(), is(1));
        assertThat(earthquakeEarlyWarning.getOccurrenceTimeOfEarthquake().getMinute(), is(0));
        assertThat(earthquakeEarlyWarning.getDepthOfSeismicEpicenter(), is(10));
        assertThat(earthquakeEarlyWarning.getMagnitude(), is(6.8));
        assertThat(earthquakeEarlyWarning.getSeismicEpicenter(), is(SeismicEpicenter.TohokuRegion));
        assertThat(earthquakeEarlyWarning.getSeismicIntensityLowerLimit(), is(SeismicIntensityLowerLimit.SIX_LOWER));
        assertThat(earthquakeEarlyWarning.getSeismicIntensityUpperLimit(), is(SeismicIntensityUpperLimit.OTHER));
        assertThat(earthquakeEarlyWarning.getForecastRegionEarthquakeEarlyWarning().get(0), is(ForecastRegionEarthquakeEarlyWarning.HOKKAIDO_CENTRAL));
        assertThat(earthquakeEarlyWarning.getForecastRegionEarthquakeEarlyWarning().get(1), is(ForecastRegionEarthquakeEarlyWarning.IWATE));
        assertThat(earthquakeEarlyWarning.getForecastRegionEarthquakeEarlyWarning().get(2), is(ForecastRegionEarthquakeEarlyWarning.MIYAGI));
        assertThat(earthquakeEarlyWarning.getForecastRegionEarthquakeEarlyWarning().get(3), is(ForecastRegionEarthquakeEarlyWarning.AKITA));
        assertThat(earthquakeEarlyWarning.getForecastRegionEarthquakeEarlyWarning().get(4), is(ForecastRegionEarthquakeEarlyWarning.YAMAGATA));
        assertThat(earthquakeEarlyWarning.getForecastRegionEarthquakeEarlyWarning().get(5), is(ForecastRegionEarthquakeEarlyWarning.FUKUSHIMA));
        assertThat(earthquakeEarlyWarning.getForecastRegionEarthquakeEarlyWarning().get(6), is(ForecastRegionEarthquakeEarlyWarning.NIIGATA));
        assertThat(earthquakeEarlyWarning.getForecastRegionEarthquakeEarlyWarning().get(7), is(ForecastRegionEarthquakeEarlyWarning.TOHOKU));
        assertThat(earthquakeEarlyWarning.getForecastRegionEarthquakeEarlyWarning().get(8), is(ForecastRegionEarthquakeEarlyWarning.HOKURIKU));
        assertThat(earthquakeEarlyWarning.getForecastRegionEarthquakeEarlyWarning().get(9), is(ForecastRegionEarthquakeEarlyWarning.OTHER));
    }
}
