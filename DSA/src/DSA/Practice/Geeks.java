package DSA.Practice;

class Geek{
    String name;
    String id;


    Geek(String name ,String id){
        this.name=name;
        this.id=id;
    }

    Geek(Geek obj2){
        this.name=obj2.name;
        this.id=obj2.id;
    }
}



public class Geeks {
    public static void main(String args[]){

        System.out.println("Object 1");
        Geek g=new Geek("Ranjit","2");
        System.out.println("Name: "+g.name+" Id: "+g.id);

        System.out.println("Object 2");
        Geek g1=new Geek(g);
        System.out.println("Name: "+g1.name+" Id: "+g1.id);


    }
}
