import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JavaStringCounter {

    public Map<String, Integer> foo(List<String> list) {
        Map<String, Integer> result = new HashMap<>();
        for (String str : list) {
            if (result.containsKey(str)) {
                int c = result.get(str) + 1;
                result.put(str, c);
            } else {
                result.put(str, 1);
            }
        }
        return result;
    }

}
