import java.util.Scanner;
public class arrayq5 {
    public static void main(String args[]){
        try(Scanner scan  = new Scanner(System.in)){
            int size = scan.nextInt();
            int[] marks = new int[size];
            for(int i=0;i<=size-1;i++){
                marks[i] = scan.nextInt();
            }
                int middleindex = marks.length/2;
                int middleElement = marks[middleindex];
                System.out.println("MIDDLE ELEMENT : "+middleElement);
        }
    }
}
