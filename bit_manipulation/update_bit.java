package bit_manipulation;
public class update_bit {
public static void main(String[] args) {
    // for 0  0101 --> 0001
        int n= 5;
        int pos = 2;
        int bitMask = 1<<pos;
        int notbitMask = ~(bitMask);
        int newNumber = notbitMask & n;
        System.out.println(newNumber);

        // for 1  0101-->0111
        int n1=5;
        int pos1 = 1;
        int bitMask1 = 1<<pos1;
       int newNumber1 = bitMask1|n1;
       System.out.println(newNumber1);
    }   
}