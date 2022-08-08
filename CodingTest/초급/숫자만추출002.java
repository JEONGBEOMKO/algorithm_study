package CodingTest;
import java.util.*;
class 숫자만추출001 {
    public int solution(String s){
        String answer = "";
        for(char x : s.toCharArray()){ //s.toCharArray() : 문자 배열이 되어 foreach 가능
        if(Character.isDigit(x)) //Character클래스 안에 isDigit -> 숫자인지 확인
            answer+=x;
        }
        return Integer.parseInt(answer); //Integer.parseInt : int화 
    }    

    public static void main(String[] args){
        숫자만추출001 T = new 숫자만추출001();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution(str));
    }
}
