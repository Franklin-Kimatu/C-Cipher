import  java.io.Console;

public class App {
    public static void main(String[] args) {
        Console myConsole = System.console();
        System.out.println("Welcome to the C-Cipher:");
        System.out.println("Enter your plaintext:");
        String plainText = myConsole.readLine();
        System.out.println("Enter the shift value");
        String stringShift = myConsole.readLine();
        int intShift = Integer.parseInt(stringShift);
        Cipher cipher= new Cipher(plainText,intShift);
        String endCipher= cipher.getCipherText();
        System.out.println("The cipher text is :"+endCipher);
    }
}
