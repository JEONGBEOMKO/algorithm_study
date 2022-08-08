package CodingTest;

import java.util.Scanner;

public class 피보나치002 {
    public void  solution(int n){ //return 안 받으므로 void
        int a = 1, b=1, c;
        System.out.print(a+" "+b+" ");
        for(int i = 2; i<n;i++){
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    } 
    
    public static void main(String[] args){
        피보나치001 T = new 피보나치001();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt(); //n을 받음
        for(int x: T.solution(n)) System.out.print(x+" "); // T.solution(n) : 호출, return 안 받음
    }
}
