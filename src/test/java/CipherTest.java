import org.junit.*;
import static org.junit.Assert.*;
public class CipherTest {
    @Test
    public void doCipher_inputIsStringAndInteger(){
        Cipher testCipher = new Cipher("text",0);
        assertEquals(true,testCipher instanceof Cipher);
    }

    @Test
    public void doCipher_getShift_number(){
       Cipher testCipher = new Cipher("text",0);
       assertEquals(0,testCipher.getShift());
    }
}
