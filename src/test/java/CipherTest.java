import org.junit.*;
import static org.junit.Assert.*;
public class CipherTest {
    @Test
    public void doCipher_inputIsStringAndInteger(){
        Cipher testCipher = new Cipher("text",1);
        assertEquals(true,testCipher instanceof Cipher);
    }

    @Test
    public void doCipher_getShift_number(){
       Cipher testCipher = new Cipher("text",2);
       assertEquals(2,testCipher.getShift());
    }

    @Test
    public void shiftValue_between0and26_String(){
        Cipher testCipher = new Cipher("text",1);
        assertEquals(true,testCipher instanceof Cipher);
    }

    @Test
    public void doCipher_errorMessage_String(){
        Cipher testCipher = new Cipher("text",50);
        assertEquals("Enter a shiftKey between 1 and 26",testCipher.getErrorM());
    }

    @Test
    public void doCipher_getCipherText_String(){
        Cipher testCipher = new Cipher("text",1);
        assertEquals("ufyu",testCipher.getCipherText());
    }
    // testing the decipher output test
    @Test
    public void doDecipher_checkDeciphertext_String(){
        DeCipher deCipher = new DeCipher("ufyu",1);
        assertEquals("text",deCipher.getDeCiphertext());
    }
}
