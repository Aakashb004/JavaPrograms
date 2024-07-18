import java.util.Scanner;
public class elseifq1 {
    public static void main(String args[]){
        try(Scanner scan = new Scanner(System.in)){
            int s1 = scan.nextInt();
            int s2 = scan.nextInt();
            int s3 = scan.nextInt();
            int s4 = scan.nextInt();
            int s5 = scan.nextInt();
            int tot = s1+s2+s3+s4+s5;
            int avg = tot/5;
            if(avg<35){
                System.out.print("go to extra class");
            }
            else if(avg>=35 && avg<=60){
                System.out.print("dont need extra class");
            }
            else{
                System.out.print("Toppers");
            }
        }
    }
}
