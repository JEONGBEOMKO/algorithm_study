package CodingTest.초급;

import java.util.ArrayList;
import java.util.Scanner;

class 두배열합치기001 {
    public ArrayList<Integer> solution(int n, int m, int[] a, int[] b){ //n: a 배열 크기 m : b 배열 크기, a 배열, b 배열 입력 받은 것 받음
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;
        while(p1<n && p2<m){
            if(a[p1]<b[p2]) answer.add(a[p1++]); 
            else answer.add(b[p2++]);            
        }
        while(p1<n) answer.add(a[p1++]);
        while(p2<m) answer.add(b[p2++]);
        return answer;
    }
    
    public static void main(String[] args){
        두배열합치기001 T = new 두배열합치기001();
        Scanner kb = new Scanner(System.in);
        int  n = kb.nextInt();
        int[] a = new int[n]; // a 배열 n개 잡음
        for(int i=0; i<n; i++){
            a[i]=kb.nextInt(); //값 저장
        }
        int m = kb.nextInt(); //
        int[] b = new int[m];//b배열 m개 잡음
        for(int i=0;i<m;i++){
            b[i]=kb.nextInt(); //값 저장

        }
        for(int x: T.solution(n,m,a,b)) System.out.print(x+" "); //solution 에 n,m,a,b 넘김 
        }
}
