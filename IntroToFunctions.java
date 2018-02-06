public class IntroToFunctions
{   
    public static void main(String[] args){
        IntroToFunctions a = new IntroToFunctions();
        a.Mariam();
        a.Ben(5);
        System.out.println(a.Robert(41));
        System.out.println(a.Robert());
        System.out.println(a.Caleb(5, 6));
    }
    
    private void Mariam() {
        System.out.println("Yahoo!");
    }
    
    static private void Ben(int reps) {
        for (int i = 0; i < reps; i++) {
            System.out.println("Java Rules");
        }
    }
    
    private int Robert(){
        return 42;
    }
    
    private int Robert(int x){
        return x;
    }
    
    private int Caleb(int x, int y){
        return x + y;
    }
}
