package Array;
import java.lang.*;
public class Test16 {
	public static void main(String[] args) {
		int[] data = new int[] {3, 5, 2, 1, 4};
		
//		 최대값 찾기
//		맨 앞자리 가장 크다 가정
//		뒤 값 지속 비교 더 큰값 존재시 교채
		int max = data[0];
		
		for (int i = 1; i < data.length; i++)
		
		if(max < data[i]) {
			max = data[i];
		}
		
	}

}
