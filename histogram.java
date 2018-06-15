class histogram{
    private static void printStars(int[] stars, int numBrackets, int min, double step){
        for (int i = 0; i < stars.length; i++){
            if (i == stars.length-1)
                System.out.print((int)(min+(i*step)) + "-" + (int)(min+((i+1)*step)) + ":\t");
            else
                System.out.print((int)(min+(i*step)) + "-" + (int)(min+((i+1)*step-1)) + ":\t");
            for (int j = 0; j <stars[i]; j++){
                System.out.print("*");
            }
            System.out.println();
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
    
    static void histogram(int numBracs, int[] numbers){
        int min = min(numbers);
        int max = max(numbers);
        int range = max-min;
        double step = range/(double) numBracs;
        int[] bracs = new int[numBracs];
        for (int i = 0; i < numbers.length; i++){
            //System.out.println((int)((numbers[i]-min)/(step)));
            if (numbers[i] == max){
                bracs[numBracs-1]++;
            }else{
                bracs[(int)((numbers[i]-min)/(step))]++;
            }
        }
        printStars(bracs,numBracs,min,step);
    }
    
    private static double sum(double[] a, int start){
        if (a.length!=start)
            return a[start] + sum(a, start+1);
        return 0;
    }
    
    private static int sum(int[] a){
        return a[0] + sum(a, 1);
    }
    
    private static int sum(int[] a, int start){
        if (a.length!=start)
            return a[start] + sum(a, start+1);
        return 0;
    }
    
    static void histogram(int numBracs, int[] numbers, int min, int max){
        int range = max-min;
        double step = range/(double) numBracs;
        int[] bracs = new int[numBracs];
        for (int i = 0; i < numbers.length; i++){
            //System.out.println((int)((numbers[i]-min)/(step)));
            if (numbers[i] == max){
                bracs[numBracs-1]++;
            }else{
                bracs[(int)((numbers[i]-min)/(step))]++;
            }
        }
        System.out.println(sum(bracs));
        System.out.println(numbers.length);
        printStars(bracs,numBracs,min,step);
    }
    
    static void classroomInputs(){
        int[] oof = {26, 19, 45, 22, 79, 35, 21, 4, 76, 45, 56, 90, 88, 32, 45, 3, 66, 74, 77, 35, 24, 33, 42, 55, 76, 74, 88, 90};
        histogram(10, oof, 0, 100);
    }
}