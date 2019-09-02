import  java.io.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception{
//        Console myConsole = System.console();
        Scanner myConsole = new Scanner(System.in);
        System.out.println("Welcome to the C-Cipher:");
        System.out.println("Enter your plaintext:");
        String text = myConsole.nextLine();
        System.out.println("Enter the shift value");
        String stringShift = myConsole.nextLine();
        int shift = Integer.parseInt(stringShift);
        Cipher cipher = new Cipher(text, shift);
        String endCipher = cipher.getCipherText();
        if (shift < 1 || shift > 26) {
            System.out.println("Enter a shiftKey between 1 and 26");
        } else {

            System.out.println("The cipher text is :" + endCipher);
            String cipherText=endCipher;

            DeCipher decipher = new DeCipher(cipherText,shift);
            String endDeCipherText = decipher.getDeCiphertext();
            System.out.println("The shift key is "+shift+"\n"+"_________________________\n"+"The decipher text is :" + endDeCipherText +"\nThank you.");
            System.out.println("_________________________\n Run the program again to encypt and decrypt a text.");
        }


    }
}
