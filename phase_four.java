package phase_four;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import java.io.*;
import java.util.*;
import java.text.*;
public class phase_four
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
			pcount=modify_patient(pcount,pnumber,pfirstname,plastname,paccountbalance,page);
		else 
			if (selection == 2)
				dcount=modify_physician(dcount,dnumber,dfirstname,dlastname,dspeciality);
			else 
				if (selection == 3)
					mcount=modify_medical(mcount,patientnumber,doctornumber,adate,acost);
				else 
					if (selection == 4)
						report_section(pcount,pnumber,pfirstname,plastname, paccountbalance, page,
								dcount,dnumber,dfirstname,dlastname, dspeciality,mcount,patientnumber,
								doctornumber,adate,acost);
		  selection = main_menu();
		}
		exit_upmc(pcount,pnumber,pfirstname,plastname, paccountbalance, page,
				dcount,dnumber,dfirstname,dlastname, dspeciality,mcount,patientnumber,
				doctornumber,adate,acost);
	    System.exit(0);
	}
	
	public static int begin_read_patient(int pcount,int[]pnumber,String[]pfirstname,String[]plastname,
			double[]paccountbalance,int[]page)
	    { 
		   	String newLine; 
	    	try
	        {
	           BufferedReader patient_file = new BufferedReader(new FileReader("patient.dat"));
	           while ((newLine = patient_file.readLine()) != null) 
	             {
	                StringTokenizer delimiter = new StringTokenizer(newLine,"#"); 
	                pcount=pcount+1;
	                pnumber[pcount] = Integer.parseInt(delimiter.nextToken());
	                pfirstname[pcount] =delimiter.nextToken();
	                plastname[pcount] =delimiter.nextToken();
	                paccountbalance[pcount] = Double.parseDouble(delimiter.nextToken());
	                page[pcount] = Integer.parseInt(delimiter.nextToken());
	              }
	             patient_file.close();
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
           BufferedReader doctor_file = new BufferedReader(new FileReader("doctor.dat"));
           while ((newLine = doctor_file.readLine()) != null) 
             {
                StringTokenizer delimiter = new StringTokenizer(newLine,"#"); 
                dcount=dcount+1;
                dnumber[dcount] = Integer.parseInt(delimiter.nextToken());
                dfirstname[dcount] =delimiter.nextToken();
                dlastname[dcount] =delimiter.nextToken();
                dspeciality[dcount] =delimiter.nextToken();
              }
             doctor_file.close();
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
	    		BufferedReader medical_file = new BufferedReader(new FileReader("medical.dat"));
	           while ((newLine = medical_file.readLine()) != null) 
	             {
	                StringTokenizer delimiter = new StringTokenizer(newLine,"#"); 
	                mcount=mcount+1;
	                patientnumber[mcount] = Integer.parseInt(delimiter.nextToken());
	                doctornumber[mcount] = Integer.parseInt(delimiter.nextToken());
	                adate[mcount] =delimiter.nextToken();
	                acost[mcount] = Double.parseDouble(delimiter.nextToken());
	              }
	             medical_file.close();
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
		String value;
		
		String output = "UPMC Medical Center" + " \n " + " \n " +
		"1. Add/Delete/Modify Patient Information" + " \n " +
		"2. Add/Delete/Modify Physician Information" + " \n " +
		"3. Add Medical Information" + " \n " +
		"4. Hospital Report System" + " \n " +
		"5. Exit the Medical System" + " \n " + " \n " +
		"Please enter your selection";
				value = JOptionPane.showInputDialog(null, output, "",
												JOptionPane.QUESTION_MESSAGE);
		selection = Integer.parseInt(value);
		return selection;
	}
	
	public static int modify_patient(int pcount,int[]pnumber,String[]pfirstname,String[]plastname,
			double[]paccountbalance,int[]page)
	{
		int mselection,modselection;
		String output="",value;
		 int delvalue,position=0,i;
		 int modvalue;

		output="Patient Modification Menu"+"\n"+
		 "1. Add Patient"+"\n"+
		 "2. Delete Patient"+"\n"+
		 "3. Modify Patient"+"\n"+
	     "4. Exit Modify Patient"+"\n"+
	     "Please make your selection ";
				 value =JOptionPane.showInputDialog(null,
						 output," ",JOptionPane.QUESTION_MESSAGE);
		    	 mselection =Integer.parseInt(value);
		    while(mselection !=4)
		    {
		    	if(mselection ==1)
		    	{
		    	  pcount=pcount+1;
		    	  output= "Enter the Patient Number ";
			      value  =JOptionPane.showInputDialog(null,
			      output," ",JOptionPane.QUESTION_MESSAGE);
			      pnumber[pcount]=Integer.parseInt(value);
			      output= "Enter the Patient's First Name";
			      pfirstname[pcount]  =JOptionPane.showInputDialog(null,
			      output," ",JOptionPane.QUESTION_MESSAGE);
			      output= "Enter the Patient's Last Name";
			      plastname[pcount]  =JOptionPane.showInputDialog(null,
			      output," ",JOptionPane.QUESTION_MESSAGE);
			      output= "Enter the Patient Account Balance";
			      value  =JOptionPane.showInputDialog(null,
			      output," ",JOptionPane.QUESTION_MESSAGE);
			      paccountbalance[pcount]=Double.parseDouble(value);
			      output="Enter the Patient's age";
			      value  =JOptionPane.showInputDialog(null,
			    	output," ",JOptionPane.QUESTION_MESSAGE);
			    	page[pcount]=Integer.parseInt(value);
		    	}//add patient
		    	else
		    		if(mselection==2)
		    		{
		    			
		    		   output= " Enter the Patient Number to delete ";
					   value  =JOptionPane.showInputDialog(null,
					   output," ",JOptionPane.QUESTION_MESSAGE);
					   delvalue=Integer.parseInt(value);
					   for (i=0; i<=pcount; ++i)
					     {
					      if(pnumber[i]==delvalue) position = i;
					      }
					   for(i=position;i<=pcount-1;++i)
					   {
					      pnumber[i]=pnumber[i+1];
					      pfirstname[i]=pfirstname[i+1];
					      plastname[i]=plastname[i+1];
					      paccountbalance[i]=paccountbalance[i+1];
					      page[i]=page[i+1];
					   }
					   pcount=pcount-1;
		    	}//delete patient
		    		else
		    			if(mselection==3)
		    			{
		    				 output= " Enter the Patient Number to modify ";
		    				   value  =JOptionPane.showInputDialog(null,
		    				   output," ",JOptionPane.QUESTION_MESSAGE);
		    				   modvalue=Integer.parseInt(value); 
		    				   for (i=0; i<=pcount; ++i)
		    				     {
		    				      if(pnumber[i]==modvalue) position = i;
		    				      }
		    				   output="1. Change the Patient's first name "+"\n"+
		    				          "2. Change the Patient's  last name"+"\n"+
		    						  "3. Change the Patient's account balance"+"\n"+
		    				          "4. Change the Patient's age"+"\n"+
		    						  "Enter Your selection ";
		    				      value  =JOptionPane.showInputDialog(null,
		    				      output," ",JOptionPane.QUESTION_MESSAGE);
		    					  modselection=Integer.parseInt(value);
		    				      if(modselection ==1)
		    				           {
		    					        output= "Enter the NEW Patient First Name";
		    					        pfirstname[position]  =JOptionPane.showInputDialog(null,
		    				   		    output," ",JOptionPane.QUESTION_MESSAGE);
		    				            }
		    				      else
		    				    	  if(modselection ==2)
		    				    	  	{
		    						     output= "Enter the NEW Patient First Name";
		    						     plastname[position]  =JOptionPane.showInputDialog(null,
		    					   		 output," ",JOptionPane.QUESTION_MESSAGE);
		    				    	  	}
		    			    	  else
		    				    	  if(modselection ==3)
		    				    	  	{
		    				    		  output="Enter the NEW patient account balance";
		    				    		  value  =JOptionPane.showInputDialog(null,
		    				    				  output," ",JOptionPane.QUESTION_MESSAGE);
		    				    		  paccountbalance[position]=Double.parseDouble(value);
		    				    	  	}
		    			    	  else
		    				    	  if(modselection ==4)
		    				    	  	{
		    				    		  output="Enter the NEW patient age";
		    				    		  value  =JOptionPane.showInputDialog(null,
		    				    				  output," ",JOptionPane.QUESTION_MESSAGE);
		    				    		  page[position]=Integer.parseInt(value);
		    				    	  	}	
		    			}//modify patient
		    				
		    output="Patient Modification Menu"+"\n"+
		    	    "1. Add Patient"+"\n"+
		    	    "2. Delete Patient"+"\n"+
		    	    "3. Modify Patient"+"\n"+
		    	    "4. Exit Modify Patient"+"\n"+
		    	    "Please make your selection ";
		    	    value =JOptionPane.showInputDialog(null,
		    	    	      output," ",JOptionPane.QUESTION_MESSAGE);
		    	    mselection =Integer.parseInt(value);
		    }
		    return pcount;
		}
	
	public static int modify_physician(int dcount,int[]dnumber,String[]dfirstname,String[]dlastname,
			String[]dspeciality)
	{
		   String output="",value;
		    int pselection,position=0,i;
		    int modvalue;
		    int modselection;
		    output="Physician Modification Menu"+"\n"+
		    	    "1. Add Physician"+"\n"+
		    	    "2. Delete Physician"+"\n"+
		    	    "3. Modify Physician"+"\n"+
		    	    "4. Exit Modify Physician"+"\n"+ 
		    	    "Please make your selection ";
		    	    value =JOptionPane.showInputDialog(null,
		    	    	      output," ",JOptionPane.QUESTION_MESSAGE);
		    	    pselection =Integer.parseInt(value);
		    while(pselection !=4)
		    {
		    	if(pselection ==1)
		    	{
		    		dcount=dcount+1;
		    	    output= "Enter the Physician Number";
		    	    value  =JOptionPane.showInputDialog(null,
		    	    output," ",JOptionPane.QUESTION_MESSAGE);
		    	    dnumber[dcount]=Integer.parseInt(value);
		    	    output= "Enter the Physician's first name";
		    	    dfirstname[dcount]  =JOptionPane.showInputDialog(null,
		    	    output," ",JOptionPane.QUESTION_MESSAGE);
		    	    output= "Enter the Physician's last name";
		    	    dlastname[dcount]  =JOptionPane.showInputDialog(null,
		    	    output," ",JOptionPane.QUESTION_MESSAGE);
		    	    output= "Enter the Physician's specialty";
		    	    dspeciality[dcount]  =JOptionPane.showInputDialog(null,
		    	    output," ",JOptionPane.QUESTION_MESSAGE);
		    	}
		    		
		    	else
		    		if(pselection==2)
		    		{
		    			
		    		  	   int delvalue;
		    		  	   output= " Enter the Physician Number to delete ";
		    		  	   value  =JOptionPane.showInputDialog(null,
		    		  	   output," ",JOptionPane.QUESTION_MESSAGE);
		    		  	   delvalue=Integer.parseInt(value);
		    		  	   for (i=0; i<=dcount; ++i)
		    		  	     {
		    		  	      if(dnumber[i]==delvalue) position = i;
		    		  	      }
		    		  	   for(i=position;i<=dcount-1;++i)
		    		  	   {
		    		  	      dnumber[i]=dnumber[i+1];
		    		  	      dfirstname[i]=dfirstname[i+1];
		    		  	      dlastname[i]=dfirstname[i+1];
		    		  	      dspeciality[i]=dspeciality[i+1];
		    		  	   }
		    		  	   dcount=dcount-1;
		    		}
		    			
		    		else
		    			if(pselection==3)
		    		{
		    				
		    			     output= " Enter the Physician Number to modify ";
		    			     value  =JOptionPane.showInputDialog(null,
		    			     output," ",JOptionPane.QUESTION_MESSAGE);
		    			     modvalue=Integer.parseInt(value); 
		    			     for (i=0; i<=dcount; ++i)
		    			       {
		    			        if(dnumber[i]==modvalue) position = i;
		    			        }
		    			        output="1. Change the Physician's First Name "+"\n"+
		    			               "2. Change the Physician's Last Name "+"\n"+
		    			        	   "3. Change the Physician's Specialty"+"\n"+
		    			               "Enter Your selection ";
		    			        value  =JOptionPane.showInputDialog(null,
		    			        output," ",JOptionPane.QUESTION_MESSAGE);
		    			  	    modselection=Integer.parseInt(value);
		    			        if(modselection ==1)
		    			             {
		    			  	        output= "Enter the NEW Physician First Name";
		    			  	        dfirstname[position]  =JOptionPane.showInputDialog(null,
		    			     		    output," ",JOptionPane.QUESTION_MESSAGE);
		    			              }
		    			        else
		    			      	  if(modselection ==2)
		    			      	  	{
		    			      		 output= "Enter the NEW Physician Last Name";
		    			      		 dlastname[position]  =JOptionPane.showInputDialog(null,
		    			     		    output," ",JOptionPane.QUESTION_MESSAGE);
		    			      	  	}
		    			      	  else
		    				      	  if(modselection ==3)
		    				      	  	{
		    				      		 output= "Enter the NEW Physician Specialty";
		    				      		 dspeciality[position]  =JOptionPane.showInputDialog(null,
		    				     		    output," ",JOptionPane.QUESTION_MESSAGE);
		    				      	  	}
		    		}
		    			
		    				
		    output="Physician Modification Menu"+"\n"+
		    	    "1. Add Physician"+"\n"+
		    	    "2. Delete Physician"+"\n"+
		    	    "3. Modify Physician"+"\n"+
		    	    "4. Exit Modify Physician"+"\n"+
		    	    "Please make your selection ";
		    	    value =JOptionPane.showInputDialog(null,
		    	    	      output," ",JOptionPane.QUESTION_MESSAGE);
		    	    pselection =Integer.parseInt(value);
		    }
		    return dcount;
		}

	public static int modify_medical(int mcount,int[]patientnumber,int[]doctornumber,String[]adate,
			double[]acost)	
	{
		System.out.println("Add/Modify Medical Information");
	    String output,value;	
	    mcount=mcount+1;
	    output= "Enter the Patient's Number";
	    value  =JOptionPane.showInputDialog(null,
	    output," ",JOptionPane.QUESTION_MESSAGE);
	    patientnumber[mcount]=Integer.parseInt(value);
	    output= "Enter the Physician's Number";
	    value  =JOptionPane.showInputDialog(null,
	    	    output," ",JOptionPane.QUESTION_MESSAGE);
	    doctornumber[mcount]=Integer.parseInt(value);
	    output= "Enter the Date";
	    adate[mcount]  =JOptionPane.showInputDialog(null,
	    output," ",JOptionPane.QUESTION_MESSAGE);
	    output="Enter the Cost";
	    value  =JOptionPane.showInputDialog(null,
	    output," ",JOptionPane.QUESTION_MESSAGE);
	    acost[mcount]=Double.parseDouble(value);
	    return mcount;
	}
	
	public static void report_section(int pcount,int[]pnumber,String[]pfirstname,String[]plastname,
	double[]paccountbalance,int[]page,int dcount,int[]dnumber,String[]dfirstname,String[]dlastname,
	String[]dspeciality,int mcount,int[]patientnumber,int[]doctornumber,String[]adate, double[]acost)
	{
		int Rselection,i;
		String value, words;
		words= "UPMC Report Section" + "\n "
	   +"1. All Patient Information" + "\n "
	   +"2. All Physician Information" + "\n "
	   +"3. All Medical Information" + "\n "
	   +"4. All Doctors of a specific specialty" + "\n "
	   +"5. All Senior patients" + "\n "
	   +"6. All Appointments information for a Specific Patient" + "\n "
	   +"7. All Appointments for a Specific Doctor" + "\n "
	   +"8. Total Fees (costs) Owed by a specific Patient" + "\n "
	   +"9. All Appointments for a specific date" + "\n "
	   +"10. Exit Report Section" + "\n"
	   +" Please Make your Selection" + "\n ";
	 		
	  value= JOptionPane.showInputDialog(null,words,"UPMC Medical Center",JOptionPane.INFORMATION_MESSAGE);
	  Rselection= Integer.parseInt(value);
	  
	  while (Rselection !=10)
	  {
		  if(Rselection ==1)
		  {
			 System.out.println("\n"+"ALL PATIENT INFORMATION");
        			 for(i=0;i<=pcount;++i)
        			 {
        				 System.out.println(pnumber[i]+"  "+pnumber[i]+"  "+pfirstname[i]+"  "+
  			 		           plastname[i]+"  "+paccountbalance[i]+"  "+page[i]);		 
        			 }
		  }
		  else
			  if(Rselection ==2)
			  {
				  System.out.println("\n"+"ALL PHYSICIAN INFORMATION");  
	       			 for(i=0;i<=dcount;++i)
	        			 {
	        				  System.out.println(dnumber[i]+"  "+dnumber[i]+" " +dfirstname[i]+"  "+
        			 		           dlastname[i]+"  "+dspeciality[i]);
	        			 }
			  } 
			  else
				  if(Rselection ==3)
				  {
					  System.out.println("\n"+"ALL MEDICAL INFORMATION");
					  for(i=0;i<=mcount;++i)
	        			 {
	        				 System.out.println(patientnumber[i]+" " +doctornumber[i]+"  "+
        			 		           adate[i]+"  "+acost[i]);
	        			 }
				  }
				  else
					  if(Rselection ==4)
					  {
						  System.out.println("ALL DOCTORS OF A SPECIFIC SPECIALTY");
						  value = JOptionPane.showInputDialog(null, "Enter the doctor's specialty to search for", " ", JOptionPane.QUESTION_MESSAGE);
						  for(i=0;i<=dcount;++i)
						     {
							  if(value.equals(dspeciality[i]))
						         {
						    	  	System.out.println(dnumber[i]+" "+dfirstname[i]+" "+dlastname[i]);		  
						         }//Match on the value and the dspeciality, doctor's specialty, from doctor arrays	
						     }//End of For Loop
					  }//End of Report 4
					  else
						  if(Rselection ==5)
						  {
							  System.out.println("ALL SENIOR PATIENTS");	  
							  value = JOptionPane.showInputDialog(null, "Enter the patient's age", " ", JOptionPane.QUESTION_MESSAGE);
							  for(i=0;i<=pcount;++i)
							     {
							      if(page[i]>60)
							         {
							    	 System.out.println(pnumber[i]+" "+pfirstname[i]+" "+plastname[i]+" "+page[i]);
							  	     	for(i=0;i<=pcount;++i)
							  	     	{
							  	    		if(paccountbalance[i]>100)
							  	    			System.out.println("Balance is past due");
							  	    			return;
							  	     	}//Match on paccountbalance, patient's account balance greater than 100, from patient arrays			  	     	
							         }//Match on page, patient's age older than 60, from patient arrays	
							     }//End of For Loop
						  }//End of Report 5
						  else
							  if(Rselection ==6)
							  {
								  System.out.println("ALL APPOINTMENTS INFORMATION FOR A SPECIFIC PATIENT");	
								  int findercode,m,d;
								  value = JOptionPane.showInputDialog(null, "Enter the patient number", " ", JOptionPane.QUESTION_MESSAGE);
								  findercode = Integer.parseInt(value);
								  for(i=0;i<=pcount;++i)
								     {
								      if(findercode==pnumber[i])
								         {
								    	  	System.out.println(pnumber[i]+" "+pfirstname[i]+" "+plastname[i]+" "+page[i]);
								  	     for(m=0;m<=mcount;++m)
								  	  	    {
								  	    		if(pnumber[i]==patientnumber[m])
								  	    		{
													  System.out.println(adate[m]+" "+acost[m]);
								  		  	  for(d=0;d<=dcount;++d)
								  		   		  {
								  		    		if(doctornumber[m]==dnumber[d])
								  		    			{
								  		    				System.out.println(dfirstname[d]+" "+dlastname[d]+" "+dspeciality[d]);
								  		    			}//d for loop
								  		   		  }//Match on patientnumber, patient's number, from the medical arrays and dnumber, doctor's patient, from doctor arrays						  		  	   	  
								  	    		}//Match on pnumber, patient's number, from the patient arrays, and the patientnumber, patient's number, from medical arrays	  	     						  	    		
								  	   	    }//m for loop
								         }//Match on the findercode and the pnumber, patient's number, from patient arrays				      
								      }//i for loop
							     }//end of Report 6				      
							  else
								  if(Rselection ==7)
								  {
									  System.out.println("ALL APPOINTMENTS FOR A SPECIFIC DOCTOR");	
									  int appcode,y,t;
									  value = JOptionPane.showInputDialog(null, "Enter the doctor's number", " ", JOptionPane.QUESTION_MESSAGE);
									  appcode = Integer.parseInt(value);
									  for(i=0;i<=dcount;++i)
									  {
									      if(appcode==dnumber[i])
									      {
									  System.out.println(dnumber[i]+" "+dfirstname[i]+" "+dlastname[i]);
									  	     for(y=0;y<=mcount;++y)
									  	  	 {
									  	    	if(dnumber[i]==doctornumber[y])
									  	    	{
									  	    		System.out.println(adate[y]+" "+acost[y]);
									  		  	  for(t=0;t<=pcount;++t)
									  		   		{
									  		    		if(patientnumber[y] ==pnumber[t])
									  		    			System.out.println(pnumber[t]+" "+pfirstname[t]+" "+plastname[t]);
									  		   		}//t for loop								  		  	  
									  		 	}//Match dnumber, doctor number, from doctor arrays, and patientnumber, patient's number, from medical arrays
									  	   	 }//y for loop									  	     
									      }//Match appcode and dnumber, doctor number, from doctor arrays								      
									  }//i for loop						  
								  }//end of Report 7						      
								  else
									  if(Rselection ==8)
									  {
										  System.out.println("TOTAL FEES (COSTS) OWED BY A SPECIFIC PATIENT");
										  int feecode,j,f;
										  double running_total;
										  value = JOptionPane.showInputDialog(null, "Enter the patient's number", " ", JOptionPane.QUESTION_MESSAGE);
										  feecode = Integer.parseInt(value);
										  for(i=0;i<=pcount;++i)
										  {
										      if(feecode==pnumber[i])
										      {
										    	  System.out.println(pnumber[i]+" "+pfirstname[i]+" "+plastname[i]+" "+paccountbalance[i]);
										  	     for(j=0;j<=mcount;++j)
										  	  	 {
										  	    	if(pnumber[i]==patientnumber[j])
										  	    	{
										  	    		System.out.println(adate[j]+" "+acost[j]);
										  		  	  for(f=0;f<=dcount;++f)
										  		   	  {
										  		    		if(doctornumber[j]==dnumber[f])
										  		    		{
										  		    			System.out.println(dnumber[f]+" "+dfirstname[f]+" "+dlastname[f]);
										  		    			running_total=paccountbalance[i]+acost[j];
										  		    			System.out.println("Total of the cost due: " + running_total);
										  		    		}//Match patientnumber, from medical arrays, and dnumber, doctor's number, from doctor arrays									  		    		
										  		   	  }//f for loop
										  	        }//Match pnumber, patient's number, from patient arrays, and patientnumber, patient's number, from medical arrays
										  	  	 }//j for loop
										      }//Match feecode and pnumber, patient's number, form patient arrays
										  }//i for loop									  
									}//end of Report 8							        	      
									  else
										  if(Rselection ==9)
										  {
											  System.out.println("ALL APPOINTMENTS DURING SPECIFIC DATES");
											  int c,l;	
											  value = JOptionPane.showInputDialog(null,
										                "Please enter the appointment date mm/dd/yyyy", "",JOptionPane.QUESTION_MESSAGE);											  
											  for(i=0;i<=mcount;++i)
											  {
											      if(value.equals(adate[i]))
											      {
											          //Print the variables
											          System.out.println(adate[i]+" "+acost[i]);
												      		for(c=0;c<=pcount;++c)
												      		{
												      				if(patientnumber[i]==pnumber[c])
												      				{
												      					System.out.println(pnumber[c]+" "+pfirstname[c]+" "+plastname[c]);		
												      						for(l=0;l<=dcount;++l)
												      						{
												      							if(doctornumber[c] ==dnumber[l])
												      							{
												      									System.out.println(dnumber[l]+" "+dfirstname[l]+" "+dlastname[l]);
												      							}//Match pnumber, patient number, from the patient arrays and dnumber, doctor's number, from the doctor arrays										      							
												      						}//l for loop							  		  	  
												      				}//Match patientnumber, patient number, from the medical arrays and pnumber, patient number, from the patient arrays									  	    	
												      		}//c for loop										      
											      }//Match code and adate, appointment date, from the medical arrays
											  }//i for loop										  
										  }//End of Report 9				  
											  
							  value= JOptionPane.showInputDialog(null,words,"UPMC Medical Center",JOptionPane.INFORMATION_MESSAGE);
							  Rselection= Integer.parseInt(value);
							  
		  }//end of while loop				      
        }//end report section
	
	public static void exit_upmc(int pcount,int[]pnumber,String[]pfirstname,String[]plastname,
			double[]paccountbalance,int[]page,int dcount,int[]dnumber,String[]dfirstname,String[]dlastname,
			String[]dspeciality,int mcount,int[]patientnumber,int[]doctornumber,String[]adate, double[]acost)
	{
		int i; 
		  try
		      {
		      BufferedWriter file_one = new BufferedWriter(new FileWriter("patient.dat"));
		            for (i=0; i<=pcount; ++i)
		             	 {
		                        file_one.write(pnumber[i]+"#"+pfirstname[i] + "#" + plastname[i] + "#" +paccountbalance[i]+ "#"+page[i]+ "#");
		                        file_one.newLine();
		            	  }
                    file_one.close();
		     }
		    catch (IOException error)
		          {
		              System.out.println("Error on file write " + error); 
		          }
		  try
		      {
		      BufferedWriter file_two = new BufferedWriter(new FileWriter("doctor.dat"));
		            for (i=0; i<=dcount; ++i)
		             	 {
		                        file_two.write(dnumber[i]+"#"+dfirstname[i] + "#" + dlastname[i] + "#" +dspeciality[i]+ "#");
		                        file_two.newLine();
		            	  }
		            file_two.close();
		     }
		    catch (IOException error)
		          {
		              System.out.println("Error on file write " + error); 
		          }
		  try
		      {
		      BufferedWriter file_three = new BufferedWriter(new FileWriter("medical.dat"));
		            for (i=0; i<=mcount; ++i)
		             	 {
		                        file_three.write(patientnumber[i]+"#"+doctornumber[i] + "#" + adate[i] + "#" +acost[i]+ "#");
		                        file_three.newLine();
		            	  }
 		            file_three.close();
		     }
		    catch (IOException error)
		          {
		              System.out.println("Error on file write " + error); 
		          }
		}//END OF EXIT_UPMC 
}//END OF CLASS