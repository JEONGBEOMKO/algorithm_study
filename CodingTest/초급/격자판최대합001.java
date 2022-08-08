package CodingTest.초급;
import java.util.*;

class 격자판최대합001 {
    public int solution(int n, int[][] arr){
        int answer=Integer.MIN_VALUE; //최댓값 찾아야하므로 정수값으로 가장 적은 걸로 초기화
        int sum1 , sum2 ; //행과 열 합 각각 구해서 answer 보다 크면 바꿔줌  sum1 : 행의 합 sum2:열의합
        for(int i = 0; i<n;i++){
            sum1=sum2=0;
            for(int j=0; j<n;j++){
                sum1+=arr[i][j];
                sum2+=arr[j][i];
            }
            answer=Math.max(answer, sum1);
            answer=Math.max(answer, sum2);
        }
        sum1=sum2=0;
        for(int i=0; i<n; i++){
            sum1+=arr[i][i];
            sum2+=arr[i][n-i-1];
        }
        answer=Math.max(answer, sum1); //sum1중에서 더 큰 값이 있으면 answer를 바꿔줌
        answer=Math.max(answer, sum2); //sum2중에서 더 큰 값이 있으면 answer를 바꿔줌
        return answer;
    }
    public static void main(String[] args){
        격자판최대합001 T = new 격자판최대합001();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt(); //n 받음
        int[][] arr = new int[n][n]; //동적으로 2차원 배열 만듦.
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j]=kb.nextInt(); //i,j에 숫자를 하나씩 읽음
            }
        }
        System.out.print(T.solution(n, arr)); // n과 arr을 parameter에 넘김
    }
}
