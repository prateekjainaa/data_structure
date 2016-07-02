package sort;

public class MergeSort {

	
	
	public static void main(String[] args) {
		int[] seq = {3, 4, 9, 100, 71, 29, 13, 31, 22, 5, 67};
		for(int i=0; i<seq.length;i++) {
			System.out.print(seq[i] + ", ");
		}
		System.out.println();
		int[] sort = mergeSort(seq);
		for(int i=0; i<seq.length;i++) {
			System.out.print(sort[i] + ", ");
		}
		
	}

	private static int[] mergeSort(int[] seq) {
		int n = seq.length;
		//System.out.println("length " + n);
		if(n==1) {
			return seq;
		}
		int partition = (int) (n/2);
		//System.out.println("partition "+ partition);
		int[] arr1 = new int[partition];
		int[] arr2 = new int[n - partition];
		arr1 = copyArr(seq, 0, partition);
		arr2 = copyArr(seq, partition, n);
		arr1 = mergeSort(arr1);
		arr2 = mergeSort(arr2);
		
		return merge(arr1, arr2);
	}
	
	private static int[] merge(int[] arr1, int[] arr2) {
		int fullLength = arr1.length + arr2.length;
		int [] merged = new int[fullLength];
		int size1 = 0;
		int size2 = 0;
		int counter = 0;
		while (size1 < arr1.length && size2 < arr2.length) {
			if(arr1[size1] > arr2[size2]) {
				merged[counter] = arr2[size2];
				size2++;
			}
			else {
				merged[counter] = arr1[size1];
				size1++;
			}
			counter++;
		}
		while(size1<arr1.length) {
			merged[counter] = arr1[size1];
			counter++;
			size1++;
		}
		while(size2<arr2.length) {
			merged[counter] = arr2[size2];
			counter++;
			size2++;
		}
		
		return merged;
	}

	private static int[] copyArr(int[] i, int from, int end) {
		int[] j = new int[end - from];
		for(int k=0; k< (end-from);k++) {
			j[k] = i[from + k];
		}
		return j;
	}	
}
