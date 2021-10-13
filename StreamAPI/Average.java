package streamAPI;

public class Average {

	private double total;
	private int quant;
	
	public Average add(double value){
		total += value;
		quant++;
		return this;
	}
	
	public double getValue() {
		return total/quant;
	}
	
	public static Average combine(Average a1, Average a2) {
		Average result = new Average();
		result.total = a1.total + a2.total;
		result.quant = a1.quant + a2.quant;
		return result;
	}
	
	
}
