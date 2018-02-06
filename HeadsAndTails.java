public class HeadsAndTails
{
    static public void sampleMethod()
    {
        Ask q = new Ask();
        int trials = q.askInt("How many trials?");
        int h = 0;
        int t = 0;
        for (int i = 1; i<=trials; i++){
            char response = q.askChar("Trial " + i + ", Input H or T");
            if (response == 'h') 
                h++;
            else if (response =='t')
                t++;
            else {
                System.out.println("Pick again");
                i--;
            }
        }
        System.out.println(h + " Heads, " + (100*h/trials) + "%\n" + t + " Tails, " + (100*t/trials) + "%");
    }
}
