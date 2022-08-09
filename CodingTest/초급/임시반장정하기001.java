package CodingTest.초급;

import java.util.Scanner;

class 임시반장정하기001 {
    public int solution(int n, int[][] arr){
    int answer=0, max=Integer.MIN_VALUE; //최댓값 구해야하므로
    for(int i=1; i<=n; i++){
            int cnt=0; //i번 학생과 같은 반인 j번학생은 몇명인지 카운트
            for(int j=1; j<=n; j++){//j학생
                for(int k=1; k<=5; k++){ //학년
                    if(arr[i][k]==arr[j][k]){ //i번학생의 k학년의 방과 j번학생의 k학년의 방이 같다.
                        cnt++;
                        break;
                    } 
                }
            }
            if(cnt>max){
                max=cnt;
                answer=i; // 최댓값 만들어주는 i번학생
            }
    }    
    return answer;
    }
    public static void main(String[] args){
        임시반장정하기001 T = new 임시반장정하기001();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] arr = new int[n+1][6]; //2차원 배열 동적으로 잡음 - n+1 : 1번부터 사용  6: 1학년~5학년
        for(int i=1; i<=n; i++){ //i 학생번호
            for(int j=1; j<=5; j++){ // 1학년 5학년
                arr[i][j]=kb.nextInt();
            }
        }
        System.out.print(T.solution(n, arr)); //학생수와 2차원 배열 solution에 넘기
    }
}
