import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaMain {

    public static void main(String[] args) {
        KotlinStringCounter ksc = new KotlinStringCounter();
        List list = new ArrayList(Arrays.asList("", "", "Kotlin", "Kotlin", "Kotlin", "Java"));
        System.out.println(ksc.countString(list));
    }
}
