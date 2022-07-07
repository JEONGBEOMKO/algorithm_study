#include<iostream>
#include<algorithm>
#include<vector>

using namespace std;

int N, M; //N까지의 수 , M개 선택

vector<int> vec;

int check[9]; //사용체크

//현재 숫자보다 큰 것이 들어가게끔 해야함
void func(int cnt, int cur) {
    if(cnt == M){
        for (auto c : vec){
            cout << c << " ";
        }
         return;
    }

    for(int i = 1; i < N; i++){
        if (cur > i ) continue; //현재숫자보다 작은 경우는 조사할 필요 없음
        if(check[i] == 1) continue; //쓰인 숫자는 조사하지 않음. 
        check[i] = 1;
        vec.push_back(i);

        //구현
        func(cnt+1, i); //현재 들어간 숫자는 i임

        //상태 복원
        vec.pop_back();
        check[i] = 0;
    }
}


int main() {
    cin >> N >> M;
    func(0, 1);
}
