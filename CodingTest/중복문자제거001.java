package CodingTest;

import java.util.Scanner;

public class 중복문자제거001 {
    public String solution(String str){
        String answer="";
        for(int i=0;i<str.length();i++){
            //System.out.println(str.charAt(i)+" "+i+" "+str.indexOf(str.charAt(i)));
            if(str.indexOf(str.charAt(i))==i) answer+=str.charAt(i); //i라는 문자가 처음 발견되는indexof 위치랑 i(현재 그 문자의 위치) 가 같을때
        }
        return answer;
    }
    public static void main(String[] args){
        중복문자제거001 T = new 중복문자제거001();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));

    }
}
