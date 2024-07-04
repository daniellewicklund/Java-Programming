package pet_lab;
import javax.swing.JOptionPane;
public class pet_lab
{
	public static void main(String[] args) 
	{
		String pet,temp;
		double payment;
		double dog_total=0,cat_total=0,other_total=0,total_payment=0;
		int dog=0,cat=0,other=0;
		String more_data="yes";
		String most_pets="";
		while(more_data.equals("yes"))
			{
		pet=JOptionPane.showInputDialog(null,
                 "Enter the pet type ", "",JOptionPane.QUESTION_MESSAGE);
		temp=JOptionPane.showInputDialog(null,
                "Enter the payment for the appointment ", "",JOptionPane.QUESTION_MESSAGE);
	    payment = Double.parseDouble(temp);
	    total_payment=total_payment+payment;
		if(pet.equals("dog"))
		    {
			dog=dog+1;
			dog_total=dog_total+payment;
			}
		else
			if(pet.equals("cat"))
			    {
				cat=cat+1;
				cat_total=cat_total+payment;
			    }
			else
			    {
				other=other+1;
				other_total=other_total+payment;
			    }
		     more_data=JOptionPane.showInputDialog(null,
                "Enter more ? yes/no", "",JOptionPane.QUESTION_MESSAGE);
		}//end of while
if((dog>cat)&&(dog>other))
	most_pets="dog";
else
	if((cat>dog)&&(cat>other))
		most_pets="cat";
	else
		most_pets="other";

System.out.println("\n"+"\n"+"The number of dogs = "+dog+" dog payments = "+dog_total);
System.out.println("The number of cats = "+cat+" cat payments = "+cat_total);
System.out.println("The number of other animals = "+other+" other payments = "+other_total);
System.out.println("The most pets seen = "+most_pets);
System.out.println("Total payments = "+total_payment);
System.exit(0);
	}
}