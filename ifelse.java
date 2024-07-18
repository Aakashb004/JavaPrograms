import java.util.Scanner;
public class ifelse {
    public static void main(String args[]){
       try(Scanner scan = new Scanner(System.in)){
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        if(num1==num2){
            System.out.println("True");
        }
        else{
            System.out.print("False");
        }
    }
    }
}
