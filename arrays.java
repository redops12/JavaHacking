public class arrays{
    static void main(){
        int num = Ask.askInt("How many tests?");
        double[] a = new double[num];
        for (int i = 0; i < num; i++){
            a[i] = Ask.askDouble("Test Score " + (i+1));
        }
        double[] b = sort(a);
        System.out.print("{" + b[0]);
        for (int i = 1; i < b.length; i++){
            System.out.print(", " + b[i]);
        }
        Ask.say("}\navg\t : " + (sum(a,0)/5.0));
    }
    
    static double sum(double[] a, int start){
        if (a.length!=start)
            return a[start] + sum(a, start+1);
        return 0;
    }
    
    static double[] sort(double[] a){
        double[] b = a;
        for (int c = 0; c <b.length; c++){
            for (int i = 0; i < b.length-1; i++){
                if (b[i]>b[i+1]){
                    double temp = b[i];
                    b[i] = b[i+1];
                    b[i+1] = temp;
                }             
            }
        } 
        return b;
    }
}
