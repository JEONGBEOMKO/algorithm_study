package CodingTest;

import java.util.*;

public class 문자찾기001 {
    public int solution(String str, char t){ //solution이라는 함수를 주고 입력을 매개변수로 넘어옴 
        int answer = 0;
        str = str.toUpperCase(); 
        t = Character.toUpperCase(t);
        //System.out.println(str + " " + t);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==t){ //인덱스를 string으로 접근 : charAt
                   answer++; 
            }
        }
        
        return answer;
    }

    public static void main(String[] args){
        문자찾기001  T = new 문자찾기001();
        Scanner kb = new Scanner(System.in);
        String str = kb.next(); //kb-객체 next - 콘솔창에서 문자열을 하나 읽어드림
        char c = kb.next().charAt(0); // kb.next - 문자열 읽어드림 charAt() - 스트링의 인덱스로 접근, char변수 리턴
        System.out.print(T.solution(str, c)); //T.solution(str, c) - 호출
    }
}
