package exampleInterface;

public class PhanMemMayTinh implements MayTinhBoTuiInterface ,XapXepInterface{

	@Override
	public double cong(double a, double b) {
		// TODO Auto-generated method stub
		return a + b;
	}

	@Override
	public double tru(double a, double b) {
		// TODO Auto-generated method stub
		return a - b;
	}

	@Override
	public double nhan(double a, double b) {
		// TODO Auto-generated method stub
		return a * b;
	}

	@Override
	public double chia(double a, double b) {
		// TODO Auto-generated method stub
		return a / b;
	}

	@Override
	public void sapXepTang(double[] arr) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sapXepGiam(double[] arr) {
		// TODO Auto-generated method stub
		
	}

}
