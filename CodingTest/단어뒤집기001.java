package CodingTest;

import java.util.*;

class 단어뒤집기001 {
    public ArrayList<String> solution(int n, String[] str){ // 2. return 받는 것
    ArrayList<String> answer = new ArrayList<>();   // String을 원소를 갖는 ArrayList에다가 뒤집은 단어들을 return
        
    for(String x : str){
        String tmp = new StringBuilder(x).reverse().toString();  //StringBuilder : 문자열 다루는 클래스 // new StringBuilder 해서 생성자를 만듦 //  StringBuilder(x): x라는 단어로 StringBuilder 객체로 만들어라
        answer.add(tmp); //ArrayList에 추가하는 것은 add
    }
        return answer;
    }

public static void main(String[] args){
 
    단어뒤집기001 T = new 단어뒤집기001();
    Scanner kb = new Scanner(System.in);
    int n = kb.nextInt();
    String[] str = new String[n]; //String 배열을 동적으로 하나 만듦
    for(int i = 0; i<n; i++){
        str[i]=kb.next(); //n개의 단어를 string배열에 하나씩 넣는다.
    }
    for(String x : T.solution(n, str)){ // 1. T.solution n과 str 넘김 // 3. 위 함수에서 return이 되면 String이 담겨있는 arraylist를 받음
        System.out.println(x);  //하나하나 x에 대응해서 foreach구문으로 출력
    }
}
}
