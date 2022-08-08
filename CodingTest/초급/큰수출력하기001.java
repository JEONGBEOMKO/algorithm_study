package CodingTest.초급;

import java.util.ArrayList;
import java.util.Scanner;

class 큰수출력하기001 {
    public ArrayList<Integer> solution(int n, int[] arr){ //숫자들을 ArrayList에 넣음
        ArrayList<Integer> answer = new ArrayList<>(); // ArrayList라는 자료구조 리턴
        answer.add(arr[0]); // ArrayList에 추가 , 추가되는것들은 출력되는 것들이다. 
        for(int i = 1; i<n;i++){ //자기 앞 숫자보다 크면 추가
            if(arr[i]>arr[i-1]) answer.add(arr[i]);
        }
        return answer;
    }
    public static void main(String[] args){
        큰수출력하기001 T = new 큰수출력하기001();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();//n을 받음
        int[] arr = new int[n]; //배열을 동적으로 n개 잡음
        for(int i = 0; i < n; i++){ //n번 for문 돌리기
            arr[i] = kb.nextInt(); // 배열에 숫자 집어넣기
        }
        for(int x : T.solution(n, arr)){
            System.out.print(x+" ");
        }
    }
    
}
