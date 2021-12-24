package entities;

public class LegalPeason extends TaxPayer {
	
	private static Integer BASE_EMPLOYEE = 10;
	
	private Integer numberEmployees;
	
	public LegalPeason() {
		super();
	}
	
	public LegalPeason(String name, Double incame, Integer numberEmployees) {
		super(name, incame);
		this.numberEmployees = numberEmployees;
	}
	
	public Integer getNumberEmployees() {
		return numberEmployees;
	}
	
	public void setNumberEmployees(Integer numberEmployee) {
		this.numberEmployees = numberEmployee;
	}	

	@Override
	public Double taxPaid() {
		Double tax;
		if (getNumberEmployees() > BASE_EMPLOYEE) {
			tax = getIncame() * 0.14;
		} else {
			tax = getIncame() * 0.16;
		}
		return tax;
	}
	
	

}
