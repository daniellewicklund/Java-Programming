package university;
import javax.swing.JOptionPane;
public class university {

	public static void main(String[] args) 
	
	{
		String name;
		int student;
		double tuition=0; 
		name=get_name();
		student=studentin();
		tuition=compute(student);
		final_print(name,student,tuition);
		System.exit(0);
		}
	// This method reads in the name of a University and passes it back. 
	public static String get_name()
	{
		String name;
		name=JOptionPane.showInputDialog(null,"Enter the name of a university: ",
				"Input Data",JOptionPane.QUESTION_MESSAGE);	
		return name;
	}

// This method reads in the number of students enrolled and passes it back.
	public static int studentin()
	{
		String data;
		int student;
	    data=JOptionPane.showInputDialog(null,"Enter the number of students enrolled:  ",
			"Input Data",JOptionPane.QUESTION_MESSAGE);	
	    student=Integer.parseInt(data);
	    return student;
	}

// This method calculates the tuition as 20000 times the number of students and passes it back.	
	public static double compute(int student)
	{
		double tuition;
		tuition = 20000*student;
	    return tuition;
	}

// This method prints the name of the University, the number of students enrolled, and the total tuition.
	public static void final_print(String name, int student,double tuition)
	{
		System.out.println("The name of the University: "+name+"\n");
		System.out.println("The total number of students enrolled: "+student+"\n");
		System.out.println("The tuition: "+tuition);
	}
}