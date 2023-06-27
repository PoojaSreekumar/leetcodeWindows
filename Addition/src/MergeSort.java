
public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {31,21,51,61,92,1};
		sortArray(arr,0,arr.length-1);
	}
	
	static void sortArray(int a[],int l,int r){
		if(l<r) {
			int m=(l+r)/2;
			
			sortArray(a,l,m);
			sortArray(a,m+1,r);
			
			merge()
		}
	}
	
	static void merge(int b[])
}
