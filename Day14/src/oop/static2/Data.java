package oop.static2;

public class Data {
//	변수 하나만 독자적으로 이용가능
//	static int number = 1부터 100까지 합계
	static int number;
//	static 초기화 전용 구문
	static {
		for(int i = 1; i<=100; i++)
			number+=i;
	}

}
