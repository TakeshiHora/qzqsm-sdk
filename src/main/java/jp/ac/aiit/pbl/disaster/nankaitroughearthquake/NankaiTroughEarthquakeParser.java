package jp.ac.aiit.pbl.disaster.nankaiTroughEarthquake;

import jp.ac.aiit.pbl.disaster.DisasterParser;
import jp.ac.aiit.pbl.disaster.prefix.PrefixParser;

/**
 * Class for NankaiTroughEarthquakeParser.
 * Return NankaiTroughEarthquakeParser Class.
 */
public class NankaiTroughEarthquakeParser implements DisasterParser {
    public NankaiTroughEarthquake parse(String qzqms) {
        NankaiTroughEarthquake nankaiTroughEarthquake = new NankaiTroughEarthquake();
        PrefixParser preParser = new PrefixParser();

        nankaiTroughEarthquake.setPrefix(preParser.parse(qzqms));
        nankaiTroughEarthquake.setText(textTransducer((String) qzqms.subSequence(57,201)));
        nankaiTroughEarthquake.setPageNumber(Integer.valueOf((String) qzqms.subSequence(201,201 + 6),2));
        nankaiTroughEarthquake.setTotalPage(Integer.valueOf((String) qzqms.subSequence(207,207 + 6),2));
        // Speare2 1bit 213, 213 + 1

        return nankaiTroughEarthquake;
    }

    private String textTransducer(String qzqmsPart) {
        StringBuilder text = new StringBuilder();
        for (int bit = 0; bit < (6 * 8 * 3); bit += (8 + 8 + 8)) {
            if (!qzqmsPart.startsWith("00000000", bit)) {
                text.append(new String(
                        new byte[]{
                                (byte) Integer.parseUnsignedInt(qzqmsPart.substring(bit, bit + 8), 2),
                                (byte) Integer.parseUnsignedInt(qzqmsPart.substring(bit + 8, bit + 8 + 8), 2),
                                (byte) Integer.parseUnsignedInt(qzqmsPart.substring(bit + 8 + 8, bit + 8 + 8 + 8), 2)
                        })
                );
            } else {
                break;
            }
        }
        return text.toString();
    }
}
