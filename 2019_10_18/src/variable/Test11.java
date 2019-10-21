package variable;
import java.lang.*;
public class Test11 {
        public static void main(String[] args) {
            int adult = 2;
            int kid = 3;
            double discountrate = (double)25/100; 
            
            int adultPrice = 10000;
            int kidPrice = 7000;
 
            int totalPrice = adultPrice * adult + kidPrice * kid;
            double discountedPrice = totalPrice * discountrate;
            double pay = totalPrice - discountedPrice ;
            
            System.out.println((int)pay);
            
        }
    }
