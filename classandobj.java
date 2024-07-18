public class classandobj {
    String name = "";
    String proc = "";
    int ram = 0;
    int price =0;
    public static void main(String args[]){
        classandobj lap1 = new classandobj();
        lap1.name = "aa";
        lap1.proc = "i11";
        lap1.ram = 12;
        lap1.price = 100000;
        classandobj lap2 = new classandobj();
        lap2.name = "bb";
        lap2.proc = "i9";
        lap2.ram = 16;
        lap2.price = 105000;
        System.out.println(lap2.ram);
    }
    }
