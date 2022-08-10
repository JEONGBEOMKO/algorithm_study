package CodingTest.초급;

import java.util.*;

class 공통원소구하기001 {
    public ArrayList<Integer> solution(int n, int m, int[] a, int[] b){
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);
        int p1=0, p2=0;
        while(p1<n && p2<m){
            if(a[p1]==b[p2]){
                answer.add(a[p1++]);
                p2++;
            }
            else if(a[p1]<b[p2])p1++;

            else p2++;
        }
        return answer;
    }

    public static void main(String[] args){
        공통원소구하기001 T = new 공통원소구하기001();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] a = new int[n]; // a배열에 n개 잡음.
        for(int i=0; i<n; i++){
            a[i]=kb.nextInt();
        }
        int m = kb.nextInt();
        int[] b = new int[m]; // b배열 동적으로 만들고  n개 잡음.
        for(int i=0; i<m; i++){
            b[i]=kb.nextInt();
        }
        for(int x: T.solution(n,m,a,b)) System.out.print(x+" ");
    }
}
