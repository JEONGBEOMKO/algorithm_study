package CodingTest.초급;
import java.util.*;
class 문장속단어002 {
   public String solution(String str) {
    String answer="";
    int m=Integer.MIN_VALUE, pos; //가장 작은 값으로 초기화 //pos라는 변수 
    while((pos = str.indexOf(' '))!= -1){ //첫번째로 발견되는 indexOf -> 띄어쓰기 위치를 return // 띄어쓰기를 발견못하면 -1 리턴 발견하면 index 번호 리턴
            String tmp = str.substring(0, pos); // o번부터 pos 전까지 잘라냄
            int len = tmp.length();
            if(len > m){
                m = len;
                answer = tmp;
            }
            str = str.substring(pos+1);
    }
    if(str.length()>m) answer=str;
    return answer;    
   }

   public static void main(String[] args){
    문장속단어002 T = new 문장속단어002();
    Scanner kb = new Scanner(System.in);
    String str = kb.nextLine(); //문장 한줄 입력받음.
    System.out.print(T.solution(str));
   }
}
