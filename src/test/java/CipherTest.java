import org.junit.*;
import static org.junit.Assert.*;
public class CipherTest {
    @Test
    public void doCipher_inputIsString(){
        Cipher testCipher = new Cipher("text",0);
        assertEquals(true,testCipher instanceof Cipher);
    }
}
