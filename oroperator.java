import java.util.Scanner;
public class oroperator {
    public static void main(String args[]){
        try(Scanner scan = new Scanner(System.in)){
        boolean cricket = scan.nextBoolean();
        boolean football= scan.nextBoolean();
        if(cricket || football){
            System.out.println("Play");
        }
        else{
            System.out.println("Dont play");
        }
    }
    } 
}
