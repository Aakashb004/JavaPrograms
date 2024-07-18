
class a{
    public void show(){
        System.out.println("it is A");
    }
}
class b extends a{
    public void show(){
        System.out.println("it is B");
    }
}
class c extends a{
    public void show(){
        System.out.println("it is C");
    }
}
public class polymorphism {
    public static void main(String a[]){
        a obj=new a();
        obj.show();
        obj=new b();
        obj.show();
        obj=new c();
        obj.show();

        
    }
}
