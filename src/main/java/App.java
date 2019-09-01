import  java.io.Console;

public class App {
    public static void main(String[] args) {
        Console myConsole = System.console();
        System.out.println("Welcome to the C-Cipher:");
        System.out.println("Enter your plaintext:");
        String text = myConsole.readLine();
        System.out.println("Enter the shift value");
        String stringShift = myConsole.readLine();
        int shift = Integer.parseInt(stringShift);
        Cipher cipher = new Cipher(text, shift);
        String endCipher = cipher.getCipherText();
        if (shift < 1 || shift > 26) {
            System.out.println("Enter a shiftKey between 1 and 26");
        } else {

            System.out.println("The cipher text is :" + endCipher);
        }

        String cipherText=endCipher;

        DeCipher decipher = new DeCipher(cipherText,shift);
        String endDeCipherText = decipher.getDeCiphertext();
        System.out.println( " The shift key is "+shift+"\n"+"The decipher text is \n" + endDeCipherText );
    }
}
