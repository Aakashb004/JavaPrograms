class human{
    private int age;
    private String name;
    public human(){       //default constructor.........
        age=18;
        name="bihfifh";
    }
    public human(int a,String n){      // parameterized constructor.....
        age=a;
        name=n;
    }
    public int getAge(){
     return age;
    }
    public void setAge(int age){
     this.age=age;
    }
    public String getName(){
     return name;
    }
    public void setName(String name){
     this.name=name;
    }
 }
public class constructor {
    public static void main(String a[]){
        human obj=new human();
       // human obj1=new human(a:19, n:"aakash");
        System.out.println(obj.getName()+" : "+obj.getAge());
       // System.out.println(obj1.getName()+" : "+obj1.getAge());
      //  obj.setAge(19);
        //obj.setName("AAKASH");
 
        // System.out.println(obj.getName()+" : "+obj.getAge());
    }
}
