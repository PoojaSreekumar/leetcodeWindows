
public class Merge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,6,8,9};
		int b[]= {3,5,10,11,12};
		int[] a1=merged(a,b);
		for(int n:a1) {
			System.out.println(n);
		}
	}
	
	static int[] merged(int a[],int b[]) {
		int[] newArray=new int[a.length+b.length];
		int i=0;
		int k=0;
		int j=0;
		while((i<a.length)&&(j<b.length))
		 {
				if(a[i]<b[j]) {
					newArray[k]=a[i];
					i++;
					//j--;
					k++;
				}
				else {
					newArray[k]=b[j];
					j++;
					k++;
				}
			}
		while(i<=j) {
			newArray[k]=a[i];
			i++;
			//j--;
			k++;
		}
		
		while(j<=i) {
			newArray[k]=b[j];
			j++;
			k++;
		}
		
		return newArray;
		
	}

}
