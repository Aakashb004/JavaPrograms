import java.util.Scanner;
public class forloopq1 {
    public static void main(String args[]){
        try(Scanner scan = new Scanner(System.in)){
            System.out.println("Num a");
            int a = scan.nextInt();
            System.out.println("Num b");
            int b = scan.nextInt();
        for(int i=a;i<=b;i++){
            System.out.println(i);
        }
    }
    }
}
