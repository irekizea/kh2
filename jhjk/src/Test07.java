
 
import java.util.Random;
import java.util.Scanner;
 
public class Test07 {
public static void main(String[] args) {
    //����ö ���ǥ�� ������ �����ϴ�
    
    //����(20~64��)    1250��
    //û�ҳ�(14~19��)    720��
    //���(8~13��)    450��
    //���� �� ����        0��
    
    //����ڿ��� ������� 8�ڸ��� �Կ��޾� ����� ����ϰ� 
    //���� ����û â�� 5�ֳ��� �¾Ƽ� �ֻ����� ������ 5�� ������ 10%���� ����
    //���� �ݾ��� ���ΰ�?
    
    Scanner sc=new Scanner(System.in);
    System.out.println("�������8�ڸ��� �Է��Ͻÿ�");
    int age=sc.nextInt();
    sc.close();
    
    
    int year=age/10000;                    //����⵵
//    System.out.println(year);
    int rage=2019-year+1;                 //���� ����
    
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
    
//    System.out.println(pay);        //���� ���� �ؾ��� �����ݾ�
    
    
    Random r=new Random();
    
    int dice=r.nextInt(6)+1;
    System.out.println(dice);        //�ֻ��� ����
    
    if(dice==5) {
        System.out.println(pay*90/100+"��");
    }
    else {
        System.out.println(pay+"��");
    }
}
}
