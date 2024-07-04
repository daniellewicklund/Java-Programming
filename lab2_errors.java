package lab2_errors;
import javax.swing.JOptionPane;
public class lab2_errors 
{

	public static void main(String[] args) 
	{
		int female, male;
		int count;
		String value;
		double female_avg,male_avg,total_average;
		int percent_female, percent_male;
// the local variable, female, is not initialized.
		value = JOptionPane.showInputDialog(null,
			     "Enter the number of females in the class",
			     "Input", JOptionPane. QUESTION_MESSAGE);
				female=Integer.parseInt(value);
// the local variable, male, is not initialized.
		value = JOptionPane.showInputDialog(null,
			     "Enter the number of males in the class",
			     "Input", JOptionPane. QUESTION_MESSAGE);
				male=Integer.parseInt(value);
// the local variable, female_avg, is not initialized.
		value = JOptionPane.showInputDialog(null,
			     "Enter the Average GPA for the females",
			     "Input", JOptionPane. QUESTION_MESSAGE);
				female_avg=Double.parseDouble(value);
// the local variable, male_avg, is not initialized.
		value = JOptionPane.showInputDialog(null,
			     "Enter the Average GPA for the males",
			     "Input", JOptionPane. QUESTION_MESSAGE);
				male_avg=Double.parseDouble(value);
				
				
		count=female+male;
// The percentage keeps coming up as 0, so I changed it to the format below.
		percent_female=(female * 100/count);
// The percentage comes up as 0, so I changed it to the format below.
		percent_male=(male * 100/count);
// When the program calculates the average, it does not come up with the correct result.
//		Thus, I put female_avg and male_avg in parentheses. This will help with the calculation and precedence of operations.
		total_average=(female_avg+male_avg)/2;

		System.out.println("The total number of students = "+count+"\n");
		System.out.println("The number of females = "+female+"\n");
		System.out.println("The number of males = "+male+"\n");
// I added a percentage sign, so it makes the result more understandable. 
		System.out.println("The percentage of females = "+percent_female+"%"+"\n");
// I added a percentage sign, so it makes the result more understandable.
		System.out.println("The percentage of males = "+percent_male+"%"+"\n");
		System.out.println("the average female GPA = "+female_avg+"\n");
		System.out.println("the average male GPA = "+male_avg+"\n");
		System.out.println("The overall average gpa = "+total_average+"\n");
		
        System.exit(0);
	}

}