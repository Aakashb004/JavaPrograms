public class functionex1 {
    void greeting(){
        System.out.println("WELCOME");
        good();
    }
    void good(){
        System.out.println("I AM GOOD");
    }
    public static void main(String args[]){
        functionex1 obj1 = new functionex1();
        obj1.greeting();
    }
}
