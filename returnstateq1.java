public class returnstateq1 {
    String name(){
        return "car";
    }
    int phone(int a){
        return a;
    }
    String address(){
        return "123-b,fuwffhfhihefhfhfsakhkfskgskskshgkfsjk";
    }
    public static void main(String args[]){
        returnstateq1 obj1 = new returnstateq1();
        String name = obj1.name();
        int phone = obj1.phone(1234567890);
        String address = obj1.address();
        System.out.println(name);
        System.out.println(phone);
        System.out.println(address);
    }
}
