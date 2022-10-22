import java.util.*;

public class javaloops7{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        for (int i = 0;i < q;i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            int ans = a + b;
            String stringToPrint = "";
            for (int j = 1; j < (n+1); j++){
                stringToPrint = stringToPrint + ans + " ";
                ans = ans + ((int) Math.pow(2,j) * b); 
            }
        System.out.println(stringToPrint);
        }
        scanner.close();
    }
}