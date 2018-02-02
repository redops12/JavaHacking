import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.ArrayList;
import java.util.Properties;
public class ReadingAndWriting
{
    public enum intMaybe {t,f,maybe}
    static List<String> read(String fileName) {
        try{
            String content = new String(Files.readAllBytes(Paths.get(fileName)));
            List<String> lines = Files.readAllLines(Paths.get(fileName));
            return lines;
        }catch(IOException e){
            e.printStackTrace(); 
            return null;
        }
    }

    static void store() {
        Properties str = new Properties();   
    }
}

