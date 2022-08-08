package CodingTest;
import java.util.*;
import java.lang.*;
class 문장속단어001 {
   public String solution(String str) {
    String answer="";
    int m=Integer.MIN_VALUE; //가장 작은 값으로 초기화
    String[] s = str.split(" ");
    for(String x : s){ //s라는 배열에 하나씩 x에 대응 
        int len=x.length(); //길
        if(len>m){
            m=len;
            answer=x; //최댓값 발견될때마다 answer에 넣어줌
        }
    }
    return answer;
   }

   public static void main(String[] args){
    문장속단어001 T = new 문장속단어001();
    Scanner kb = new Scanner(System.in);
    String str = kb.nextLine(); //문장 한줄 입력받음.
    System.out.print(T.solution(str));
   }
}
