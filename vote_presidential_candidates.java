package vote_presidential_candidates;
import javax.swing.JOptionPane;
public class vote_presidential_candidates
{
	public static void main(String[] args) 
	{		
// Define all variables needed.
		String registration,gender,candidate;
		String economy, civil, coronavirus;
		double democrat_voters=0,republican_voters=0,other_voters=0,total_voters=0;
		int democrat=0,republican=0,other=0;
		double female_voters=0,male_voters=0;
		int female=0,male=0;
		double trump_voters=0,biden_voters=0;
		int trump=0,biden=0;
		int eco_trump=0,eco_biden=0;
		int civil_trump=0,civil_biden=0;
		int corona_trump=0,corona_biden=0;
		double percent_female_trump_voters, percent_female_biden_voters;
		int trump_females=0,biden_females=0;
		double percent_male_trump_voters, percent_male_biden_voters;
		int trump_males=0, biden_males=0;
		double percent_democrat_trump_voters, percent_republican_biden_voters;
		double percent_trump_economy, percent_trump_civil, percent_trump_coronavirus;
		double percent_biden_economy, percent_biden_civil, percent_biden_coronavirus;
		String more_data="yes";
		while(more_data.equals("yes"))
			{
			
// The data reads in the registration of the voter (Democrat, Republican, or Other).			
		registration=JOptionPane.showInputDialog(null,
                 "Enter your voter registration (Democrat, Republican, or Other) ", "",JOptionPane.QUESTION_MESSAGE);
// The data reads in the gender of the voter (Female or Male).			
		gender=JOptionPane.showInputDialog(null,
                "Enter your gender (Female or Male) ", "",JOptionPane.QUESTION_MESSAGE);
// The data reads in the Presidential candidate the voter is choosing (Trump or Biden).
		candidate=JOptionPane.showInputDialog(null,
                "Enter the Presidential candidate you are choosing (Trump or Biden) ", "",JOptionPane.QUESTION_MESSAGE);
// The data reads in which candidate has done better to manage the economy? (Trump or Biden).
		economy=JOptionPane.showInputDialog(null,
                "Which candidate has done better to manage the economy? (Trump or Biden) ", "",JOptionPane.QUESTION_MESSAGE);
// The data reads in which candidate has done better to manage civil unrest? (Trump or Biden).
		civil=JOptionPane.showInputDialog(null,
		         "Which candidate has done better to manage civil unrest? (Trump or Biden) ", "",JOptionPane.QUESTION_MESSAGE);
// The data reads in which candidate has done better to manage the coronavirus? (Trump or Biden).
		coronavirus=JOptionPane.showInputDialog(null,
				 "Which candidate has done better to manage coronavirus? (Trump or Biden) ", "",JOptionPane.QUESTION_MESSAGE);
		
// Start the loop that reads in ALL data:
		if(registration.equals("Democrat"))
		  	democrat=democrat+1;
		else
			if(registration.equals("Republican"))
				republican=republican+1;
			else
			   other=other+1;
			
		if(gender.equals("Female"))
			female=female+1;
		else
			male=male+1;
			
		if(candidate.equals("Trump"))
			trump=trump+1;
		else
			biden=biden+1;
			
		if(economy.equals("Trump"))
			eco_trump=eco_trump+1;
		else
			eco_biden=eco_biden+1;
		
		if(civil.equals("Trump"))
			civil_trump=civil_trump+1;
		else
			civil_biden=civil_biden+1;
			
		if(coronavirus.equals("Trump"))
				corona_trump=corona_trump+1;
		else
				corona_biden=corona_biden+1;
		
		// Compound Conditions:
		if((gender.equals("Female"))&&(candidate.equals("Trump")))
			trump_females=trump_females+1;
		else
			biden_females=biden_females+1;
		
		if((gender.equals("Male"))&&(candidate.equals("Trump")))
			trump_males=trump_males+1;
		else
			biden_males=biden_males+1;
		     more_data=JOptionPane.showInputDialog(null,
		    		 "Enter more ? yes/no", "",JOptionPane.QUESTION_MESSAGE);
		     }//End of the While Loop. Asks the user if he/she wants to enter more data.

// Count each thing you need to count:
		total_voters=female+male;
		female_voters=female;	
		male_voters=male;
		democrat_voters=democrat;
		republican_voters=republican; 
		other_voters=other;
// Mathematical calculations:	
		percent_female_trump_voters=trump_females*1.0/female;
		percent_female_biden_voters=biden_females*1.0/female;
		percent_male_trump_voters=trump_males*1.0/male;
		percent_male_biden_voters=biden_males*1.0/male;
		percent_democrat_trump_voters=democrat_voters*1.0/trump;
		percent_republican_biden_voters=republican_voters*1.0/biden;
		percent_trump_economy=eco_trump*1.0/total_voters;
		percent_trump_civil=civil_trump*1.0/total_voters;
		percent_trump_coronavirus=corona_trump*1.0/total_voters;
		percent_biden_economy=eco_biden*1.0/total_voters;
		percent_biden_civil=civil_biden*1.0/total_voters;
		percent_biden_coronavirus=corona_biden*1.0/total_voters;
	
// Prints the candidate who won.
if(trump_voters>biden_voters)
	{
	System.out.println("Trump is the candidate who won! "+"\n");	
	}
else
	if(biden_voters>trump_voters)
	{
	System.out.println("Biden is the candidate who won! "+"\n");	
	}
if(trump>biden)
	System.out.println("Trump is the candidate who won! "+"\n");	
else
	System.out.println("Biden is the candidate who won! "+"\n");
// Prints the total number of voters.
System.out.println("Total number of voters: "+ total_voters);
// Prints the number of female voters.
System.out.println("Total number of female voters: "+ female_voters);
// Prints the number of male voters.
System.out.println("Total number of male voters: "+ male_voters);
// Prints the total number of Democrats.
System.out.println("Total number of Democrats: "+ democrat_voters);
// Prints the total number of Republicans.
System.out.println("Total number of Republicans: "+ republican_voters);
//Prints the total number of Third Party Voters.
System.out.println("Total number of Third Party Voters: "+ other_voters+"\n");
// Prints the percent of female voters for Trump.
System.out.println("Percent of female voters for Trump: "+ percent_female_trump_voters);
// Prints the percent of female voters for Biden.
System.out.println("Percent of female voters for Biden: "+ percent_female_biden_voters);
// Prints the percent of male voters for Trump.
System.out.println("Percent of male voters for Trump: "+ percent_male_trump_voters);
// Prints the percent of male voters for Biden.
System.out.println("Percent of male voters for Biden: "+ percent_male_biden_voters);
// Prints the percent of Democrats voting for Trump.
System.out.println("Percent of Democrats voting for Trump: "+ percent_democrat_trump_voters);
// Prints the percent of Republicans voting for Biden.
System.out.println("Percent of Republicans voting for Biden: "+ percent_republican_biden_voters+"\n");
// Prints the percent of voters thinking Trump has done better to manage the economy.
System.out.println("Percent of voters thinking Trump has done better to manage the economy: "+ percent_trump_economy);
// Prints the percent of voters thinking Trump has done better to manage the civil unrest.
System.out.println("Percent of voters thinking Trump has done better to manage the civil unrest: "+ percent_trump_civil);
// Prints the percent of voters thinking Trump has done better to manage the coronavirus.
System.out.println("Percent of voters thinking Trump has done better to manage the coronavirus: "+ percent_trump_coronavirus);
System.out.println("Percent of voters thinking Biden has done better to manage the economy: "+ percent_biden_economy);
System.out.println("Percent of voters thinking Biden has done better to manage the civil unrest: "+ percent_biden_civil);
System.out.println("Percent of voters thinking Biden has done better to manage the coronavirus: "+ percent_biden_coronavirus);
// Prints all required data.
System.exit(0);
	}
}