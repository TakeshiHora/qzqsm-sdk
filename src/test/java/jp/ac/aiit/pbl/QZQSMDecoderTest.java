package jp.ac.aiit.pbl;

import jp.ac.aiit.pbl.disaster.ashfall.AshFalll;
import jp.ac.aiit.pbl.disaster.marine.Marine;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class QZQSMDecoderTest {

    @Test
    public void caseOfDecodingAshFall(){
        QZQSMDecoder decoder = new QZQSMDecoder();
        Disaster disaster = decoder.decode("9AAD4BFCAE8007CA243FF4C6A780C6353C0000000000000000000013757BC1C0");
        assertThat(disaster, is(instanceOf(AshFalll.class)));
        System.out.println(disaster.toString());
    }

    @Test
    public void caseOfDecodingMarine(){
        QZQSMDecoder decoder = new QZQSMDecoder();
        Disaster disaster = decoder.decode("9AADF3FA918002CC1C5A008B4E2169FB2D4000000000000000000011474EA640");
        assertThat(disaster, is(instanceOf(Marine.class)));
        System.out.println(disaster.toString());
    }
}
