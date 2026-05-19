package Labaratory_16;
/*


dasd
 */
//edasdas
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClearCode {

    static void main(){
        String regex = "//.*|/\\*(.|[\\r\\n])*?\\*/";
        try {
            String file = Files.readString(Paths.get("/home/faringen/Документы/IdeaProjects/all-works/src/Labaratory_16/ClearCode.java"));
            String cleanFile = file.replaceAll(regex, "$1");
            Files.writeString(Path.of("/home/faringen/Документы/IdeaProjects/all-works/src/Labaratory_16/result.txt"), cleanFile, StandardOpenOption.CREATE);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
