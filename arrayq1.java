import java.util.Scanner;
public class arrayq1 {
    public static void main(String args[]){
       try( Scanner scan = new Scanner(System.in)){
        int[] marks = new int[5];
        for(int i=0;i<=4;i++){
            marks[i] = scan.nextInt();
            
        }
        for(int i=0;i<=4;i++){
            System.out.println(marks[i]);
        }
       // System.out.println(marks[0]);
        //System.out.println(marks[1]);
        //System.out.println(marks[2]);
        //System.out.println(marks[3]);
       // System.out.println(marks[4]);
       }
    }    
}
