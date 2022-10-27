import java.util.*;

class A{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fristInt = scanner.nextInt();
        double secondDouble = scanner.nextDouble();
        scanner.nextLine();
        String thridString = scanner.nextLine();
        System.out.println("String: " + thridString);
        System.out.println("Double: " + secondDouble);
        System.out.println("Int: " + fristInt);
        scanner.close();
    }
}
