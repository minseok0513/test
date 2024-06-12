package Practice_workout;

public class ArrayBasic2 {
	private double sum=0.0;
	private double ave;
	double[] arr = new double[5];
	public double getSum() {
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
		}
		return sum;
	}
	public double getAve() {
		return sum/arr.length;
	}
}
