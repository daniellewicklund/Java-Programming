package compare_between_dates;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
public class compare_between_dates
{

	public static void main(String[] args)throws ParseException 
	{
		//program to read in a date string in the format month/day/year and change to string format year-month-day
		//read the beginning date, ending date and date to compare
		//once the strings are in the proper format, convert the string variables to Date variables
        //the Date variables are then compared
		//compare to see if the date is in between the beginning date and the ending date
		
		SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd");
	      
		String user_date,begin_date,end_date;
		String converted_user_date,converted_begin_date,converted_end_date;
		
		//Define three variables of the type Date
		Date D1_date_begin,D1_date_end,D1_date_user;
		
		//read in the strings and convert the strings to the proper string format
		//strings are passed back from the convert_the_date method
        begin_date=JOptionPane.showInputDialog(null,
                "Please enter the beginning date mm/dd/yyyy", "",JOptionPane.QUESTION_MESSAGE);
        converted_begin_date=convert_the_date(begin_date);
        
        end_date=JOptionPane.showInputDialog(null,
                "Please enter the beginning date mm/dd/yyyy", "",JOptionPane.QUESTION_MESSAGE);
        converted_end_date=convert_the_date(end_date);
        
        user_date=JOptionPane.showInputDialog(null,
                "Please enter the date to compare mm/dd/yyyy", "",JOptionPane.QUESTION_MESSAGE);
        converted_user_date=convert_the_date(user_date);
        
        //print date strings read in and after converted to proper string format       
        System.out.println("\n"+"Beginning date String variable "+begin_date+" String variable converted "+converted_begin_date);
        System.out.println("Ending date String variable"+end_date+" String variable converted "+converted_end_date);
        System.out.println("Date to compare String variable"+user_date+" String variable converted "+converted_user_date+"\n");
       
        //the next three statements convert the string variables to variables of the type Date
        D1_date_begin = sdformat.parse(converted_begin_date);
        D1_date_end = sdformat.parse(converted_end_date);
        D1_date_user = sdformat.parse(converted_user_date);
        
        //print the date variables
        System.out.println("\n"+"Beginning Date variable " + sdformat.format(D1_date_begin));
        System.out.println("Ending Date variable " + sdformat.format(D1_date_end));
        System.out.println("Date variable to compare " + sdformat.format(D1_date_user));
	    
        //see if the date to compare is between the beginning and the ending date
        if(((D1_date_user.compareTo(D1_date_begin))>0)&&(D1_date_user.compareTo(D1_date_end)<0))
            System.out.println("\n"+"The date to be compared IS between the beginning date and ending date");
        else
        	System.out.println("\n"+"The date to be compared IS NOT between the beginning date and ending date");
              
       	System.exit(0);
		
	}
	public static String convert_the_date(String user_date)
	{
		String month="", day="", year="";
		String converted_date="";
		int position,length_of_date,i;
		length_of_date=user_date.length();
       
        position=0;
        
        //get the month//
        while(user_date.charAt(position)!='/')
        {
        	month=month+user_date.charAt(position);
        	position=position+1;
        }
       //add a zero if the month is one digit
        if(month.length()==1)
        	month="0"+month;
              
        //get the day
        position=position+1;
        while(user_date.charAt(position)!='/')
        {
        	day=day+user_date.charAt(position);
        	position=position+1;
        }
       //add a zero if the day is one digit
        if(day.length()==1)
        	day="0"+day;
     
        //get the year
        position=position+1;
       for(i=position;i<=length_of_date-1;++i)       
        {
        	year=year+user_date.charAt(i);
        }
      
        converted_date=year+"-"+month+"-"+day;
        return converted_date;
	}

}
