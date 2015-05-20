package com.design.user.csw;

public class Main {

	public static void main(String[] args) {
		  Employee specles           = new Employee();
	      Payroll payroll             = new Payroll(specles);
	      TreatShare  treatShare      = new TreatShare(specles);
	      TaxDepartment taxDepartment = new TaxDepartment(specles);
	      specles.setEmployeeValues("Specles", 70000);
	      treatShare.noMoreTreat();
	      specles.setEmployeeValues("Specles", 90000);
	}

}
