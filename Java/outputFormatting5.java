import java.util.*;

public class outputFormatting5 {

    public static void main(String[] args) {
        System.out.println("Enter 3 lines in the format 'Word Number' using ENTER to go to a new line");
        Scanner scanner = new Scanner(System.in);
        String firstLineTxt = scanner.next();
        int firstLineInt = scanner.nextInt();
        String secondLineTxt = scanner.next();
        int secondLineInt = scanner.nextInt();        
        String thirdLineTxt = scanner.next();
        int thirdLineInt = scanner.nextInt();
        System.out.printf("================================\n");
        System.out.printf("%-14s %03d\n",firstLineTxt,firstLineInt);
        System.out.printf("%-14s %03d\n",secondLineTxt,secondLineInt);
        System.out.printf("%-14s %03d\n",thirdLineTxt,thirdLineInt);
        System.out.printf("================================\n");
        scanner.close();
    }
    
}
