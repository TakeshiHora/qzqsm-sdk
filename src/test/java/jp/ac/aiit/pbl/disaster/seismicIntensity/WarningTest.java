package jp.ac.aiit.pbl.disaster.seismicIntensity;

import jp.ac.aiit.pbl.disaster.seismicIntensity.Warning;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * This Class is Warning of SeismicIntensity parser test.
 * To test that the parameter values ​​are properly parsed or not, according to the definition.
 */

public class WarningTest {
    
    @Test
    public void inCaseOfValue1GetSeismicIntensityLessThan4() {
        assertThat(Warning.SeismicIntensityLessThan4, is(Warning.getSeismicIntensity(1)));
    }
    @Test
    public void inCaseOfValue2GetSeismicIntensity4() {
        assertThat(Warning.SeismicIntensity4, is(Warning.getSeismicIntensity(2)));
    }
    @Test
    public void inCaseOfValue3GetSeismicIntensity5Lower() {
        assertThat(Warning.SeismicIntensity5Lower, is(Warning.getSeismicIntensity(3)));
    }
    @Test
    public void inCaseOfValue4GetSeismicIntensityUpper5() {
        assertThat(Warning.SeismicIntensityUpper5, is(Warning.getSeismicIntensity(4)));
    }
    @Test
    public void inCaseOfValue5GetSeismicIntensity6Lower() {
        assertThat(Warning.SeismicIntensity6Lower, is(Warning.getSeismicIntensity(5)));
    }
    @Test
    public void inCaseOfValue6GetSeismicIntensityUpper6() {
        assertThat(Warning.SeismicIntensityUpper6, is(Warning.getSeismicIntensity(6)));
    }
    @Test
    public void inCaseOfValue7GetSeismicIntensity7() {
        assertThat(Warning.SeismicIntensity7, is(Warning.getSeismicIntensity(7)));
    }
}