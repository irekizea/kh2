package Array;
import java.lang.*;
public class Test18 {
	public static void main(String[] args) {
		int[] a = new int[] {3, 5, 2, 1, 4};
		
	
		int t;// 변경
		
		
		for(int j = 0; j<a.length-1; j++) {
			int k=j;
		for (int i = j+1 ; i< a.length; i++) {
			if(a[k] >a[i]){
				k=i;
			}
		}
		t = a[j];
		a[j] = a[k];
		a[k]=t;
		}
	
		
		
		for(int i = 0; i <a.length; i++)
			System.out.println(a[i]);
	}
	}
	//select 정령 제대로

//확장 for(int n : data){
//System.out.println(n)'
//data 라는 저장소의 모든 내용을 한바퀴마다 n이라는 변수에 저장해라
