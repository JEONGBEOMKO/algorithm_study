package CodingTest;

import java.util.ArrayList;
import java.util.Scanner;

class 뒤집은소수001 {
    public boolean isPrime(int num){ //소수인지 확인하는 함수
        if(num==1) return false;
        for(int i=2; i <num; i++){
            if(num%i==0) return false; // num%i==0 이면 num의 약수
        }
        return true;
    }

    public ArrayList<Integer> solution(int n , int[] arr){// arr에 받음
        ArrayList<Integer> answer = new ArrayList<>(); // 뒤집어서 소수이면 ArrayList에 추가해서 리턴
        for(int i=0;i<n;i++){
            int tmp = arr[i];
            int res = 0;
            while(tmp > 0){
                int t = tmp%10;
                res = res*10 + t;
                tmp = tmp/10;
            }
            if(isPrime(res)) answer.add(res);
             
        }
        return answer;
    }
        public static void main(String[] args){
            뒤집은소수001 T = new 뒤집은소수001();
            Scanner kb = new Scanner(System.in);
            int n = kb.nextInt(); //n을 받고
            int[] arr = new int[n]; //solution에 넘기기 위한 길이 배열  받음
            for(int i=0; i<n; i++){
                arr[i]=kb.nextInt(); // n개의 숫자를 받음
            } 
            for(int x : T.solution(n, arr)){ //n : 갯수 넘김  arr: n개의 자연수 저장되어 넘김 //return된 ArrayList을 받음
                System.out.print(x+" ");  //x로 해서 foreach로 출력
            }
        }
}
