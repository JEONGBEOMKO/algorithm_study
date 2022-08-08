package CodingTest;

import java.util.Scanner;

class 에라토스테네스체001 {
    public int solution(int n ){
        int answer = 0; //answer 로 카운팅
        int[] ch = new int[n+1]; //n+1을 해줘야 index가 n번 까지 생김, 
        for(int i =2 ; i <=n; i++){
            if(ch[i]==0){ //동적 배열 0으로 초기화 , 소수인 경우
                answer++; 
                for(int j=i; j<=n;j=j+i) //i의 배수로 j 돌아야 함 , i의 배수를 찾아야하므로 i만큼 증가한다
                ch[j]=1;
            }
        }
        return answer;
    }
    
    public static void main(String[] args){
        에라토스테네스체001 T = new 에라토스테네스체001();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt(); //숫자 읽고
        System.out.println(T.solution(n));//solution에 n 넘김
    }
}
 