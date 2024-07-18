import java.util.Scanner;
public class elseif {
    public static void main(String args[]){
        try(Scanner scan = new Scanner(System.in)){
        int score = scan.nextInt();
        if(score>=35 && score<60){
            System.out.print("pass");
        }
        else if(score>=60 && score<90){
            System.out.print("A grade");
        }
        else if(score>=90){
            System.out.print("S grade");
        }
        else{
            System.out.print("Fail");
        }
        }
    }
}
//  nested if meaans in the if statement we put another one or two if statement in the single if statememt..... for example is in whatsup app 