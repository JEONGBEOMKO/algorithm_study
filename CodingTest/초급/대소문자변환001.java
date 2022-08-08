package CodingTest;
import java.util.*;
class 대소문자변환001 {
    public String solution(String str){ //solution이라는 함수를 주고 입력을 매개변수로 넘어옴 
       String answer ="";
       for(char x : str.toCharArray()){ // str.toCharArray - str 기반 문자배열 생성
        if(Character.isLowerCase(x)) answer+= Character.toUpperCase(x); //Character.isLowerCase - 소문자 확인
       
        else answer+=Character.toLowerCase(x);
    }
       return answer;
    }


public static void main(String[] args){
    대소문자변환001 T = new 대소문자변환001();
    Scanner kb = new Scanner(System.in);
    String str = kb.next();
    System.out.print(T.solution(str)); //str 문자열 넘김
    }
}