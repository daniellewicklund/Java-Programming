package lawyer_bill;
import javax.swing.JOptionPane;
public class lawyer_bill
{

	public static void main(String[] args)
	{
		String law_name, client_name, value;
		int client_hours;
		double court_cost, hourly_fee_before;
		double discount_amount, hourly_fee_after, final_amount;
		
		//Input
		law_name = JOptionPane.showInputDialog(null, 
				"Enter the name of the law firm", 
				"Input Data", JOptionPane.QUESTION_MESSAGE);
		
		client_name = JOptionPane.showInputDialog(null, 
				"Enter the name of the client", 
				"Input Data", JOptionPane.QUESTION_MESSAGE);
		
		value = JOptionPane.showInputDialog(null,
			     "Enter the number of hours for the client ",
			     "Input", JOptionPane. QUESTION_MESSAGE);
				 client_hours=Integer.parseInt(value);
				 
		value = JOptionPane.showInputDialog(null,
				"Enter the amount of the court cost ",
				"Input", JOptionPane. QUESTION_MESSAGE);
				court_cost=Double.parseDouble(value);

		//Calculation
		hourly_fee_before=client_hours*400;

		//Print results
			System.out.println(law_name);
			System.out.println("Client: "+ client_name+"\n");
			System.out.println("Numbers of Hours: "+client_hours);
			System.out.println("Pre-Discount Fee: "+hourly_fee_before);
			if (hourly_fee_before < 2500) 
			{	
				discount_amount = 0;
				System.out.println("Discount amount - No discount: "+ discount_amount);
				hourly_fee_after = hourly_fee_before - discount_amount;
				System.out.println("Fee after Discount: "+ hourly_fee_after);
				System.out.println("Court Cost: "+court_cost+"\n");
				final_amount = hourly_fee_after + court_cost;
				System.out.println("Final amount: "+ final_amount);		
			}
			if (hourly_fee_before >= 25000) 
			{	
				discount_amount = hourly_fee_before * 0.10;
				System.out.println("Discount amount - 10% : "+ discount_amount);
				hourly_fee_after = hourly_fee_before - discount_amount;
				System.out.println("Fee after Discount: "+ hourly_fee_after);
				System.out.println("Court Cost: "+court_cost+"\n");
				final_amount = hourly_fee_after + court_cost;
				System.out.println("Final amount: "+ final_amount);		
			}
			else
					if ((hourly_fee_before >= 2500)&&(hourly_fee_before < 10000))
					{
						discount_amount = hourly_fee_before * 0.02;
						System.out.println("Discount amount - 2% : "+ discount_amount);
						hourly_fee_after = hourly_fee_before - discount_amount;
						System.out.println("Fee after Discount: "+ hourly_fee_after);
						System.out.println("Court Cost: "+court_cost+"\n");
						final_amount = hourly_fee_after + court_cost;
						System.out.println("Final amount: "+ final_amount);	
					}
			
			else
					if ((hourly_fee_before >= 10000)&&(hourly_fee_before < 25000))
					{
						discount_amount = hourly_fee_before * 0.50;
						System.out.println("Discount amount - 50% : "+ discount_amount);
						hourly_fee_after = hourly_fee_before - discount_amount;
						System.out.println("Fee after Discount: "+ hourly_fee_after);
						System.out.println("Court Cost: "+court_cost+"\n");
						final_amount = hourly_fee_after + court_cost;
						System.out.println("Final amount: "+ final_amount);	
						}	
		System.exit(0);
	}

}