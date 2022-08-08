package CodingTest.초급;
import java.util.*;
//found7, time: study; Yduts; emit, 7Dnuof
class 유효한_팰린드롬001 {
    public String solution(String s){
        String answer = "NO";
        s= s.toUpperCase().replaceAll("[^A-Z]", "");//s를 알파벳만 있는 걸로 //replaceAll에 정규식 사용가능
        //System.out.println(s);
        String tmp = new StringBuilder(s).reverse().toString(); //StringBuilder 클래스에서 생성자 호출에서 객체 만듦.
        if(s.equals(tmp)) answer="YES";
        return answer;
    }
   

    public static void main(String[] args){
        유효한_팰린드롬001 T = new 유효한_팰린드롬001();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.print(T.solution(str));

    }
    
}
