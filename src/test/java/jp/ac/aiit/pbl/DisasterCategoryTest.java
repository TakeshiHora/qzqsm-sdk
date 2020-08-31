package jp.ac.aiit.pbl;

import jp.ac.aiit.pbl.disaster.DisasterCategory;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class DisasterCategoryTest {

    @Test
    public void canGetEarthquakeEarlyWarningIdOne(){
        assertThat(DisasterCategory.EarthquakeEarlyWarning,is(DisasterCategory.getById(1)));
    }

    @Test
    public void canGetHypocenterIdTwo(){
        assertThat(DisasterCategory.Hypocenter,is(DisasterCategory.getById(2)));
    }

    @Test
    public void canGetSeismicIntensityIdOne(){
        assertThat(DisasterCategory.SeismicIntensity,is(DisasterCategory.getById(3)));
    }

    @Test
    public void canGetNankaiTroughEarthquakeIdFour(){
        assertThat(DisasterCategory.NankaiTroughEarthquake,is(DisasterCategory.getById(4)));
    }

    @Test
    public void canGetTsunamiIdFive(){
        assertThat(DisasterCategory.Tsunami,is(DisasterCategory.getById(5)));
    }

    @Test
    public void canGetNorthwestPacificTsunamiIdSix(){
        assertThat(DisasterCategory.NorthwestPacificTsunami,is(DisasterCategory.getById(6)));
    }

    @Test
    public void canGetVolcanoIdEight(){
        assertThat(DisasterCategory.Volcano,is(DisasterCategory.getById(8)));
    }

    @Test
    public void canGetAshFallIdNine(){
        assertThat(DisasterCategory.AshFall,is(DisasterCategory.getById(9)));
    }

    @Test
    public void canGetWeatherIdTen(){
        assertThat(DisasterCategory.Weather,is(DisasterCategory.getById(10)));
    }

    @Test
    public void canGetFloodIdEleven(){
        assertThat(DisasterCategory.Flood,is(DisasterCategory.getById(11)));
    }

    @Test
    public void canGetTyphoonIdTwelve(){
        assertThat(DisasterCategory.Typhoon,is(DisasterCategory.getById(12)));
    }

    @Test
    public void canGetMarineIdFourTeen(){
        assertThat(DisasterCategory.Marine,is(DisasterCategory.getById(14)));
    }
}