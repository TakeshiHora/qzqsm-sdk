package jp.ac.aiit.pbl.disaster.nankaitroughearthquake;

import jp.ac.aiit.pbl.disaster.DisasterCategory;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class NankaiTroughEarthquakeTest {
    String qzqms = "1001101010101101001000111001111011010110000000000000000001110001110000001100000011110001110000001100000101110001110000001100000111110001110000001100001001110001110000001100001011110001110000001100001100000100001000000001000000000000000000000000000001";
    NankaiTroughEarthquakeParser nankaiTroughEarthquakeParser = new NankaiTroughEarthquakeParser();
    NankaiTroughEarthquake nankaiTroughEarthquake = nankaiTroughEarthquakeParser.parse(qzqms);

    @Test
    public void NankaiTroughEarthquakeToString() {
        NankaiTroughEarthquake nankaiTroughEarthquake = nankaiTroughEarthquakeParser.parse(qzqms);
        assertThat(nankaiTroughEarthquake.getPrefix().getDisasterCategory(),is(DisasterCategory.NankaiTroughEarthquake));
        assertThat(nankaiTroughEarthquake.getText(),is("ぁあぃいぅう"));
        assertThat(nankaiTroughEarthquake.getPageNumber(),is(2));
        assertThat(nankaiTroughEarthquake.getTotalPage(),is(4));
    }

    @Test
    public void canGetByteCodes6() {
        String message = "1001101010101101001000111001111011010110000000000000000001110111110111100100100011110111110111100100100101110111110111100100100111110111110111100100101001110111110111100100101011110111110111100100101100000100001000000001000000000000000000000000000001";
        NankaiTroughEarthquake nankai = nankaiTroughEarthquakeParser.parse(message);
        assertThat(nankai.getText(),is("１２３４５６"));
    }

    @Test
    public void canGetByteCodes2() {
        String message = "1001101010101101001000111001111011010110000000000000000001110111110111100100100011110111110111100100100100000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100001000000001000000000000000000000000000001";
        NankaiTroughEarthquake nankaiTroughEarthquake = nankaiTroughEarthquakeParser.parse(message);
        assertThat(nankaiTroughEarthquake.getText(),is("１２"));
    }
}