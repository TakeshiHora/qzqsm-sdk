package jp.ac.aiit.pbl;

import jp.ac.aiit.pbl.disaster.volcano.LocalGovernment;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class LocalGovernmentTest {
        @Test
        public void canGetLocalGovernmentTest110000(){
            assertThat(LocalGovernment.HokkaidoSapporoshi,is(LocalGovernment.get(110000)));
        }
        @Test
        public void canGetLocalGovernmentTest120700(){
            assertThat(LocalGovernment.HokkaidoObihiroshi,is(LocalGovernment.get(120700)));
        }
        @Test
        public void canGetLocalGovernmentTest143300(){
            assertThat(LocalGovernment.HokkaidoMoseushicho,is(LocalGovernment.get(143300)));
        }
        @Test
        public void canGetLocalGovernmentTest155000(){
            assertThat(LocalGovernment.HokkaidoOketocho,is(LocalGovernment.get(155000)));
        }
        @Test
        public void canGetLocalGovernmentTest160800(){
            assertThat(LocalGovernment.Hokkaidosamanicho,is(LocalGovernment.get(160800)));
        }
        @Test
        public void canGetLocalGovernmentTest161000(){
            assertThat(LocalGovernment.HokkaidoShinhidakacho,is(LocalGovernment.get(161000)));
        }
        @Test
        public void canGetLocalGovernmentTest163300(){
            assertThat(LocalGovernment.HokkaidoKamishorohocho,is(LocalGovernment.get(163300)));
        }
        @Test
        public void canGetLocalGovernmentTest163800(){
            assertThat(LocalGovernment.HokkaidoNakasatsunaimura,is(LocalGovernment.get(163800)));
        }
        @Test
        public void measureHandlingTimeForHashMap166700(){

            //Measurement for original handling
            long startPointOriginal = System.nanoTime();
            assertThat(LocalGovernment.HokkaidoTsuruimura,is(LocalGovernment.getById(166700)));
            long endPointOriginal = System.nanoTime();
            long resultTimeOriginal = endPointOriginal - startPointOriginal;

            //Measurement for hash map
            long startPointHashMap = System.nanoTime();
            assertThat(LocalGovernment.HokkaidoTsuruimura,is(LocalGovernment.get(166700)));
            long endPointHashMap = System.nanoTime();
            long resultTimeHashMap = endPointHashMap - startPointHashMap;

            //Result for original
            System.out.println("startPointOriginal=" + startPointOriginal);
            System.out.println("endPointOriginal=" + endPointOriginal);
            System.out.println("resultTimeOriginal=" + resultTimeOriginal+"Nano");
            //Result for Hash map
            System.out.println("startPointlHashMap=" + startPointHashMap);
            System.out.println("endPointHashMap=" + endPointHashMap);
            System.out.println("resultTimeHashMap=" + resultTimeHashMap+"Nano");
        }

        @Test
            public void canGetLocalGovernmentTest299999() {
            assertThat(LocalGovernment.AomoriOthers, is(LocalGovernment.get(299999)));
        }
        @Test
        public void canGetLocalGovernmentTest499999() {
            assertThat(LocalGovernment.MiyagiOthers, is(LocalGovernment.get(499999)));
        }
        @Test
        public void canGetLocalGovernmentTest699999() {
            assertThat(LocalGovernment.YamagataOthers, is(LocalGovernment.get(699999)));
        }
        @Test
        public void canGetLocalGovernmentTest1599999() {
            assertThat(LocalGovernment.NiigataOthers, is(LocalGovernment.get(1599999)));
        }
        @Test
        public void canGetLocalGovernmentTest1999999() {
            assertThat(LocalGovernment.YamanashiOthers, is(LocalGovernment.get(1999999)));
        }
        @Test
        public void canGetLocalGovernmentTest2099999() {
            assertThat(LocalGovernment.NaganoOthers, is(LocalGovernment.get(2099999)));
        }
        @Test
        public void canGetLocalGovernmentTest2899999() {
            assertThat(LocalGovernment.HyogoOthers, is(LocalGovernment.get(2899999)));
        }
        @Test
        public void canGetLocalGovernmentTest2999999() {
            assertThat(LocalGovernment.NaraOthers, is(LocalGovernment.get(2999999)));
        }
        @Test
        public void canGetLocalGovernmentTest3599999() {
            assertThat(LocalGovernment.YamaguchiOthers, is(LocalGovernment.get(3599999)));
        }
        @Test
        public void canGetLocalGovernmentTest3999999() {
            assertThat(LocalGovernment.KochiOthers, is(LocalGovernment.get(3999999)));
        }
        @Test
        public void canGetLocalGovernmentTest4199999() {
            assertThat(LocalGovernment.SagaOthers, is(LocalGovernment.get(4199999)));
        }

        @Test
            public void canGetLocalGovernmentTestMax(){
                assertThat(LocalGovernment.OkinawaOthers,is(LocalGovernment.get(4799999)));
            }
            @Test
        public void canGetLocalGovernmentTestMoreThanMax(){ ;
            assertThat(null,is(LocalGovernment.get(4800000)));
        }
        @Test
        public void canGetLocalGovernmentTestLessThanMin(){
            assertThat(null,is(LocalGovernment.getById(100)));
        }

}
