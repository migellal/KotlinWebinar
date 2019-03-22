import java.util.Optional;

public class JavaMethod {

    public void doSth(String str) {
        System.out.println(str.length());
    }

    public void doSth2(String str) {
        if (str != null)
            System.out.println(str.length());
        else {
            // else what???
        }
    }

    public void doSth3(Optional<String> optStr) {
        System.out.println(optStr.orElse("").length());
        // orElse what???
    }
}
