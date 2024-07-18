import java.lang.System;
import java.util.Scanner;

 class getuserinput {
    public static void main(String args[]){
        try (Scanner A = new Scanner(System.in)) {
            String c = A.nextLine();
            int a = A.nextInt();
            int b = A.nextInt();
            System.out.println(c);
            System.out.print(a+b);
        }
    }
}
