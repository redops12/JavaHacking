
public class ThreeBlindMouse
{
    static Ask q = new Ask();
    public static void prog1() {
        Three();
        See();
        System.out.println("they chase down the farmer's wife on horseback");
    }
    
    public static void prog2() {
        int x = q.askInt("Int 1:");
        int y = q.askInt("Int 2:");
        System.out.println(sum(x,y));
        System.out.println(product(x,y));
    }
    
    public static void prog3() {
        System.out.println(adding(q.askInt("Enter int")));
    }
    
    private static void Three(){
        System.out.println("Three Blind Mice");
    }
    
    private static void See() {
        System.out.println("See how they run");
    }
    
    private static int sum(int x, int y) {
        return x + y;
    }
    
    private static int product(int x, int y) {
        return x * y;
    }
    
    private static int adding(int x) {
        int t = 0;
        for (int i = 0; i<x;i++)
            t += i;
        return t;
    }
}
