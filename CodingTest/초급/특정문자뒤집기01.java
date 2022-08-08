package CodingTest.초급;

import java.util.*;

public class 특정문자뒤집기01 {
    public String solution(String str){ //입력받은 문자열
        String answer;
        char[] s = str.toCharArray(); //string 기반 문자배열을 s에 생성
        int lt = 0, rt = str.length()-1;
        while(lt<rt){
            if(!Character.isAlphabetic(s[lt])) lt++;
            else if(!Character.isAlphabetic(s[rt])) rt--;
            
            else{
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(s); //answer 에 String  전환 //valueOf(s) : s라는 기본형 배열을 String 화 
        return answer;

    }    

    public static void main(String[] args){
        특정문자뒤집기01 T = new 특정문자뒤집기01();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
