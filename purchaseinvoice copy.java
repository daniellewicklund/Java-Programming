package purchaseinvoice;
import javax.swing.JOptionPane;

public class purchaseinvoice 
{

	public static void main(String[] args) 
	{
		String name, streetaddress, location, itemname, data;
		double cost, total, tax, shipping, findue;
		int quantity;
		
		//input data
		name=JOptionPane.showInputDialog(null, "Enter first and last name", "Input Data", JOptionPane.QUESTION_MESSAGE);
		
		streetaddress=JOptionPane.showInputDialog(null, "Enter street address", "Input Data", JOptionPane.QUESTION_MESSAGE);
		
		location=JOptionPane.showInputDialog(null, "Enter city, state and zip", "Input Data", JOptionPane.QUESTION_MESSAGE);
		
		itemname=JOptionPane.showInputDialog(null, "Enter the item name of the item you wish to purchase", "Input Data", JOptionPane.QUESTION_MESSAGE);

		data= JOptionPane.showInputDialog(null, "Cost of the item", "Input Data", JOptionPane.QUESTION_MESSAGE);
			cost=Double.parseDouble(data);

		data=JOptionPane.showInputDialog(null, "Quantity of the item", "Input Data", JOptionPane.QUESTION_MESSAGE);
				quantity=Integer.parseInt(data);

				
		//calculations
				total=cost*quantity;
				tax=total*.07;
				shipping=total*.01;
				findue=total + tax + shipping;

				//Print results
				System.out.println("Ship to:");
				System.out.println(name);
				System.out.println(streetaddress);
				System.out.println(location +"\n");
				System.out.println("Item: " + itemname);	
				System.out.println("Item price: " +cost); 
				System.out.println("Quantity: " +quantity);
				System.out.println("Total: = " +total);
				System.out.println("Tax: " +tax);
				System.out.println("Shipping: " +shipping);
				System.out.println("Total Due: " +findue);

		System.exit(0);
			}

		}
