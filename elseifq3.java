import java.util.Scanner;
public class elseifq3 {
    public static void main(String args[]){
        try(Scanner scan = new Scanner(System.in)){
            System.out.println("Enter your salary");
            int salary = scan.nextInt();
            System.out.println("Enter your age");
            int age = scan.nextInt();
            if(salary>=20000 || age<=25){
                System.out.println("eligible for loan");
                System.out.println("how much loan amount you need");
                int loan = scan.nextInt();
                if(loan<50000){
                    System.out.print("loan available");
                }
                else{
                    System.out.print("loan not available");
                }
            }
            else{
                System.out.print("no loan");
            }
        }
    }
}
