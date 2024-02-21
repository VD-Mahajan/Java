package Sorting;
	

public class SortInPolynomialTime {
	
	public static void main(String[] args) {
		int[] a= {0,0,0,1,1,1,1,0,0,1};
		
		int s=0,e=a.length-1;
		
		while(s<e) {
			if(a[s]<a[e] && a[s]==0) {
				s++;
			}else if(a[e]>a[s]) {
				a[s]=a[e];
				a[e]=0;
				e--;
			}else if(a[e]<a[s]) {
				a[e]=a[s];
				a[s]=0;
				s++;
			}else if(a[e]==a[s] && a[s]==1) {
				e--;
			}else if(a[e]==a[s] && a[s]==0){
				s++;
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+"  ");
		}
	}
}
