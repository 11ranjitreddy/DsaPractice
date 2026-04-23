package DSA.Practice;


class Gek{
    Gek(String  name) {
        System.out.println("Name:" + name);
    }
        Gek(String name,int id){
            System.out.println("Name: "+name+" Email: "+id);
        }

}
public class Constructor_Overloading {

    public static void main(String  args[]){
        Gek g=new Gek("ranjit");
        Gek g1=new Gek("Ranjit",2);
    }
}
