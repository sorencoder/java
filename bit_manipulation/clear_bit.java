package bit_manipulation;

public class clear_bit {
    public static void main(String[] args) {
        // 0101 --> 0001 = 1 set 0 at position 2s
        int n= 5;
        int pos = 2;
        int bitMask = 1<<pos;
        int notbitMask = ~(bitMask);
        int newNumber = notbitMask & n;
        System.out.println(newNumber);
  
    }
}
