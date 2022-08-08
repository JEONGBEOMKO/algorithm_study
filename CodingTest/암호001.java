package CodingTest;

import java.util.Scanner;

class 암호001 {
    public String solution(int n , String s){
        String answer = "";
        for(int i = 0; i < n; i++){
            String tmp = s.substring(0, 7).replace('#', '1').replace('*', '0');
            int num = Integer.parseInt(tmp, 2); //Integer.parseInt정수화 인자를 tmp : String 넘어감 , 2: 이진수로 넘어감 2진수를 -> 10진수로
            answer+=(char)num;//num을 문자형으로 변환
            //System.out.println(tmp + " " + num);
            s=s.substring(7);
        }

        return answer;
    }    
    
    public static void main(String[] args){
        암호001 T = new 암호001();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String str = kb.next();
        System.out.println(T.solution(n, str));
    }
}
