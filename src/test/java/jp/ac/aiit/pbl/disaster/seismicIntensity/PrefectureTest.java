package jp.ac.aiit.pbl.disaster.seismicIntensity;

import jp.ac.aiit.pbl.disaster.seismicIntensity.Prefecture;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * This Class is Prefecture parser test.
 * To test that the parameter values ​​are properly parsed or not, according to the definition.
 */

public class PrefectureTest {

    @Test
    public void inCaseOfValue1GetPrefectureHokkaido() {
        assertThat(Prefecture.Hokkaido, is(Prefecture.getRegionName(1)));
    }
    @Test
    public void inCaseOfValue2GetPrefectureAomori() {
        assertThat(Prefecture.Aomori, is(Prefecture.getRegionName(2)));
    }
    @Test
    public void inCaseOfValue3GetPrefectureIwate() {
        assertThat(Prefecture.Iwate, is(Prefecture.getRegionName(3)));
    }
    @Test
    public void inCaseOfValue4GetPrefectureMiyagi() {
        assertThat(Prefecture.Miyagi, is(Prefecture.getRegionName(4)));
    }
    @Test
    public void inCaseOfValue5GetPrefectureAkita() {
        assertThat(Prefecture.Akita, is(Prefecture.getRegionName(5)));
    }
    @Test
    public void inCaseOfValue6GetPrefectureYamagata() {
        assertThat(Prefecture.Yamagata, is(Prefecture.getRegionName(6)));
    }
    @Test
    public void inCaseOfValue7GetPrefectureFukushima() {
        assertThat(Prefecture.Fukushima, is(Prefecture.getRegionName(7)));
    }
    @Test
    public void inCaseOfValue8GetPrefectureIbaraki() {
        assertThat(Prefecture.Ibaraki, is(Prefecture.getRegionName(8)));
    }
    @Test
    public void inCaseOfValue9GetPrefectureTochigi() {
        assertThat(Prefecture.Tochigi, is(Prefecture.getRegionName(9)));
    }
    @Test
    public void inCaseOfValue10GetPrefectureGunma() {
        assertThat(Prefecture.Gunma, is(Prefecture.getRegionName(10)));
    }
    @Test
    public void inCaseOfValue11GetPrefectureSaitama() {
        assertThat(Prefecture.Saitama, is(Prefecture.getRegionName(11)));
    }
    @Test
    public void inCaseOfValue12GetPrefectureChiba() {
        assertThat(Prefecture.Chiba, is(Prefecture.getRegionName(12)));
    }
    @Test
    public void inCaseOfValue13GetPrefectureTokyo() {
        assertThat(Prefecture.Tokyo, is(Prefecture.getRegionName(13)));
    }
    @Test
    public void inCaseOfValue14GetPrefectureKanagawa() {
        assertThat(Prefecture.Kanagawa, is(Prefecture.getRegionName(14)));
    }
    @Test
    public void inCaseOfValue15GetPrefectureNiigata() {
        assertThat(Prefecture.Niigata, is(Prefecture.getRegionName(15)));
    }
    @Test
    public void inCaseOfValue16GetPrefectureToyama() {
        assertThat(Prefecture.Toyama, is(Prefecture.getRegionName(16)));
    }
    @Test
    public void inCaseOfValue17GetPrefectureIshikawa() {
        assertThat(Prefecture.Ishikawa, is(Prefecture.getRegionName(17)));
    }
    @Test
    public void inCaseOfValue18GetPrefectureFukui() {
        assertThat(Prefecture.Fukui, is(Prefecture.getRegionName(18)));
    }
    @Test
    public void inCaseOfValue19GetPrefectureYamanashi() {
        assertThat(Prefecture.Yamanashi, is(Prefecture.getRegionName(19)));
    }
    @Test
    public void inCaseOfValue20GetPrefectureNagano() {
        assertThat(Prefecture.Nagano, is(Prefecture.getRegionName(20)));
    }
    @Test
    public void inCaseOfValue21GetPrefectureGifu() {
        assertThat(Prefecture.Gifu, is(Prefecture.getRegionName(21)));
    }
    @Test
    public void inCaseOfValue22GetPrefectureShizuoka() {
        assertThat(Prefecture.Shizuoka, is(Prefecture.getRegionName(22)));
    }
    @Test
    public void inCaseOfValue23GetPrefectureAichi() {
        assertThat(Prefecture.Aichi, is(Prefecture.getRegionName(23)));
    }
    @Test
    public void inCaseOfValue24GetPrefectureMie() {
        assertThat(Prefecture.Mie, is(Prefecture.getRegionName(24)));
    }
    @Test
    public void inCaseOfValue25GetPrefectureShiga() {
        assertThat(Prefecture.Shiga, is(Prefecture.getRegionName(25)));
    }
    @Test
    public void inCaseOfValue26GetPrefectureKyoto() {
        assertThat(Prefecture.Kyoto, is(Prefecture.getRegionName(26)));
    }
    @Test
    public void inCaseOfValue27GetPrefectureOsaka() {
        assertThat(Prefecture.Osaka, is(Prefecture.getRegionName(27)));
    }
    @Test
    public void inCaseOfValue28GetPrefectureHyogo() {
        assertThat(Prefecture.Hyogo, is(Prefecture.getRegionName(28)));
    }
    @Test
    public void inCaseOfValue29GetPrefectureNara() {
        assertThat(Prefecture.Nara, is(Prefecture.getRegionName(29)));
    }
    @Test
    public void inCaseOfValue30GetPrefectureWakayama() {
        assertThat(Prefecture.Wakayama, is(Prefecture.getRegionName(30)));
    }
    @Test
    public void inCaseOfValue31GetPrefectureTottori() {
        assertThat(Prefecture.Tottori, is(Prefecture.getRegionName(31)));
    }
    @Test
    public void inCaseOfValue32GetPrefectureShimane() {
        assertThat(Prefecture.Shimane, is(Prefecture.getRegionName(32)));
    }
    @Test
    public void inCaseOfValue33GetPrefectureOkayama() {
        assertThat(Prefecture.Okayama, is(Prefecture.getRegionName(33)));
    }
    @Test
    public void inCaseOfValue34GetPrefectureHiroshima() {
        assertThat(Prefecture.Hiroshima, is(Prefecture.getRegionName(34)));
    }
    @Test
    public void inCaseOfValue35GetPrefectureYamaguchi() {
        assertThat(Prefecture.Yamaguchi, is(Prefecture.getRegionName(35)));
    }
    @Test
    public void inCaseOfValue36GetPrefectureTokushima() {
        assertThat(Prefecture.Tokushima, is(Prefecture.getRegionName(36)));
    }
    @Test
    public void inCaseOfValue37GetPrefectureKagawa() {
        assertThat(Prefecture.Kagawa, is(Prefecture.getRegionName(37)));
    }
    @Test
    public void inCaseOfValue38GetPrefectureEhime() {
        assertThat(Prefecture.Ehime, is(Prefecture.getRegionName(38)));
    }
    @Test
    public void inCaseOfValue39GetPrefectureKochi() {
        assertThat(Prefecture.Kochi, is(Prefecture.getRegionName(39)));
    }
    @Test
    public void inCaseOfValue4OGetPrefectureFukuoka() {
        assertThat(Prefecture.Fukuoka, is(Prefecture.getRegionName(40)));
    }
    @Test
    public void inCaseOfValue41GetPrefectureSaga() {
        assertThat(Prefecture.Saga, is(Prefecture.getRegionName(41)));
    }
    @Test
    public void inCaseOfValue42GetPrefectureNagasaki() {
        assertThat(Prefecture.Nagasaki, is(Prefecture.getRegionName(42)));
    }
    @Test
    public void inCaseOfValue43GetPrefectureKumamoto() {
        assertThat(Prefecture.Kumamoto, is(Prefecture.getRegionName(43)));
    }
    @Test
    public void inCaseOfValue44GetPrefectureOita() {
        assertThat(Prefecture.Oita, is(Prefecture.getRegionName(44)));
    }
    @Test
    public void inCaseOfValue45GetPrefectureMiyazaki() {
        assertThat(Prefecture.Miyazaki, is(Prefecture.getRegionName(45)));
    }
    @Test
    public void inCaseOfValue46GetPrefectureKagoshima() {
        assertThat(Prefecture.Kagoshima, is(Prefecture.getRegionName(46)));
    }
    @Test
    public void inCaseOfValue47GetPrefectureOkinawa() {
        assertThat(Prefecture.Okinawa, is(Prefecture.getRegionName(47)));
    }
}