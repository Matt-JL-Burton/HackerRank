import java.util.*;

public class tryThrowCatch9{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int B = scanner.nextInt();
            int H = scanner.nextInt();
            scanner.close();
            if (B > 0 && H > 0){
                System.out.println(B * H);
            } else {
                throw new Exception("Breadth and height must be positive");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}