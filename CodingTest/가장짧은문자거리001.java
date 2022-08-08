package CodingTest;

import java.util.*;

class 가장짧은문자거리001{
    public int[] solution(String s, char t){ //배열 리턴
        int[] answer = new int[s.length()]; //s의 길이만큼 동적으로 int 배열 잡음
        int p = 1000;  
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==t) // i가 t와 비교
            {
                p=0;
                answer[i]=p;
            }
            else{
                p++;
                answer[i]=p;
            }
        }
        p = 1000; 
        for(int i = s.length()-1; i>=0; i--){
            if(s.charAt(i)==t){
                p=0;                
            }
            else{
                p++;
                answer[i]=Math.min(answer[i],p); //기존값과 p중에서 작은 것 넣어줌
            }
        }
        return answer;
    }

    public static void main(String[] args){
        가장짧은문자거리001 T = new 가장짧은문자거리001();
        Scanner kb = new Scanner(System.in);

        String str = kb.next(); //문자열을 하나 읽는다.
        char c = kb.next().charAt(0);//문자를 읽는다.
        for(int x : T.solution(str, c)){
            System.out.print(x+" ");
        }
    }
}