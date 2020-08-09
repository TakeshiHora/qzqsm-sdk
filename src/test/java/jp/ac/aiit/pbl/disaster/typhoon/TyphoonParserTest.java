package jp.ac.aiit.pbl.disaster.typhoon;

import jp.ac.aiit.pbl.disaster.DisasterCategory;
import jp.ac.aiit.pbl.disaster.prefix.InformationType;
import jp.ac.aiit.pbl.disaster.prefix.MessageType;
import jp.ac.aiit.pbl.disaster.prefix.Preamble;
import jp.ac.aiit.pbl.disaster.prefix.ReportClassification;
import org.junit.Test;

import java.time.LocalDateTime;

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
        assertThat(typhoon.getTypeOfReferenceTime(),is(TypeOfReferenceTime.Live));
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
        assertThat(typhoon.getTypeOfReferenceTime(),is(TypeOfReferenceTime.Estimate));
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
        assertThat(typhoon.getTypeOfReferenceTime(),is(TypeOfReferenceTime.Forecast));
    }

    @Test
    public void parseTyphoonTest() {
        Typhoon typhoon = typhoonParser.parse("0101001110101101111001000000010011100111100000000000000001001100000000010000000000000000000011000100000001001001111000000000110110010001100000001111100010001001000110010000000000000000000000000000000000000000000000000001001000000010000000111101111001000000");
        assertThat(typhoon.getPrefix().getPreamble(),is(Preamble.PatternA));
        assertThat(typhoon.getPrefix().getMessageType(),is(MessageType.MT43));
        assertThat(typhoon.getPrefix().getReportClassification(), is(ReportClassification.Regular));
        assertThat(typhoon.getPrefix().getDisasterCategory(),is(DisasterCategory.Typhoon));
        assertThat(typhoon.getPrefix().getReportTime(),is(LocalDateTime.of(2020,8,1,7,15)));
        assertThat(typhoon.getPrefix().getInformationType(),is(InformationType.Issue));
        assertThat(typhoon.getReferenceTime(),is(LocalDateTime.of(2020,8,1,6,0)));
        assertThat(typhoon.getTypeOfReferenceTime(),is(TypeOfReferenceTime.Live));
        assertThat(typhoon.getElapsedTimeFromReferenceTime(),is(0));
        assertThat(typhoon.getTyphoonNumber(),is(3));
        assertThat(typhoon.getScaleCategory(),is(ScaleCategory.LargeScale));
        assertThat(typhoon.getIntensityCategory(),is(IntensityCategory.None));
        assertTrue(typhoon.getNorthLatitude());
        assertTrue(typhoon.isNorthLatitude());
        assertTrue(typhoon.getEastLongitude());
        assertTrue(typhoon.isEastLongitude());
        assertThat(typhoon.getCentralPressure(),is(994));
        assertThat(typhoon.getMaximumWindSpeed(),is(18));
        assertThat(typhoon.getMaximumGustSpeed(),is(25));
    }
}