import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class counting
{
    static List<Long> primeFactor(long x) {
        List<Long> factors = new ArrayList<Long>();
        factors.clear();
        for (long i = 2; i <= x/2; i++){
            double tempx = x/i;
            if (tempx == (long)tempx) {
                factors.add(i);
                x = (long)tempx;
                //System.out.println(x);
                i--;
            }
        }
        factors.add((long)x);
        return factors;
    }
    
    static void sampleMethod()
    {
        long x = 0;
        while (true) {
            List<Long> factors = new ArrayList<Long>();
            factors = primeFactor(x);
            int length = factors.size();
            if (length == 1) {
                 System.out.println(" " + factors);
            }
             x++;
        }
    }
}
