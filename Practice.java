package Practice;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]MemberCode=new int[100];
		String[]MemberType=new String[100];
		String[]FirstName=new String[100];
		String[]LastName=new String[100];
		int[]Age=new int[100];
		String[]Gender=new String[100];
		int mcount =-1;
						
		int[]ClassCode=new int[100];
		String[]ClassName=new String[100];
		String[]BeginDate=new String[100];
		int ccount =-1;
				
		int[]regMemberCode=new int[100];
		int[]regClassCode=new int[100];
		int rcount =-1;








		//all classes a specific member is taking
		int searchcode,j,k;
		value = JOptionPane.showInputDialog(null, "Enter the member ID to search for", " ", JOptionPane.QUESTION_MESSAGE);
		searchcode = Integer.parseInt(value);
		for(i=0;i<=mcount;++i)
		   {
		    if(searchcode==MemberCode[i])
		       {
		System.out.println("\n"+FirstName[i]+" "+LastName[i]+" is registered for the following classes:");
			     for(j=0;j<=rcount;++j)
			  	 {
			    		if(MemberCode[i]==regMemberCode[j])
			      	{
				  	  for(k=0;k<=ccount;++k)
				   		{
				    		if(regClassCode[j] ==ClassCode[k])
					   		System.out.println(ClassCode[k]+" "+ClassName[k]+" "+BeginDate[k]);
				   		}//k loop
				 	}//match on registration code from member data and register data
			   	 }//j loop
		   }//match on the searchcode and the member code from member data
		    }//i for loop
			
	}

}
