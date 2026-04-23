package DSA.OOPs;

public class Constructor {
    public static void main(String args[]){
        SmallConstructor s=new SmallConstructor("ranjit",23);
        System.out.println(s.name);
        System.out.println(s.roll);
        Studentt ss=new Studentt("rocky",23,"ranjit@123");
        Studentt s2=new Studentt(ss);

    }
}
class SmallConstructor{
    String name;
    int roll;
    SmallConstructor(String name,int roll){
        this.name=name;
        this.roll=roll;
    }
}

class Studentt{
    String name;
    int rolll;
    String passwordd;

    Studentt(String name,int rolll,String passwordd){
        this.name=name;
        this.rolll=rolll;
        this.passwordd=passwordd;
    }
    Studentt(Studentt ss){
        this.name=ss.name;
        this.rolll=ss.rolll;
        this.passwordd=ss.passwordd;
    }
}