import java.util.Scanner;
public class forloopq2 {
    public static void main(String args[]){
        try(Scanner scan = new Scanner(System.in)){
            int evencount =0;
            int oddcount =0;
            for(int i=1;i<=10;i++){
                if(i%2==0){
                    evencount = evencount+1;
                    System.out.println("even num:"+i);
                }
                else{
                    oddcount = oddcount+1;
                    System.out.println("odd num: "+i);
                }
            }
            System.out.println("No of even num: "+evencount);
            System.out.println("No of odd num: "+oddcount);
        }
    }
}
