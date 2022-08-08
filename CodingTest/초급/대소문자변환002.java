package CodingTest.초급;
import java.util.*;
class 대소문자변환002 {
    public String solution(String str){ //solution이라는 함수를 주고 입력을 매개변수로 넘어옴 
       String answer ="";
       for(char x : str.toCharArray()){ // str.toCharArray - str 기반 문자배열 생성
        if(x>=97 && x < 122)  //소문자    //대문자 : x>=65 && x <= 90      //연산자입력시 char 자동으로 정수형으로 비교됨 원래 char는 정수형이다.
        answer += (char)(x - 32); //대문자로 아스키 변환 
        else answer+=(char)(x+32); // 소문자로 아스키 변환
    }
       return answer;
    }


public static void main(String[] args){
    대소문자변환002 T = new 대소문자변환002();
    Scanner kb = new Scanner(System.in);
    String str = kb.next();
    System.out.print(T.solution(str)); //str 문자열 넘김
    }
}