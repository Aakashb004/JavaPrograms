public class functionex3 {
    void soap(int money){
        System.out.println(money);
        System.out.println("SOAP PURCHASED");
    }
    void chocolate(int money){
        System.out.println(money);
        System.out.println("CHOCOLATE PURCHASED");
    }
    void powder(int money){
        System.out.println(money);
        System.out.println("POWDER PURCHASED");
    }
    public static void main(String args[]){
        functionex3 obj1 = new functionex3();
        obj1.soap(20);
        obj1.chocolate(50);
        obj1.powder(30);
    }
}
