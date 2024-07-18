import java.util.Scanner;
public class arrayq3 {
    public static void main(String args[]){
        try(Scanner scan = new Scanner(System.in)){
            System.out.println("Which multiplication you want");
            int table = scan.nextInt(); 
        for(int i=1;i<=10;i++){
            int result = table*i;
            System.out.println(i+"*"+table+"="+result);
        }
    }
    }
}
