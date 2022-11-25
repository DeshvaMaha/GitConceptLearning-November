package org.com;

public class CompanyInfo {
	
	private void companyName() {
		System.out.println("Company name:CTS");

	}

	
	private void companyId() {
			System.out.println("Company id:8523");

	}
	
    private void companyAddrs() {
			System.out.println("Company addrs:05/tambaram");

	}
	
    private void companyLocation() {
		System.out.println("Company loc:Chennai");

}
    
    
	public static void main(String[] args) {
		
	CompanyInfo c=new CompanyInfo();
	c.companyName();
	c.companyId();
	c.companyAddrs();
	c.companyLocation();
	
	}
}
