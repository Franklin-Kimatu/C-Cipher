public class DeCipher {
    private String deCiphertext ="";
    private String errorMe =" ";
    private int shift;
    private String cipherText;
    public DeCipher(String cipherText,int  shift){
        this.shift=shift;
        if(shift < 1 || shift > 26){
            errorMe ="Enter a shiftKey between 1 and 26";
        }else{
            int length = cipherText.length();
            for (int i =0; i<length; i++){
                char character = cipherText.charAt(i);
                char shifted = (char)(character - shift);
                if( shifted < 'a'){
                    deCiphertext += (char)( character +(26 - shift));
                }else{
                    deCiphertext=deCiphertext + shifted;
                }

            }
        }

    }

    public String getDeCiphertext()
    {
        return deCiphertext;
    }

}
