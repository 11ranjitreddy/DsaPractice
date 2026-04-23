package DSA.OOPs;

public class Bank {
    public static void main(String args[]){
        BankDetails b=new BankDetails();
        b.setCustomerName("Ranjit");
        b.setPassword("12345678");
        System.out.println(b.getCustomerName());
        System.out.println(b.getPassword());
    }
}
class BankDetails{
    public String CustomerName;
    private String Password;

    public void setCustomerName(String customerName){this.CustomerName=customerName;}
    public String getCustomerName(){return CustomerName;}

    public void setPassword(String password){this.Password=password;}
    public String getPassword(){return Password; }

}