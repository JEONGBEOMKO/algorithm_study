package CodingTest;
import java.util.*;
class 점수계산001 {
    public int solution(int n , int[] arr){ // n : 정수 , arr에 저장되어있음
        int answer=0, cnt = 0; //answer에 누적
        for(int i = 0; i<n; i++){
            if(arr[i]==1){
                cnt++;
                answer+=cnt;
            }
            else cnt = 0; 
        }

        return answer;
    }
    public static void main(String[] args){
        점수계산001 T = new 점수계산001();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt(); // 10을 받음
        int[] arr = new int[n]; //동적으로 배열길이 만듦.

        for(int i = 0; i <n; i++){ //n번 돌면서
            arr[i]=kb.nextInt(); // 배열에다가 0번 인덱스부터 넣는다.
        }
        System.out.print(T.solution(n, arr)); //T.solution 호출
    }
}
