import java.util.Scanner;
public class firstq1 {
    public static void main(String args[]){
        try (Scanner scan = new Scanner(System.in)) {
            String name = scan.nextLine();
            int age = scan.nextInt();
            scan.nextLine();
            String address = scan.nextLine();
            System.out.println("My name is "+name);
            System.out.println("My age is "+age);
            System.out.print("My address is "+address);
        }
    }
}
