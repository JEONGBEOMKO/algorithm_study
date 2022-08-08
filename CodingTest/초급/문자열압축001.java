package CodingTest.초급;

import java.util.*;

import javax.swing.text.DefaultStyledDocument.ElementSpec;

class 문자열압축001 {
    
    public String solution(String s){
        String answer="";
        s = s+" "; //문자에서 맨 뒤에 빈 문자 추가
        int cnt = 1;
        for(int i = 0; i < s.length()-1; i++){
            if(s.charAt(i)==s.charAt(i+1)) cnt++;
            else{
                answer+=s.charAt(i);//answer에 i라는 문자 누적
                if(cnt>1) answer+=String.valueOf(cnt); //String.valueOf 또는 integer.toSting 으로 문자만듦.
                cnt=1;
            }
        }
        return answer;
    }
    public static void main(String[] args){
        문자열압축001 T = new 문자열압축001();
        Scanner kb = new Scanner(System.in);
        String str = kb.next(); //문자열 받음
        System.out.println(T.solution(str));

    }
}