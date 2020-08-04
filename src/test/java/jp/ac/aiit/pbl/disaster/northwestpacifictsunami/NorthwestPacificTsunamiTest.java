package jp.ac.aiit.pbl.disaster.northwestpacifictsunami;
import org.junit.Test;

import java.time.LocalDateTime;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class NorthwestPacificTsunamiTest {

    //String qzqms = "1100011010101111101100111001111011010110010000000000000000000100001000000001100001001001100001111111111000001010001011001100111111101001010010110100111011111111001100100111111111111111111111100100000000000000000000000001000000000000000000000000000001";
    NorthwestPacificTsunamiParser northwestPacificTsunamiParser = new NorthwestPacificTsunamiParser();
    //NorthwestPacificTsunami northwestPacificTsunami = northwestPacificTsunamiParser.parse(qzqms);

    @Test
    public void canGetTsunamigenicPotential_0() {
        String qzqms = "1100011010101111101100111001111011010110010000000000000000000100001000000001100001001001100001111111111000001010001011001100111111101001010010110100111011111111001100100111111111111111111111100100000000000000000000000001000000000000000000000000000001";
        NorthwestPacificTsunami northwestPacificTsunami = northwestPacificTsunamiParser.parse(qzqms);
        TsunamigenicPotential expected = TsunamigenicPotential.tsunamigenicPotentialNoPossibilityOfaTSUNAMI;
        assertThat(northwestPacificTsunami.getTsunamigenicPotential(),is(expected));
    }

    @Test
    public void canGetTsunamigenicPotential_1() {
        String qzqms = "1100011010101111101100111001111011010110010000000000000100000100001000000001100001001001100001111111111000001010001011001100111111101001010010110100111011111111001100100111111111111111111111100100000000000000000000000001000000000000000000000000000001";
        NorthwestPacificTsunami northwestPacificTsunami = northwestPacificTsunamiParser.parse(qzqms);
        TsunamigenicPotential expected = TsunamigenicPotential.tsunamigenicPotentialPossibilityOfaDestructiveOCEANWIDE;
        assertThat(northwestPacificTsunami.getTsunamigenicPotential(),is(expected));
    }

    @Test
    public void canGetTsunamigenicPotential_2() {
        String qzqms = "1100011010101111101100111001111011010110010000000000001000000100001000000001100001001001100001111111111000001010001011001100111111101001010010110100111011111111001100100111111111111111111111100100000000000000000000000001000000000000000000000000000001";
        NorthwestPacificTsunami northwestPacificTsunami = northwestPacificTsunamiParser.parse(qzqms);
        TsunamigenicPotential expected = TsunamigenicPotential.tsunamigenicPotentialPossibilityOfaDestructiveRegionalTSUNAMI;
        assertThat(northwestPacificTsunami.getTsunamigenicPotential(),is(expected));
    }

    @Test
    public void canGetTsunamigenicPotential_7() {
        String qzqms = "1100011010101111101100111001111011010110010000000000011100000100001000000001100001001001100001111111111000001010001011001100111111101001010010110100111011111111001100100111111111111111111111100100000000000000000000000001000000000000000000000000000001";

        NorthwestPacificTsunami northwestPacificTsunami = northwestPacificTsunamiParser.parse(qzqms);
        TsunamigenicPotential expected = TsunamigenicPotential.tsunamigenicPotentialOther;
        assertThat(northwestPacificTsunami.getTsunamigenicPotential(),is(expected));
    }

    @Test
    public void testForTsunamiArrivalExpectedTime() {
        System.out.println("testforgetTsunamiArrivalExpectedTime()");
        String qzqms = "1100011010101111101100111001111011010110010000000000011100000100001000000001100001001100111111111111111000001010000000000000111111101001010011011111101111111111001100101111111111111111111111100100000000000000000000000001000000000000000000000000000001";
        NorthwestPacificTsunami northwestPacificTsunami = northwestPacificTsunamiParser.parse(qzqms);
        System.out.println(northwestPacificTsunami.toString());
    }
}