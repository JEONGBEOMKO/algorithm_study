package CodingTest;

import java.util.Scanner;

class 등수구하기001 {
    public int[] solution(int n, int[] arr){ //학생수, 점수 받음 
        int[] answer = new int[n]; //answer 초기화 하면 동적배열 이기 때문에 0으로 초기화 됨
            for(int i=0; i<n; i++){
            int cnt =1;
                for(int j=0; j<n; j++){
                    if(arr[j]>arr[i]) cnt++;
                }
            answer[i]=cnt;
        }
        return answer;
    }
    public static void main(String[] args){
        등수구하기001 T = new 등수구하기001();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt(); // 학생 수 받음
        int[] arr = new int[n]; // 동적배열 n개 잡음
        for(int i=0;i<n;i++){  
            arr[i]=kb.nextInt(); //점수 받음 0번부터 n개전까지
        }
        for(int x:T.solution(n,arr)) System.out.print(x+" "); //solution 넘긴 후 배열 return 받음
    }
}
