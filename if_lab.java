package if_lab;
import javax.swing.JOptionPane;
public class if_lab
{

	public static void main(String[] args)
	{
		int grade1,grade2,grade3;
		String data,name1,name2,name3,prompt;
      // Added average and count with the data type, int, below.		
		int average,count=0;
		
		name1=JOptionPane.showInputDialog(null, "Enter Student #1","Input Data", JOptionPane.QUESTION_MESSAGE);
		prompt=name1+"'s grade";
		data=JOptionPane.showInputDialog(null, prompt,"Input Data", JOptionPane.QUESTION_MESSAGE);
		grade1=Integer.parseInt(data);
		
		name2=JOptionPane.showInputDialog(null, "Enter Student #2","Input Data", JOptionPane.QUESTION_MESSAGE);
		prompt=name2+"'s grade";
		data=JOptionPane.showInputDialog(null, prompt,"Input Data", JOptionPane.QUESTION_MESSAGE);
		grade2=Integer.parseInt(data);
		
		name3=JOptionPane.showInputDialog(null, "Enter Student #3","Input Data", JOptionPane.QUESTION_MESSAGE);
		prompt=name3+"'s grade";
		data=JOptionPane.showInputDialog(null, prompt,"Input Data", JOptionPane.QUESTION_MESSAGE);
		grade3=Integer.parseInt(data);
		
		//Mathematical Calculations:
		//	Found the average grade.		
		  average=(grade1+grade2+grade3)/3;
		//  Found the count the number of grades that are lower than 70. 
		  if(grade1<70) count=count+1;
	         if(grade2<70) count=count+1;
	         if(grade3<70) count=count+1;
		  
		//OUTPUT AREA
			System.out.println("PROGRAM OUTPUT");
			//	Changed the instructor's name to my name below.	
			System.out.println("Danielle Wicklund");
			System.out.println("Student #1: "+name1+" grade = "+grade1);
			System.out.println("Student #2: "+name2+" grade = "+grade2);
			System.out.println("Student #3: "+name3+" grade = "+grade3);
			System.out.println("The average grade = "+average);
			System.out.println("The number of grades under 70 = "+count);
			//   Found and printed the names of those students who got an A (90 or better).
			  System.out.println("The following students got an A: ");
		        if(grade1>=90)
		        	System.out.println(name1);
		        if(grade2>=90)
		        	System.out.println(name2);
		        if(grade3>=90)
		        	System.out.println(name3);
			//   Found the highest grade and printed the grade along with the student who got that grade.
		        if((grade1>grade2)&&(grade1>grade3))
		        	System.out.println(name1+ " had the highest grade of "+grade1+".");
		        else
		        	if((grade2>grade1)&&(grade2>grade3))
			        	System.out.println(name2+ " had the highest grade of "+grade2+".");
		        	else
		        		System.out.println(name3+ " had the highest grade of "+grade3+"!");
		
		System.exit(0);
	}

}