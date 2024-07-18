import java.util.Scanner;
public class ifelseparttwo {
    public static void main(String args[]){
        try(Scanner scan = new Scanner(System.in)){
        String meghana = scan.nextLine();
        if(meghana.equals("dead")){
            System.out.println("Surya meets ramya");
        }
        else{
            System.out.println("surya weds meghana");
        }
    }
    }
}
