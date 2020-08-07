package jp.ac.aiit.pbl.disaster.typhoon;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TyphoonParserTest {
    String qzqms = "" +
            "1100011010" + "1011011110" + "0" + /* Common area 21*/
            "0110011001" + "0101100000" + /* At 20*/
            "00" + /* It 2*/
            "0000000000" + /* Speare1 10*/
            "0101100010000100" + /* Bt 16*/
            "010" + /* Dt 3*/
            "00000000" + /* Speare2 8*/
            "0110010" + /* Du 7*/
            "1100011" + /* Tn 7*/
            "0010" + /* Sr 4*/
            "0011" + /* Ic 4*/
            "0" + "0100011" + "001001" + "010011" + "0" + "10001100" + "010011" + "010100" + /* LatLon 41*/
            "01111110101" + /* Pr 11*/
            "1100100" + /* W1 7*/
            "1100101" + /* W2 7*/
            "0000000000" + "0000000000" + "0000000000" + "0000000000" + "000000" + /* Speare3 46*/
            "000001" + /* Vn 6*/
            "000000" + /* Reserved 6*/
            "1111111111" + "1111111111" + "1111" + /* CRC 24*/
            "";
    TyphoonParser typhoonParser = new TyphoonParser();
    Typhoon typhoon = typhoonParser.parse(qzqms);

    @Test
    public void TyphoonParserToString() {
        Typhoon typhoon = typhoonParser.parse(qzqms);
        System.out.println(typhoon.toString());
    }

    @Test
    public void canGetTypeOfReferenceTimeTimeLive() {
        qzqms = "" +
                "1100011010" + "1011011110" + "0" + /* Common area 21*/
                "0110011001" + "0101100000" + /* At 20*/
                "00" + /* It 2*/
                "0000000000" + /* Speare1 10*/
                "0101100010000100" + /* Bt 16*/
                "001" + /* Dt 3*/
                "00000000" + /* Speare2 8*/
                "0110010" + /* Du 7*/
                "1100011" + /* Tn 7*/
                "0010" + /* Sr 4*/
                "0011" + /* Ic 4*/
                "0" + "0100011" + "001001" + "010011" + "0" + "10001100" + "010011" + "010100" + /* LatLon 41*/
                "01111110101" + /* Pr 11*/
                "1100100" + /* W1 7*/
                "1100101" + /* W2 7*/
                "0000000000" + "0000000000" + "0000000000" + "0000000000" + "000000" + /* Speare3 46*/
                "000001" + /* Vn 6*/
                "000000" + /* Reserved 6*/
                "1111111111" + "1111111111" + "1111" + /* CRC 24*/
                "";
        Typhoon typhoon = typhoonParser.parse(qzqms);
        TypeOfReferenceTime expected = TypeOfReferenceTime.Live;
        assertThat(typhoon.getTypeOfReferenceTime(),is(expected));
    }

    @Test
    public void canGetTypeOfReferenceTimeEstimate() {
        qzqms = "" +
                "1100011010" + "1011011110" + "0" + /* Common area 21*/
                "0110011001" + "0101100000" + /* At 20*/
                "00" + /* It 2*/
                "0000000000" + /* Speare1 10*/
                "0101100010000100" + /* Bt 16*/
                "010" + /* Dt 3*/
                "00000000" + /* Speare2 8*/
                "0110010" + /* Du 7*/
                "1100011" + /* Tn 7*/
                "0010" + /* Sr 4*/
                "0011" + /* Ic 4*/
                "0" + "0100011" + "001001" + "010011" + "0" + "10001100" + "010011" + "010100" + /* LatLon 41*/
                "01111110101" + /* Pr 11*/
                "1100100" + /* W1 7*/
                "1100101" + /* W2 7*/
                "0000000000" + "0000000000" + "0000000000" + "0000000000" + "000000" + /* Speare3 46*/
                "000001" + /* Vn 6*/
                "000000" + /* Reserved 6*/
                "1111111111" + "1111111111" + "1111" + /* CRC 24*/
                "";
        Typhoon typhoon = typhoonParser.parse(qzqms);
        TypeOfReferenceTime expected = TypeOfReferenceTime.Estimate;
        assertThat(typhoon.getTypeOfReferenceTime(),is(expected));
    }

    @Test
    public void canGetTypeOfReferenceTimeForecast() {
        qzqms = "" +
                "1100011010" + "1011011110" + "0" + /* Common area 21*/
                "0110011001" + "0101100000" + /* At 20*/
                "00" + /* It 2*/
                "0000000000" + /* Speare1 10*/
                "0101100010000100" + /* Bt 16*/
                "011" + /* Dt 3*/
                "00000000" + /* Speare2 8*/
                "0110010" + /* Du 7*/
                "1100011" + /* Tn 7*/
                "0010" + /* Sr 4*/
                "0011" + /* Ic 4*/
                "0" + "0100011" + "001001" + "010011" + "0" + "10001100" + "010011" + "010100" + /* LatLon 41*/
                "01111110101" + /* Pr 11*/
                "1100100" + /* W1 7*/
                "1100101" + /* W2 7*/
                "0000000000" + "0000000000" + "0000000000" + "0000000000" + "000000" + /* Speare3 46*/
                "000001" + /* Vn 6*/
                "000000" + /* Reserved 6*/
                "1111111111" + "1111111111" + "1111" + /* CRC 24*/
                "";
        Typhoon typhoon = typhoonParser.parse(qzqms);
        TypeOfReferenceTime expected = TypeOfReferenceTime.Forecast;
        assertThat(typhoon.getTypeOfReferenceTime(),is(expected));
    }

    @Test
    public void canGetElapsedTimeFromReferenceTime() {
        int expected = 50;
        assertThat(typhoon.getElapsedTimeFromReferenceTime(),is(expected));
    }

    @Test
    public void canGetTyphoonNumber() {
        int expected = 99;
        assertThat(typhoon.getTyphoonNumber(),is(expected));
    }

    @Test
    public void canGetScaleCategory() {
        ScaleCategory expected = ScaleCategory.scaleCategorySuperScale;
        assertThat(typhoon.getScaleCategory(),is(expected));
    }

    @Test
    public void canGetIntensityCategory() {
        IntensityCategory expected = IntensityCategory.intensitycategoryTyphoon;
        assertThat(typhoon.getIntensityCategory(),is(expected));
    }

    @Test
    public void canGetLatitudeNorth() {
        boolean expected = true;
        assertThat(typhoon.getNorthLatitude(),is(expected));
        assertThat(typhoon.isNorthLatitude(),is(expected));
    }

    @Test
    public void canGetLongitudeEast() {
        boolean expected = true;
        assertThat(typhoon.getEastLongitude(),is(expected));
        assertThat(typhoon.isEastLongitude(),is(expected));
    }

    @Test
    public void canGetCentralPressure() {
        int expected = 1013;
        assertThat(typhoon.getCentralPressure(),is(expected));
    }

    @Test
    public void canGetMaximunWindSpeed() {
        int expected = 100;
        assertThat(typhoon.getMaximumWindSpeed(),is(expected));
    }

    @Test
    public void canGetMaximunGuestSpeed() {
        int expected = 101;
        assertThat(typhoon.getMaximumGustSpeed(),is(expected));
    }
}