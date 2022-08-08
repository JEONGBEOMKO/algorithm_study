package CodingTest;
import java.util.*;
class 숫자만추출001 {
    public int solution(String s){
        int answer = 0;
        for(char x : s.toCharArray()) //s.toCharArray() : 문자 배열이 되어 foreach 가능
        if(x>=48 && x<=57) answer=answer*10 + (x-48); //연산자 만날시 아스키넘버로 변환되어 계산됨.
        return answer;
    }    

    public static void main(String[] args){
        숫자만추출001 T = new 숫자만추출001();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution(str));
    }
}
