package CodingTest;

import java.util.Scanner;

class 보이는학생001 {
    public int solution(int n, int[] arr){ //arr 탐색 
        int answer = 1, max = arr[0]; // answer는 개수 , max : 앞의 학생들 중에 가장 키큰사람의 키
        for(int i = 1; i < n; i++  ) { //2번째 사람부터
            if(arr[i]>max) {
                answer++;
                max = arr[i];
            }
        }     
        return answer;           
            }
    public static void main(String[] args){
        보이는학생001 T = new 보이는학생001();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n]; //n 크기의 배열잡음
        for(int i = 0; i<n; i++){
            arr[i] = kb.nextInt(); // n개의 숫자를 배열에 받음
        }
        System.out.print(T.solution(n, arr));// 개수만 출력하면 됨, solution 넘김
    }

}
