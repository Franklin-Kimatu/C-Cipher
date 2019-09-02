public class Cipher {

    private String text;
    private String errorMe =" ";
    private int shift;
    private String cipherText =" ";
    public Cipher(String text,int  shift){
         this.shift=shift;
        if(shift < 1 || shift > 26){
            errorMe ="Enter a shiftKey between 1 and 26";
        }else {
            int length = text.length();
            for (int i = 0; i < length; i++) {
                char character = text.charAt(i);
                char shifted = (char) (character + shift);
                if (shifted > 'z' ) {
                    cipherText += (char) (character - (26 - shift));
                } else {
                    cipherText = cipherText + shifted;
                }
            }
        }
    }
    public int getShift(){
        return this.shift;
    }
    public String getErrorM(){
        return errorMe;
    }
    public String getCipherText(){
        return cipherText;
    }

}

