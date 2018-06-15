import java.util.Scanner;
import java.text.*;
import java.io.*;
import java.awt.*;

class printingAndStuff {
    static void main() throws IOException{
        int num = Ask.askInt("Num");
        long tests[] = new long[num];
        PrintWriter output = new PrintWriter(new FileWriter("Output1.out")); 
        long prior = 0;
        long current = 1;
        for (int i = 0; i < num; i++){
            // current += prior;
            // prior = current - prior;
            current = (long)(100*Math.random());
            tests[i] = current;
        }
        print(tests, output);
        output.close();
    }
    
    static void print(long[] a, PrintWriter pw){
        pw.print("{" + a[0]);
        for (int i = 0; i <a.length; i++){
            pw.print("," + a[i]);
        }
        pw.println("}");
    }
    
    static void print(double[] a, PrintWriter pw){
        pw.print("{" + a[0]);
        for (int i = 0; i <a.length; i++){
            pw.print("," + a[i]);
        }
        pw.println("}");
        
    }
}