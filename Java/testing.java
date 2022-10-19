import java.util.ArrayList;
import java.util.List;

public class testing{

    public static void main(String[] args) {
        List<String> y = new ArrayList<>();
        var x = y;
        y.add("Hello");
        System.out.println(x);

    }
    
}
