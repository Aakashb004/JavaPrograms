import java.util.Scanner;
public class ternary {
    public static void main(String args []){
        try(Scanner scan = new Scanner(System.in)){
       int a = scan.nextInt();
       int b = scan.nextInt();
       String result=(a>b)?" A is greater":" B is greater";
       System.out.println(result);
    }
}
}