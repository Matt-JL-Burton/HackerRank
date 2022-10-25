import java.util.Scanner;

public class testing{
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = "Hello";
        String y = scanner.nextLine();
        System.out.println(y);
        if (x == y){
            System.out.println("Same");
        } else {
            System.out.println("Not the smae");
        }
        scanner.close();

    }
    
}
