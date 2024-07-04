package pay_simple;
public class pay_simple
{
  public static void main(String[] args) 
  {
    double GrossPay,Hours,Rate,FedTax,
StateTax,LocTax,NetPay;
    String Name;

    Name  = "Jeanne";
    Hours = 25;
    Rate = 15.75;
    GrossPay = Hours * Rate;
    FedTax= GrossPay *0.3;
    StateTax=GrossPay *0.06;
    LocTax=GrossPay *0.01;
    NetPay=GrossPay -(FedTax+StateTax+LocTax);

  System.out.println("Name = "+Name);
  System.out.println("Gross Pay = "+GrossPay);
  System.out.println("Federal Tax = "+FedTax);
  System.out.println("State Tax = "+StateTax);
  System.out.println("Local Tax = "+LocTax);
  System.out.println("Net Pay = "+NetPay);
  System.exit(0);
  }
}