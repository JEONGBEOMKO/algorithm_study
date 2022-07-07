#include<iostream>

using namespace std;

void init(){
    ios::sync_with_stdio(0);
    cin.tie(0);
}

bool ischeck1[40]; //세로
bool ischeck2[40]; //우하향 대각선
bool ischeck3[40]; //우상향 대각선

int cnt = 0;
int n;

//cur 행에 배치(같은 줄에는 못놓는다)
void func(int cur){
    if(cur == n){ // 모두 배치할 수 있다면 그 배치는 조건에 부합한 배치
            cnt++;
            return;
    }
    //현재 줄에서 놓을 수 있는 위치
    for(int i = 0; i<n; i++){
        if(ischeck1[i] || ischeck2[i+cur] || ischeck3[i-cur+n-1]) continue;

        //놓았다면 해당 퀸에 대해 공격경로를 막아놓음
        ischeck1[i] = 1;
        ischeck2[i+cur] = 1;
        ischeck3[i-cur+n-1] = 1;

        //해당 배치 상태에서 한 번 더 배치
        func(cur+1);

        //이 라인을 읽는다는 것은 위의 배치가 끝나서 다음 배치로 넘어가기 전에 현 배치 상태에 대한 공격 경로 무효
        // 그래야 다음 배치를 한다
        ischeck1[i]=0;
        ischeck2[i+cur] = 0;
        ischeck3[i-cur+n-1] = 0;
    }
}

int main(){
    init();
    cin >> n;
    func(0);
    cout << cnt;
}