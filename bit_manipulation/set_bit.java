package bit_manipulation;

public class set_bit {
    public static void main(String[] args) {
        // 0101 --> 0111
        int n=5;
        int pos = 1;
        int bitMask = 1<<pos;
       int newNumber = bitMask|n;
       System.out.println(newNumber);
    }
}
