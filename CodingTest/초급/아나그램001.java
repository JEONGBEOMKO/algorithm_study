package CodingTest.초급;
import java.util.*;
class 아나그램001 {
    public String solution(String s1, String s2){
        String answer="YES";
        HashMap<Character, Integer> map = new HashMap<>();
        for(char x : s1.toCharArray()){
            map.put(x, map.getOrDefault(x, 0)+1); //map.getOrDefault : x라는 key를 생성하고 값을 value로 해라 
        }
        for(char x : s2.toCharArray()){
            if(!map.containsKey(x) || map.get(x)==0) return "NO";// map.containsKey(x) x가 존재한다.
            map.put(x, map.get(x)-1);
        }
        return answer;
    }
    public static void main(String[] args){
        아나그램001 T = new 아나그램001();
        Scanner kb = new Scanner(System.in);
        String a = kb.next();
        String b = kb.next();
        System.out.print(T.solution(a, b));
    }
    
}
