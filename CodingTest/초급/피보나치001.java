package CodingTest;

import java.util.Scanner;

public class 피보나치001 {
    public int[] solution(int n){
        int[] answer = new int[n]; //n크기의 answer 배열 만듦
        answer[0] = 1;
        answer[1]=1;
        for(int i=2; i<n; i++){
            answer[i]=answer[i-2]+answer[i-1];
        }
        return answer;
    }
    
    public static void main(String[] args){
        피보나치001 T = new 피보나치001();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt(); //n을 받음
        for(int x: T.solution(n)) System.out.print(x+" "); // T.solution(n) : n을 넘겨서 나중에 return 받음
    }
}
