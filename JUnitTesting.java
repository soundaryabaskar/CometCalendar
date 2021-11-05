package testing;

public class JUnitTesting {
	
	public boolean event(int month, int day) {
		
		// odd months have 31 days
		// even months have 30 days, except 2nd month with 28 days
		// checks if month and date are valid
		if( ((month == 1 || month == 3 ||
		   month == 5 || month == 7 || 
		   month == 8 || month == 10 || 
		   month == 12) && day <= 31) || 
				
		   ((month == 4 || month == 6 || 
		    month == 9 || month == 11) && day <= 30) ||
		   
		    (month == 2 && day <= 28) )
			return true;
		else
			return false;
	}
}
