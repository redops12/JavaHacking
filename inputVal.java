import java.util.*;
import java.io.*;
class inputVal{
    static void main() throws Exception{
        Scanner inFile = new Scanner(new FileReader("inputVal.txt"));
        int size = inFile.nextInt();
        int[] tests = new int[size];
        
        String input = Ask.ask("Max, Min, or Search?").toLowerCase();
        while (input.equals("max")||input.equals("min")||input.equals("search")){
            if (input.equals("search")){
                int num = Ask.askInt("Search for what number?");
            }
            
            
        }
    }
    
    private static int min(int[] a){
        int temp = a[0];
        for (int i = 1;i<a.length;i++){
            if (temp>a[i])
                temp = a[i];
        }
        return temp;
    }
    
    private static int max(int[] a){
        int temp = a[0];
        for (int i = 1;i<a.length;i++){
            if (temp<a[i])
                temp = a[i];
        }
        return temp;
    }
}