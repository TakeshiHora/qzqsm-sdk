package jp.ac.aiit.pbl.disaster.typhoon;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class ScaleCategoryTest {

    @Test
    public void caseOfNone(){
        assertThat(ScaleCategory.getById(0),is(ScaleCategory.None));
    }

    @Test
    public void caseOfLargeScale(){
        assertThat(ScaleCategory.getById(1),is(ScaleCategory.LargeScale));
    }

    @Test
    public void caseOfOthers(){
        assertThat(ScaleCategory.getById(15),is(ScaleCategory.Others));
    }
}
