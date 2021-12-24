package entities;

public abstract class TaxPayer {
	
	private String name;
	private Double incame;
	
	public TaxPayer() {
		
	}
	
	public TaxPayer(String name, Double incame) {
		this.name = name;
		this.incame = incame;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Double getIncame() {
		return incame;
	}
	
	public void setIncame(Double incame) {
		this.incame = incame;
	}
	
	public abstract Double taxPaid();

}
