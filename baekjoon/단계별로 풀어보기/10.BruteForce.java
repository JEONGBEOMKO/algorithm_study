//BruteForce (무차별 공격)

/*
  - 암호학에서 비밀번호를 찾는 방법론.
  - 조합 가능한 모든 경우를 하나씩 다  대입해 보는 방식으로 암호를 해독하는 방법.
  - 브루트 포스(brute force attack), 키 전수 조사(exhaustive key search), 무차별 대입 공격, 완전 탐색 등으로도 부른다.
  - 알고리즘의 대다수의 문제가 브루트 포스와 같이 경우를 완전 탐색하여 해를 구하는 문제이다.
  - 브루트 포스의 특 장점은 해를 구하는 탐색과정을 병렬로 수행 가능하다는 점이다.
  - 해당 방법론이 적용된 구현 알고리즘은 아래와 같다.
    - 선형 : 배열과 같은 선형 구조를 전체적으로 탐색하는 순차 탐색
    - 비선형 : 비선형구조를 탐색하는 깊이 우선 탐색(DFS, Depth First Search) 과 너비 우선 탐색(BFS, breadth first search)이 있다.
*/

import java.io.bufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class blackjack {

    static int [] arr;
    static int N,M,ans = 0;
    public static void main(String[] args) throws IOException{ //사용법 필수 암기, throws IO 익셉션

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        //input
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N];
        arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        // 3개 뽑기 완전탐색
        for(int i = 0; i<N; i++)
            bruteForce(arr[i], i+1, 1);
        System.out.println(ans);
    }

    private static void bruteForce(int sum, int i, int cnt){ // 선택값 합, 선택 번호, 선택 갯수
        if(cnt==3 && sum<=M){
            ans = Math.max(ans, sum);
            return;

        }
        if(i==N || cnt == 3) return; // 3개 선택끝, 배열 끝번호인 경우 종료
        for(;i<N;i++)
            bruteForce(sum+arr[i],i+1,cnt+1);

    }

}

/*
 * 입력의 경우는 확실히 Scanner 보다는 BufferedReader 가 빠른 걸 볼 수 있다.
 * 알고리즘의 경우 데이터가 워낙 적어 사실상 성능차는 안보이는 것 같다.
 */




