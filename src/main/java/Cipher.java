public class Cipher {

    private String text;
    private int shift;
    public Cipher(String text,int  shift){
        this.shift=shift;
    }
    public int getShift(){
        return this.shift;
    }
}

