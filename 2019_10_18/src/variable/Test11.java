package variable;
import java.lang.*;
public class Test11 {
        public static void main(String[] args) {
            int adult = 2;
            int kid = 3;
            double discountrate = (double)25/100; 
            
            int adultprice = 10000;
            int kidprice = 7000;
 
            int totalprice = adultprice * adult + kidprice * kid;
            double discountedprice = totalprice * discountrate;
            double pay = totalprice - discountedprice ;
            
            System.out.println((int)pay);
            
        }
    }
