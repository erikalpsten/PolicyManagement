package com.mypackage;  

import java.util.ArrayList; 
import java.util.List;  
import java.math.BigDecimal;

public class PolicyServer { 
	
	// example policies
	private static Policy policy1 = new Policy("", "", "", "Paid Up", "30-Nov-1999", "",
			"5152.80", "", "", "1200.00", "Monthly", "", "30-Nov-2000", "", 
			"30-Dec-2000", "30-Nov-2009", "Cash Banked", "", "",
			new ArrayList<String>(){{add("foo"); add("bob");}});
	
	private static Policy policy2 = new Policy("", "", "", "Paid Up", "30-Nov-1999", "",
			"5152.80", "", "", "1200.00", "Yearly", "", "30-Nov-2000", "", 
			"30-Dec-2000", "30-Nov-2009", "Cash Banked", "" ,"" ,
			new ArrayList<String>(){{add("foo");}});

	private static List<Policy> policyList = new ArrayList<Policy>(){{add(policy1); add(policy2);}};
	
	public static List<Policy> getPolicies(){ 
		return policyList; 
	}
}