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
       Cipher testCipher = new Cipher("text",1);
       assertEquals(1,testCipher.getShift());
    }

    @Test
    public void shiftValue_between0and26_String(){
        Cipher testCipher = new Cipher("text",1);
        assertEquals(true,testCipher instanceof Cipher);
    }

    @Test
    public void doCipher_errorMessage_String(){
        Cipher testCipher = new Cipher("text",1);
        assertEquals(" ",testCipher.getErrorM());
    }
    public void doCipher_getCipherText_String(){
        Cipher testCipher = new Cipher("text",1);
        assertEquals("ufyt",testCipher.getCipherText());
    }
}
