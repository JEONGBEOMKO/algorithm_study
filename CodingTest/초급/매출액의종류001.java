package CodingTest.초급;

import java.util.*;

class 매출액의종류001 {
    public ArrayList<Integer> solution(int n, int k, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> HM = new HashMap<>();
        for(int i=0; i<k-1; i++){
            HM.put(arr[i], HM.getOrDefault(arr[i], 0)+1); //getOrDefault : arr[i]의 key값을 가져오고 없으면 value 리턴 //put : arr[i] key값에 value put
        }
        int lt=0;
        for(int rt=k-1; rt<n; rt++){ //k-1 : k일 째
            HM.put(arr[rt], HM.getOrDefault(arr[rt], 0)+1); //sliding window  오른쪽으로 쭉 밀고감
            answer.add(HM.size()); //매출액의 종류는 키의 종류와 같음
            HM.put(arr[lt], HM.get(arr[lt])-1); //lt는 키가 있으므로 get만 함
            if(HM.get(arr[lt])==0) HM.remove(arr[lt]);
            lt++;
        }
        return answer;
    }
    public static void main(String[] args){
        매출액의종류001 T = new 매출액의종류001();
        Scanner kb =new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr=new int[n]; //매출기록 arr에 넣음
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        for(int x : T.solution(n, k, arr)) System.out.print(x+" "); //solution에서 arraylist 리턴 된 후 출력
    }
    
}
