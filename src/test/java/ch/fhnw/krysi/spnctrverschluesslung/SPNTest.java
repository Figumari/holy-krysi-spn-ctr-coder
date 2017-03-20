package ch.fhnw.krysi.spnctrverschluesslung;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Mario Winiker on 20.03.17.
 */
class SPNTest {

    @Test
    void encrypt() {
        // given
        String ciphertext = "1010111010110100";
        String result;
        SPN spn = new SPN(4, 4, 4, "00010001001010001000110000000000");

        // when
        result = spn.encrypt("0001001010001111");

        // then
        assertEquals(ciphertext, result);

    }

}
