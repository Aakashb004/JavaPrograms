class Mobile{
    String brand;
    int price;
   static String name;
   static{
    name="phone";
    System.out.println("in static block");
   }
   public Mobile(){
    brand="";
    price=200;name="phone";
    System.out.println("in constructor");
   }
    public void show(){
        System.out.println(brand+" : "+price+" : "+name);
    }
    public static void show1(Mobile obj){
        System.out.println(obj.brand+" : "+obj.price+" : "+name);
    }
}
public class string4 {
    public static void main(String a[]){
        Mobile obj1=new Mobile();
        obj1.brand="Apple";
        obj1.price=10000;
        Mobile.name="Smartphone";


    }
}
