package unmsm.cyds;

public class InterestCalculatorContex {

	private RateCalculatorInterface rateCalculator;
	
	public double calculate(double amount, double year, RateCalculatorInterface rateCalculatorInterface) {
		rateCalculator = rateCalculatorInterface;
		return rateCalculator.calculate(amount, year);
	}

	
	
	public void setRateCalculator(RateCalculatorInterface rateCalculator) {
		this.rateCalculator = rateCalculator;
	}
	
		
}
