import java.io.*;


public class ifelse3{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        if (N%2 == 1){
            System.out.println("Weird");
        } else if (N<=5 && N>=2){
            System.out.println("Not Weird");
        } else if (N<=20 && N>=6){
            System.out.println("Weird");
        } else {
            System.out.println("Not Weird");
        }
        bufferedReader.close();
    }
}