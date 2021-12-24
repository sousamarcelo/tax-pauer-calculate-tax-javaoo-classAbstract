package entities;

public class NaturalPerson extends TaxPayer {
	
	private static Double BASE_INCAME = 2000.00;
	
	
	public Double healthExpense;
	
	public NaturalPerson() {
		super();
	}
	
	public NaturalPerson(String name, Double incame, Double helthExpense) {
		super(name, incame);
		this.healthExpense = helthExpense;
	}
	
	public Double getHealthExpense() {
		return healthExpense;
	}
	
	public void setHealthExpense(Double healthExpense) {
		this.healthExpense = healthExpense;
	}	

	@Override
	public Double taxPaid() {
		Double tax;
		 if(getIncame() < BASE_INCAME) {
			tax = (getIncame()*0.15) - (healthExpense*0.50); 
		} else {
			tax = (getIncame()*0.25) - (getHealthExpense()*0.50);
		}		 
		 return tax;
	}
	
	

}
