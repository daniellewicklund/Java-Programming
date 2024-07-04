package phase_two;
import javax.swing.JOptionPane;
import java.io.*;
import java.util.*;
import java.text.*;
public class phase_two 
{
	public static void main(String[] args)
	{	
//Patient parallel array
		int[] pnumber=new int[100];
		String[] pfirstname=new String[100];
		String[] plastname=new String[100];
		double[] paccountbalance=new double[100]; 
		int[] page=new int[100]; 
		int pcount=-1;
		
		pcount=begin_read_patient(pcount,pnumber,pfirstname,plastname,paccountbalance,page);
	    
//Doctor parallel array		    
		int[] dnumber=new int[100];
		String[] dfirstname=new String[100];
		String[] dlastname=new String[100];
		String[] dspeciality=new String[100]; 
		int dcount=-1;
		
		dcount=begin_read_doctor(dcount,dnumber,dfirstname,dlastname,dspeciality);
	    
//Medical parallel array
		int[] patientnumber=new int[100];
		int[] doctornumber=new int[100];
		String[] adate=new String[100];
		double[] acost=new double[100]; 
		int mcount=-1;
		
		mcount=begin_read_medical(mcount,patientnumber,doctornumber,adate,acost);

	    int selection;
		selection = main_menu();
		while (selection != 5)
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
						report_section(pcount,pnumber,pfirstname,plastname, paccountbalance, page,
								dcount,dnumber,dfirstname,dlastname, dspeciality,mcount,patientnumber,
								doctornumber,adate,acost);
		  selection = main_menu();
		}
		exit_upmc();
	    System.exit(0);
	}
	public static int begin_read_patient(int pcount,int[]pnumber,String[]pfirstname,String[]plastname,
			double[]paccountbalance,int[]page)
	    { 
		System.out.println("The modify_patient method has been executed.");
	    	String newLine; 
	    	try
	        {
	           BufferedReader lumber_file = new BufferedReader(new FileReader("patient.dat"));
	           while ((newLine = lumber_file.readLine()) != null) 
	             {
	                StringTokenizer delimiter = new StringTokenizer(newLine,"#"); 
	                pcount=pcount+1;
	                pnumber[pcount] = Integer.parseInt(delimiter.nextToken());
	                pfirstname[pcount] =delimiter.nextToken();
	                plastname[pcount] =delimiter.nextToken();
	                paccountbalance[pcount] = Double.parseDouble(delimiter.nextToken());
	                page[pcount] = Integer.parseInt(delimiter.nextToken());
	              }
	             lumber_file.close();
	          }
	      catch (IOException error) 
	        {
	        System.out.println("Error on file read " + error);
	        }
	    	return pcount; 
	    	}

	public static int begin_read_doctor(int dcount,int[]dnumber,String[]dfirstname,String[]dlastname,
			String[]dspeciality)
    {
    	String newLine; 
    	try
        {
           BufferedReader lumber_file = new BufferedReader(new FileReader("doctor.dat"));
           while ((newLine = lumber_file.readLine()) != null) 
             {
                StringTokenizer delimiter = new StringTokenizer(newLine,"#"); 
                dcount=dcount+1;
                dnumber[dcount] = Integer.parseInt(delimiter.nextToken());
                dfirstname[dcount] =delimiter.nextToken();
                dlastname[dcount] =delimiter.nextToken();
                dspeciality[dcount] =delimiter.nextToken();
              }
             lumber_file.close();
          }
      catch (IOException error) 
        {
        System.out.println("Error on file read " + error);
        }
    	return dcount; 
    	}
	
	public static int begin_read_medical(int mcount,int[]patientnumber,int[]doctornumber,String[]adate,
				double[]acost)
	 	
	    {
	    	String newLine; 
	    	try
	        {
	           BufferedReader lumber_file = new BufferedReader(new FileReader("medical.dat"));
	           while ((newLine = lumber_file.readLine()) != null) 
	             {
	                StringTokenizer delimiter = new StringTokenizer(newLine,"#"); 
	                mcount=mcount+1;
	                patientnumber[mcount] = Integer.parseInt(delimiter.nextToken());
	                doctornumber[mcount] = Integer.parseInt(delimiter.nextToken());
	                adate[mcount] =delimiter.nextToken();
	                acost[mcount] = Double.parseDouble(delimiter.nextToken());
	              }
	             lumber_file.close();
	          }
	      catch (IOException error) 
	        {
	        System.out.println("Error on file read " + error);
	        }
	    	return mcount; 
	    	}
	    
	public static int main_menu()
	{
		int selection;
		String value, words;
		words= "1. Add/Modify Patient Information" + "\n "
	   +"2. Add/Modify Physician Information" + "\n "
	   +"3. Add/Modify Medical Information" + "\n "
	   +"4. Hospital Report Section" + "\n "
	   +"5. Exit the Medical System" + "\n "
	    +" Please Make your Selection" + "\n ";
			
	  value= JOptionPane.showInputDialog(null,words,"UPMC Medical Center",JOptionPane.INFORMATION_MESSAGE);
	  selection= Integer.parseInt(value);
	  return selection;
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
	
	public static void report_section(int pcount,int[]pnumber,String[]pfirstname,String[]plastname,
	double[]paccountbalance,int[]page,int dcount,int[]dnumber,String[]dfirstname,String[]dlastname,
	String[]dspeciality,int mcount,int[]patientnumber,int[]doctornumber,String[]adate, double[]acost)
	{
		int selection;
		int i = 0;
		int Rselection;
		String value, words;
		words= "UPMC Report Section" + "\n "
	   +"1. All Patient Information" + "\n "
	   +"2. All Physician Information" + "\n "
	   +"3. All Medical Information" + "\n "
	   +"4. Report 4" + "\n "
	   +"5. Reprot 5" + "\n "
	   +"6. Report 6" + "\n "
	   +"7. Report 7" + "\n "
	   +"8. Report 8" + "\n "
	   +"9. Report 9" + "\n "
	   +"10. Exit Report Section" + "\n "
	    +" Please Make your Selection" + "\n ";
	 		
	  value= JOptionPane.showInputDialog(null,words,"UPMC Medical Center",JOptionPane.INFORMATION_MESSAGE);
	  Rselection= Integer.parseInt(value);
	  while (Rselection !=10)
	  {
		  if(Rselection ==1)
		  {
			 System.out.println("All Patient Information");
        	    System.out.println("    =============");
        			 for(i=0;i<=pcount;++i)
        			 {
        				 System.out.println(pnumber[i]+"  "+pnumber[i]+"  "+pfirstname[i]+"  "+
  			 		           plastname[i]+"  "+paccountbalance[i]+"  "+page[i]);		 
        			 }
		  }
		  else
			  if(Rselection ==2)
			  {
				  System.out.println("All Physician Information");  
	        	    System.out.println("    =============");
	        			 for(i=0;i<=dcount;++i)
	        			 {
	        				 System.out.println(dnumber[i]+"  "+dnumber[i]+" " +dfirstname[i]+"  "+
        			 		           dlastname[i]+"  "+dspeciality[i]);
	        			 }
			  } 
			  else
				  if(Rselection ==3)
				  {
					  System.out.println("All Medical Information");
					    System.out.println("    =============");
	        			 for(i=0;i<=mcount;++i)
	        			 {
	        				 System.out.println(patientnumber[i]+" " +doctornumber[i]+"  "+
        			 		           adate[i]+"  "+acost[i]);
	        			 }
				  }
				  else
					  if(Rselection ==4)
					  {
						  System.out.println("Report 4 to be defined in later phase");
					  }
					  else
						  if(Rselection ==5)
						  {
							  System.out.println("Report 5 to be defined in later phase");	  
						  }
						  else
							  if(Rselection ==6)
							  {
								  System.out.println("Report 6 to be defined in later phase");		  
							  }
							  else
								  if(Rselection ==7)
								  {
									  System.out.println("Report 7 to be defined in later phase");					  
								  }
								  else
									  if(Rselection ==8)
									  {
										  System.out.println("Report 8 to be defined in later phase");
			
									  }
									  else
										  if(Rselection ==9)
										  {
											  System.out.println("Report 9 to be defined in later phase");
										  }
		  			  value= JOptionPane.showInputDialog(null,words,"UPMC Medical Center",JOptionPane.INFORMATION_MESSAGE);
					  Rselection= Integer.parseInt(value);
		  }//end of while loop
	}//end report section
	public static void exit_upmc()
	{
		System.out.println("Exiting the Medical System");
	}
	
}