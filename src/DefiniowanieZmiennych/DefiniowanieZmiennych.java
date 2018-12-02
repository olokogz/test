package DefiniowanieZmiennych;

public class DefiniowanieZmiennych {

	private double A;
	private double B;
	private double C;
	private double sum;
	public double getA() {
		return A;
	}
	public void setA(double a) {
		A = a;
	}
	public double getB() {
		return B;
	}
	public void setB(double b) {
		B = b;
	}
	public double getC() {
		return C;
	}
	public void setC(double c) {
		C = c;
	}
	public double getSum() {
		return sum;
	}
	public void setSum(double sum) {
		this.sum = sum;
	}
	
	public DefiniowanieZmiennych(double A, double B, double C)
	{
		this.A=A;
		this.B=B;
		this.C=C;
	}
	public double sumVarGet(int A, int B, int C)
	{
		return A+B+C;
	}
	public double sumVarDef()
	{
		this.sum=A+B+C;
		return sum;
	}
	
	
}
