package lab2_errors_solution;
import javax.swing.JOptionPane;
public class lab2_errors_solution 
{
	public static void main(String[] args) 
	{
		int female, male;
		int count;
		String value;
		double female_avg,male_avg,total_average;
		//PERCENTS NEED TO BE DOUBLE IN THE NEXT LINE
		//int percent_female, percent_male;
		double percent_female, percent_male;
		
		value = JOptionPane.showInputDialog(null,
			     "Enter the number of females in the class",
			     "Input", JOptionPane. QUESTION_MESSAGE);
		//NEED TO CONVERT THE DATA
		female=Integer.parseInt(value);
		
		value = JOptionPane.showInputDialog(null,
			     "Enter the number of males in the class",
			     "Input", JOptionPane. QUESTION_MESSAGE);
		//NEED TO CONVERT THE DATA
		male=Integer.parseInt(value);
		
		value = JOptionPane.showInputDialog(null,
			     "Enter the Average GPA for the females",
			     "Input", JOptionPane. QUESTION_MESSAGE);
		//NEED TO CONVERT THE DATA
		female_avg=Double.parseDouble(value);
		
		value = JOptionPane.showInputDialog(null,
			     "Enter the Average GPA for the males",
			     "Input", JOptionPane. QUESTION_MESSAGE);
		//NEED TO CONVERT THE DATA
		male_avg=Double.parseDouble(value);
		
		count=female+male;
		//BECAUSE FEMALE AND MALE ARE INTEGERS, THE DECIMAL PLACES WILL BE CUT OFF
		//FORCE THE NUMBER TO BE STORED AS DOUBLE AND THEN DO THE DIVISION
		//percent_female=female/count;
		//percent_male=male/count;
		percent_female=female*1.0/count;
		percent_male=male*1.0/count;
		
		//THE PRESIDENCE OF OPERARTIONS IS NO CORRECT IN THE NEXT LINE
		//total_average=female_avg+male_avg/2;
		total_average=(female_avg+male_avg)/2;
		
		System.out.println("The total number of students = "+count+"\n");
		System.out.println("The number of females = "+female+"\n");
		System.out.println("The number of males = "+male+"\n");
		System.out.println("The percentage of females = "+percent_female+"\n");
		System.out.println("The percentage of males = "+percent_male+"\n");
		System.out.println("the average female GPA = "+female_avg+"\n");
		System.out.println("the average male GPA = "+male_avg+"\n");
		System.out.println("The overall average gpa = "+total_average+"\n");
		
        System.exit(0);
	}

}