package api.lang.string;

public class Test05 {
	public static void main(String[] args) {
//		문자열 편집
		String url = "         http://www.naver.com                       ";
				System.out.println(url);
				System.out.println(url.trim()); //좌우 여백 제거
				
			url = "http://www.naver.com";
			url.substring(11, 15);
			
			String find = "naver";
			int start= url.indexOf(find);
			int finish = start +find.length();
			
			System.out.println(url.substring(start, finish));
			
			String song = "학교종이 떙떙땡 어서모여라";
			String[] result = song.split(" ");
			
			for(int i = 0 ; i<result.length; i++)
			System.out.print(result[i]);
			
			String[] result2 = url.split("[/.]");
			for (String str : result2) {
				System.out.println(str);
			}
			
//			치환  .replace()
			String str = "나는 카레가 싫어요";
			System.out.println(str.replace("싫어요", "좋아요"));
			System.out.println(str.replace("카레", "자바").replace("싫어요", "좋아요"));
			
	}

}
