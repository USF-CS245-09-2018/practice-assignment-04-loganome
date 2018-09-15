package pa4;

public class SelectionSort implements SortingAlgorithm {

	@Override
	public void sort(int[] a) {
		for(int j =0; j<a.length; j++) {
			int min =j;
			for (int i= j; i<a.length; i++) {
				if (a[min]>a[i]) {
					min=i;
				}
			}
			int temp= a[j];
			a[j]= a[min];
			a[min]= temp;
		}
		

	}

}
