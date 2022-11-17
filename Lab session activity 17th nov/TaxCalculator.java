package com.Assignments;

public class TaxCalculator {
//   String empName;
//  boolean isIndian;
//  double empSal;
  double taxAmount;
  public double calculateTax( String empName,
  boolean isIndian,double empSal) throws Exception {
	  
	  if(isIndian==false) {
		  throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax.");  // user define exception
	  } else {
		  if(empName==null) {
			  throw new EmployeeNameInvalidException("The employee name cannot be empty");  // user define exception
		  }
		  else {
			  if(empSal >100000) {
				  taxAmount=empSal*8/100;
				  System.out.println("The Tax amount is "+taxAmount);
			  }
			  else if(empSal > 50000 && empSal <100000) {
				  taxAmount=empSal*6/100;
				  System.out.println("The Tax amount is "+taxAmount);

			  }
			  else if(empSal > 30000 && empSal <50000) {
				  taxAmount=empSal*5/100;
				  System.out.println("The Tax amount is "+taxAmount);

			  }
			  else if(empSal > 10000 && empSal <30000) {
				  taxAmount=empSal*5/100;
				  System.out.println("The Tax amount is "+taxAmount);

			  }
			  else {
				  throw new TaxNotEligibleException("The employee does not need to pay tax");  // user define exception
			  }
		  }
	  }
	  
	  return taxAmount;
  }
}
