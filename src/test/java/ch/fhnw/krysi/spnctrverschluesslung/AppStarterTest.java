package ch.fhnw.krysi.spnctrverschluesslung;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Mario Winiker on 19.03.17.
 */
class AppStarterTest {

    @Test
    public void testBinaryToPlaintext() throws Exception {
        // given
        String binaryText = "0100000101100010";
        String plainText = "Ab";

        // when
        String testText = AppStarter.binaryToPlaintext(binaryText);

        // then
        assertEquals(plainText, testText);
    }

}
