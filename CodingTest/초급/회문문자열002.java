package CodingTest;

import java.util.Scanner;

class 회문문자열002 {
    public String solution(String str){
        String answer = "NO";
        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equalsIgnoreCase(tmp)) answer="YES";
        
        return answer;
    }

    public static void main(String[] args){
        회문문자열002 T = new 회문문자열002();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution(str));


    }
    
}
