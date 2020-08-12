package jp.ac.aiit.pbl.disaster.typhoon;

import jp.ac.aiit.pbl.disaster.DisasterParser;
import jp.ac.aiit.pbl.disaster.prefix.Prefix;
import jp.ac.aiit.pbl.disaster.prefix.PrefixParser;


import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * Class for TyphoonParser.
 * Return Typhoon Class.
 */
public class TyphoonParser implements DisasterParser {

    public Typhoon parse(String qzqms) {
        PrefixParser prefixParser = new PrefixParser();
        Typhoon typhoon = new Typhoon();

        typhoon.setPrefix(prefixParser.parse(qzqms));

        typhoon.setReferenceTimeDate(parseReferenceTimeDate(typhoon.getPrefix(),(String) qzqms.subSequence(53, 53 + 16)));

        typhoon.setTypeOfReferenceTime(TypeOfReferenceTime.getById(Integer.parseInt(qzqms.substring(69,69 + 3),2)));
        // Speare2 8bit 72, 72 + 8
        typhoon.setElapsedTimeFromReferenceTime(Integer.valueOf((String) qzqms.subSequence(80, 80 + 7),2));
        typhoon.setTyphoonNumber(Integer.valueOf((String) qzqms.subSequence(87, 87 + 7),2));
        typhoon.setScaleCategory(ScaleCategory.getById(Integer.parseInt(qzqms.substring(94,94 + 4),2)));
        typhoon.setIntensityCategory(IntensityCategory.getById(Integer.parseInt((String) qzqms.subSequence(98, 98 + 4),2)));
        typhoon.setNorthLatitude(parseLatitudeNorth(Integer.valueOf((String) qzqms.subSequence(102, 102 + 1),2)));
        typhoon.setLatitude(calculateLatitudeLongitude(
                Integer.valueOf((String) qzqms.subSequence(103, 103 + 7),2),
                Integer.valueOf((String) qzqms.subSequence(110, 110 + 6),2),
                Integer.valueOf((String) qzqms.subSequence(116, 116 + 6),2)));
        typhoon.setEastLongitude(parseLongitudeEast(Integer.valueOf((String) qzqms.subSequence(122, 122 + 1),2)));
        typhoon.setLongitude(calculateLatitudeLongitude(
                Integer.valueOf((String) qzqms.subSequence(123, 123 + 8),2),
                Integer.valueOf((String) qzqms.subSequence(131, 131 + 6),2),
                Integer.valueOf((String) qzqms.subSequence(137, 137 + 6),2)));
        typhoon.setCentralPressure(Integer.valueOf((String) qzqms.subSequence(143, 143 + 11),2));
        typhoon.setMaximumWindSpeed(Integer.valueOf((String) qzqms.subSequence(154, 154 + 7),2));
        typhoon.setMaximumGustSpeed(Integer.valueOf((String) qzqms.subSequence(161, 161 + 7),2));

        return typhoon;
    }

    private ZonedDateTime parseReferenceTimeDate(Prefix prefix, String input) {
        return ZonedDateTime.of(
                prefix.getReportTime().getYear(),
                prefix.getReportTime().getMonthValue(),
                Integer.valueOf(input.substring(0, 5),2),
                Integer.valueOf(input.substring(5, 5 + 5),2),
                Integer.valueOf(input.substring(10, 10 + 6),2),
                0,
                0,
                ZoneId.of("Etc/UTC")
        );
    }

    private boolean parseLatitudeNorth(int latitudeNorth) {
        return latitudeNorth == 0;
    }

    private boolean parseLongitudeEast(int longitudeEast) {
        return longitudeEast == 0;
    }

    private double calculateLatitudeLongitude(int degree, int minute, int second) {
        return (double)degree + (double)minute/60.0d + (double)second/3600d;
    }
}
