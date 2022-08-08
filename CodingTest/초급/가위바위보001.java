package CodingTest;

import java.util.*;


class 가위바위보 {
    public String solution(int n, int[] a, int[] b){
        String answer = "";
        for(int i = 0; i<n; i++){
            if(a[i]==b[i]) answer+="D";  //answer에 A,B,C,D 누적
            else if(a[i]==1 && b[i]==3) answer+="A";
            else if(a[i]==2 && b[i]==1) answer+="A";
            else if(a[i]==3 && b[i]==2) answer+="A";
            else answer+="B";
        }
        return answer; 
    }
    public static void main(String[] args){
        가위바위보 T = new 가위바위보();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] a = new int[n]; //a 배열
        int[] b =new int[n];    //b 배열
        for(int i = 0; i < n ; i++){
            a[i]=kb.nextInt();  //A 가위바위보 정보를 a 배열에 넣음
        }
        for(int i = 0; i<n; i++){
            b[i]=kb.nextInt(); //B 가위바위보 정보를 b 배열에 넣음
        }
        for(char x :T.solution(n, a, b).toCharArray())  System.out.println(x); //String이니깐 배열이 아님 따라서  toCharArray  사용하여 배열로 만듦
    }    
}
