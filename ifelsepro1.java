import java.util.Scanner;
public class ifelsepro1 {
    public static void main(String args[]){
        try(Scanner scan = new Scanner(System.in)){
            int num = scan.nextInt();
            if(num%3==0 && num%5 ==0){
                System.out.println("pass");
            }
            else{
                System.out.print("fail");
            }
            
        }
    }
}
