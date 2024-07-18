public class functionq3 {
    void add(int num1,int num2){
        System.out.println(num1+num2);
    }
    void sub(int num1,int num2){
        System.out.println(num1-num2);
    }
    void mul(int num1,int num2){
        System.out.println(num1*num2);
    }
    void div(int num1,int num2){
        System.out.println(num1/num2);
    }
    public static void main(String args[]){
        functionq3 obj1 = new functionq3();
        obj1.add(10,5);
        obj1.sub(10,5);
        obj1.mul(10,5);
        obj1.div(10,5);
    }
}
