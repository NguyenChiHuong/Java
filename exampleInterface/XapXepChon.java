package exampleInterface;

public class XapXepChon implements XapXepInterface{

	@Override
	public void sapXepTang(double[] arr) {
		int i,j;
		int min_idx;
		for (i = 0; i < arr.length; i++) {
			min_idx = i;
			for (j = i + 1; j < arr.length; j++) {
				if(arr[j] < arr[min_idx]) {
					double temp = arr[j];
					arr[j] = arr[min_idx];
					arr[min_idx] = temp;
					//swap(arr[j],min_idx);
				}
			}
		}
		
	}

	@Override
	public void sapXepGiam(double[] arr) {
		int i,j;
		int min_idx;
		for (i = 0; i < arr.length; i++) {
			min_idx = i;
			for (j = i + 1; j < arr.length; j++) {
				if(arr[j] > arr[min_idx]) {
					double temp = arr[j];
					arr[j] = arr[min_idx];
					arr[min_idx] = temp;
					//swap(arr[j],min_idx);
				}
			}
		}
	}

}
