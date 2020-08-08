package jp.ac.aiit.pbl.disaster.typhoon;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class TypeOfReferenceTimeTest {

    @Test
    public void caseOfLive(){
        assertThat(TypeOfReferenceTime.getById(1),is(TypeOfReferenceTime.Live));
    }

    @Test
    public void caseOfEstimate(){
        assertThat(TypeOfReferenceTime.getById(2),is(TypeOfReferenceTime.Estimate));
    }

    @Test
    public void caseOfForeCast(){
        assertThat(TypeOfReferenceTime.getById(3),is(TypeOfReferenceTime.Forecast));
    }
}
