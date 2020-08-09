package jp.ac.aiit.pbl.disaster.typhoon;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class IntensityCategoryTest {

    @Test
    public void caseOfNone(){
        assertThat(IntensityCategory.getById(0),is(IntensityCategory.None));
    }

    @Test
    public void caseOfTyphoon(){
        assertThat(IntensityCategory.getById(3),is(IntensityCategory.Typhoon));
    }

    @Test
    public void caseOfOthers(){
        assertThat(IntensityCategory.getById(15),is(IntensityCategory.Others));
    }
}
