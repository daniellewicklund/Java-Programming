package phase_one;
import javax.swing.JOptionPane;
public class phase_one 
{

	public static void main(String[] args)
	{
		int selection;
		selection = main_menu();
		while (selection!=5)
		{
			if (selection == 1)
				modify_patient();
			else
				if (selection == 2)
					modify_physician();
				else
					if (selection == 3)
						modify_medical();
					else
						if (selection == 4)
			selection = main_menu();
		}
		    exit_upmc();
	        System.exit(0);
	}
	
	 public static void readings(String[] args)
	  {
		 begin_read_patient();
		 begin_read_doctor();
		 begin_read_medical();
	   System.exit(0);
	  }

	
	public static int main_menu()
	{
		int select;
		String value;
		
		String output = "UPMC Medical Center" + " \n " + " \n " +
		"1. Add/Modify Patient Information" + " \n " +
		"2. Add/Modify Physician Information" + " \n " +
		"3. Add/Modify Medical Information" + " \n " +
		"4. Hospital Report System" + " \n " +
		"5. Exit the Medical System" + " \n " + " \n "; 
				value = JOptionPane.showInputDialog(null, output, "",
												JOptionPane.QUESTION_MESSAGE);
		select = Integer.parseInt(value);
		return select;
	}
	
	public static void modify_patient()
	{
		System.out.println("Add/Modify Patient Information");
	}
	
	public static void modify_physician()
	{
		System.out.println("Add/Modify Physician Information");

	}
	
	public static void modify_medical()
	{
		System.out.println("Add/Modify Medical Information");

	}
	
	public static void report_section()
	{
		System.out.println("Hospital Report Section");

	}
	
	public static void begin_read_patient()
	 {
	    System.out.println("The modify_patient method has been executed.");
	 }
	
	public static void begin_read_doctor()
	 {
	    System.out.println("The modify_physician method has been executed.");
	 }
	
	  public static void begin_read_medical()
	  {
	    System.out.println("The modify_medical method has been executed.");
	  }
	
	public static void exit_upmc()
	{
		System.out.println("Exiting the Medical System");
	}
	
}