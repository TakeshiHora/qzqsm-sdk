package jp.ac.aiit.pbl.disaster.flood;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FloodParserTest {
    @Test
    public void shouldParseFlood() {
        String qzMessage = "1100011010101101010110111111000001101111000000000000000100001000001001100101011101100100111100100000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000011010110000111100101010111000000";
        FloodParser floodParser = new FloodParser();
        Flood flood = floodParser.parse(qzMessage);

        assertThat(flood.getFloodWarningLevelAndForecastRegion().size(), is(1));
        assertThat(flood.getFloodWarningLevelAndForecastRegion().get(0).getWarningLevel(), is(WarningLevel.LEVEL2));
        assertThat(flood.getFloodWarningLevelAndForecastRegion().get(0).getFloodForecastRegion(), is(FloodForecastRegion.UDAGAWA));
    }

    @Test
    public void shouldParseAllFloodForecastRegions() {
        String qzMessage = "1100011010101101010110111111000001101111000000000000000100001000001001100101011101100100111100100000100000010010111100111101000101110001001001111000100000100110001010011001110111111111100000000000000000000000000000000001000011010110000111100101010111000000";
        FloodParser floodParser = new FloodParser();
        Flood flood = floodParser.parse(qzMessage);

        assertThat(flood.getFloodWarningLevelAndForecastRegion().size(), is(3));
        assertThat(flood.getFloodWarningLevelAndForecastRegion().get(0).getWarningLevel(), is(WarningLevel.LEVEL2));
        assertThat(flood.getFloodWarningLevelAndForecastRegion().get(0).getFloodForecastRegion(), is(FloodForecastRegion.UDAGAWA));
        assertThat(flood.getFloodWarningLevelAndForecastRegion().get(1).getWarningLevel(), is(WarningLevel.LEVEL1));
        assertThat(flood.getFloodWarningLevelAndForecastRegion().get(1).getFloodForecastRegion(), is(FloodForecastRegion.SHINKAWA));
        assertThat(flood.getFloodWarningLevelAndForecastRegion().get(2).getWarningLevel(), is(WarningLevel.OTHER));
        assertThat(flood.getFloodWarningLevelAndForecastRegion().get(2).getFloodForecastRegion(), is(FloodForecastRegion.YAMAGATA_OTHER));
    }
}
