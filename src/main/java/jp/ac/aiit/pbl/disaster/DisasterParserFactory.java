package jp.ac.aiit.pbl.disaster;

import jp.ac.aiit.pbl.disaster.DisasterParser;
import jp.ac.aiit.pbl.disaster.ashfall.AshFallParser;
import jp.ac.aiit.pbl.disaster.flood.FloodParser;
import jp.ac.aiit.pbl.disaster.hypocenter.HypocenterParser;
import jp.ac.aiit.pbl.disaster.marine.MarineParser;
import jp.ac.aiit.pbl.disaster.nankaiTroughEarthquake.NankaiTroughEarthquake;
import jp.ac.aiit.pbl.disaster.nankaiTroughEarthquake.NankaiTroughEarthquakeParser;
import jp.ac.aiit.pbl.disaster.northwestpacifictsunami.NorthwestPacificTsunamiParser;
import jp.ac.aiit.pbl.disaster.prefix.Prefix;
import jp.ac.aiit.pbl.disaster.prefix.PrefixParser;
import jp.ac.aiit.pbl.disaster.seismicIntensity.SeismicIntensityParser;
import jp.ac.aiit.pbl.disaster.tsunami.TsunamiParser;
import jp.ac.aiit.pbl.disaster.typhoon.TyphoonParser;
import jp.ac.aiit.pbl.disaster.volcano.VolcanoParser;
import jp.ac.aiit.pbl.disaster.weather.WeatherParser;

/**
 * This class is factory of DisasterParser
 */
public class DisasterParserFactory {

    public DisasterParser create(String qzMessage){
        PrefixParser parser = new PrefixParser();
        Prefix prefix = parser.parse(qzMessage);

        switch (prefix.getDisasterCategory()) {
            case AshFall:
                return new AshFallParser();
            case Flood:
                return new FloodParser();
            case Hypocenter:
                return new HypocenterParser();
            case Marine:
                return new MarineParser();
            case NankaiTroughEarthquake:
                return new NankaiTroughEarthquakeParser();
            case NorthwestPacificTsunami:
                return new NorthwestPacificTsunamiParser();
            case SeismicIntensity:
                return new SeismicIntensityParser();
            case Tsunami:
                return new TsunamiParser();
            case Typhoon:
                return new TyphoonParser();
            case Volcano:
                return new VolcanoParser();
            case Weather:
                return new WeatherParser();
            default:
                return null;
        }
    }
}
