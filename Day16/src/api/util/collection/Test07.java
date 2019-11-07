package api.util.collection;

import java.util.HashMap;
import java.util.Map;

public class Test07 {
	public static void main(String[] args) {
// 개별적 접근 map
//	전체적 접근 set
//	Map-(K,  V) 세트 저장소
//	-이름 적어둔 책과 같다(이름 = K, 책 = V)
//		-이름k 중복 불가
//		-책 v 중복가능
//		자유도가 매우 높음/ 개별 접근에 특화
	    //물음표 오브젝트
	Map<String, Integer> map = new HashMap<>();
	
	
//	추가 put(K,v) (두개 이상 넣을때는 put)
	
	map.put("차은우", 22);
	map.put("공유", 40);
	map.put("정우성", 46);
	map.put("강동원", 38);
	map.put("원빈", 41);
	map.put("이정재", 46);
	
	map.put("원빈", 35);//key 값이 겹치면 갱신

//	Key 로 value 를 꺼내는 것만 가능
	System.out.println(map.get("정우성"));
	System.out.println(map.get("장동건"));
	
//	검색 : contains
	
	System.out.println(map.containsKey("정우성"));
	System.out.println(map.containsValue(46));
	
//	삭제 remove()
	
	map.remove("정우성");
	
	
	System.out.println(map);
	System.out.println(map.size());
	}
}
