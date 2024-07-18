import java.util.Scanner;
public class elseifq2 {
    public static void main(String args []){
        try(Scanner scan = new Scanner(System.in)){
            String colour = scan.nextLine();
            if(colour.equals("red")){
                System.out.print("Stop");
            }
            else if(colour.equals("yellow")){
                System.out.print("get ready");
            }
            else if(colour.equals("green")){
                System.out.print("go");
            }
            else{
                System.out.print("take diverson");
            }
        }
    }
}
