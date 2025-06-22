
public class FinancialForecasting {
	public static double calculatefuturevalue(double presentvalue,double growthrate,int periods) {
		if(periods==0) {
			return presentvalue;
		}
		return calculatefuturevalue(presentvalue*(1+growthrate),growthrate,periods-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double presentValue = 1000.0;
		double growthRate = 0.05;
		int periods = 10; 
		double futureValue = calculatefuturevalue(presentValue, growthRate, periods);
        System.out.println("Future Value: " + futureValue);

	}

}
