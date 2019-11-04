
 
import java.util.Random;
import java.util.Scanner;
 
public class Test07 {
public static void main(String[] args) {
    //지하철 요금표는 다음과 같습니다
    
    //성인(20~64세)    1250원
    //청소년(14~19세)    720원
    //어린이(8~13세)    450원
    //유아 및 노인        0원
    
    //사용자에게 생년월일 8자리를 입역받아 요금을 계산하고 
    //서울 지하청 창립 5주년을 맞아서 주사위를 던져서 5가 나오면 10%할인 진행
    //최종 금액은 얼마인가?
    
    Scanner sc=new Scanner(System.in);
    System.out.println("생년월일8자리를 입력하시오");
    int age=sc.nextInt();
    sc.close();
    
    
    int year=age/10000;                    //출생년도
//    System.out.println(year);
    int rage=2019-year+1;                 //현재 나이
    
    int pay;
    if(rage>=20&&rage<=64) {
        pay=1250;
    }
    else if(rage>=14&&rage<=19) {
        pay=720;
    }
    else if(rage>=8&&rage<=13) {
        pay=450;
    }
    else {
        pay=0;
    }
    
//    System.out.println(pay);        //원래 지불 해야할 버스금액
    
    
    Random r=new Random();
    
    int dice=r.nextInt(6)+1;
    System.out.println(dice);        //주사위 숫자
    
    if(dice==5) {
        System.out.println(pay*90/100+"원");
    }
    else {
        System.out.println(pay+"원");
    }
}
}
