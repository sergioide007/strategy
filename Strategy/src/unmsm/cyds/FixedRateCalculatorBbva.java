package unmsm.cyds;

public class FixedRateCalculatorBbva implements RateCalculatorInterface {

    private double rate;
    private double plazo;
    private double VALOR_MERCADO = 0.2;

    public double getAnnualRate() {
    	if (this.plazo > 2 && this.rate < 1) {
        	rate += VALOR_MERCADO;
        }
        return rate;
    }

    public double getMonthlyRate() {
        return rate / 12;
    }

    public double getDailyRate() {
        return rate / 365;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
    
	public void setPlazo(double plazo) {
		this.plazo = plazo;
	}

	public double calculate(double amount, double year) {
		return amount*Math.pow((1+this.getAnnualRate()), year);
	}
	
}
