public class returnstateex1 {
    int sum(int a,int b){
        int c=a+b;
        return c;
    }
    public static void main(String args[]){
        returnstateex1 obj1 = new returnstateex1();
       int sum =  obj1.sum(10,5);
        System.out.println(sum);
    }
}
 