package CodingTest;

import java.util.*;

public class 문자찾기002 {
    public int solution(String str, char t){ //solution이라는 함수를 주고 입력을 매개변수로 넘어옴 
        int answer = 0;
        str = str.toUpperCase(); 
        t = Character.toUpperCase(t);
        for(char x : str.toCharArray() ) //foreach문 -> 배열, iterator를 제공하는 collectionframework(arraylist나 list)만 올 수 있음 , string 안 됨
                                        //toCharArray() : str 기반으로 문자 하나씩 배열해서 문자 배열 객체를 만듦. 0번 인덱스 부터 문자들이 x에 대응
            if(x==t)
                answer++;
        
        return answer;
    }

    public static void main(String[] args){
        문자찾기002  T = new 문자찾기002();
        Scanner kb = new Scanner(System.in);
        String str = kb.next(); //kb-객체 next - 콘솔창에서 문자열을 하나 읽어드림
        char c = kb.next().charAt(0); // kb.next - 문자열 읽어드림 charAt() - 스트링의 인덱스로 접근, char변수 리턴
        System.out.print(T.solution(str, c)); //T.solution(str, c) - 호출
    }
}
