package universitystudents;
import javax.swing.JOptionPane;
public class universitystudents
{
	public static void main(String[] args) 
	{
		String name, value;
		int full_time_students, full_time_credits;
		int part_time_students, part_time_credits;
		int total_full_time_tuition, total_part_time_tuition, total_tuition;
		int total_enrollment;
		double full_time_avg,part_time_avg;
		double percent_full_time_students, percent_part_time_students;
		
		
		name = JOptionPane.showInputDialog(null, 
				"Enter the name of your University", 
				"Input Data", JOptionPane.QUESTION_MESSAGE);
		
		value = JOptionPane.showInputDialog(null,
			     "Enter the number of full time students",
			     "Input", JOptionPane. QUESTION_MESSAGE);
				 full_time_students=Integer.parseInt(value);

		value = JOptionPane.showInputDialog(null,
			     "Enter the total number of credits full time students are taking",
			     "Input", JOptionPane. QUESTION_MESSAGE);
				 full_time_credits=Integer.parseInt(value);
		
		value = JOptionPane.showInputDialog(null,
			     "Enter the number of part time students",
			     "Input", JOptionPane. QUESTION_MESSAGE);
				 part_time_students=Integer.parseInt(value);
		
		value = JOptionPane.showInputDialog(null,
				"Enter the total number of credits part time students are taking",
			     "Input", JOptionPane. QUESTION_MESSAGE);
				 part_time_credits=Integer.parseInt(value);
	
//	Mathematical calculations:
		total_full_time_tuition=full_time_credits*300;
		total_part_time_tuition=part_time_credits*300;
		total_tuition=total_full_time_tuition+total_part_time_tuition;
		total_enrollment=full_time_students+part_time_students;
		full_time_avg=full_time_credits/full_time_students;
		part_time_avg=part_time_credits/part_time_students;	
		percent_full_time_students=full_time_students*1.0/total_enrollment;
		percent_part_time_students=part_time_students*1.0/total_enrollment;
		
		System.out.println("Name of the University: "+name+"\n");
		System.out.println("Total number of Full Time students in the University: "+full_time_students+"\n");
		System.out.println("Total number of Full Time credits: "+full_time_credits+"\n");
		System.out.println("Average number of Full Time credits: "+full_time_avg+"\n");
		System.out.println("Total number of Part Time students in the University: "+part_time_students+"\n");
		System.out.println("Total number of Part Time credits: "+part_time_credits+"\n");	
		System.out.println("Average number of Part Time credits: "+part_time_avg+"\n");
		System.out.println("Total Full Time tuition: "+total_full_time_tuition+"\n");
		System.out.println("Total Part Time tuition: "+total_part_time_tuition+"\n");
		System.out.println("Total tuition: "+total_tuition+"\n");
		System.out.println("Total enrollment: "+total_enrollment+"\n");
		System.out.println("The percentage of Full Time students: "+percent_full_time_students+"\n");
		System.out.println("The percentage of Part Time students: "+percent_part_time_students+"\n");
		
	
		
        System.exit(0);
	}

}