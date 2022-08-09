package CodingTest.초급;

import java.util.Scanner;

public class 봉우리001 {
    int[] dx={-1, 0, 1, 0};//dx, dy 값을 instance 배열
    int[] dy={0, 1, 0, -1};
    public int solution(int n, int[][] arr){ //지도 정보 받음
        int answer = 0; //answer로 카운팅
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
               boolean flag=true; //봉우리인지 판별해주는 변수
               for(int k=0; k<4; k++){
                int nx=i+dx[k]; //네 방향 보기위한 행좌표
                int ny=j+dy[k];//네 방향 보기위한 열좌표
                if( nx>=0 && nx<n && ny>=0 && ny<n && arr[nx][ny]>=arr[i][j]){ //arr[nx][ny] : 네 방향  arr[i][j] : 내가 중심인 지점, 나 자신
                    flag=false;
                    break;
                }
               }
               if(flag) answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args){ //main이 static
        봉우리001 T = new 봉우리001(); //객체 T 생성
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt(); //n을 잡고
        int[][] arr=new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j]=kb.nextInt();
            }
        }
        System.out.print(T.solution(n, arr)); //n과 2차원 배열 arr 넘김
    }
}
