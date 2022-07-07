#include <iostream>
using namespace std;

const int MAX = 8;
int N, M;
int arr[MAX];
int selected[MAX];

void print() {
    for(int i = 0; i < M; i++){
        cout << selected[i] << " ";
    }
    cout << "\n";
}

void DFS(int idx, int cnt) {
    if(cnt == M){
        print();
        return;
    }

    for(int i = idx; i < N; i++) {
        selected[cnt] = arr[i];
        DFS(i, cnt + 1);
    }

}

int main() {
    cin >> N >> M;

    for(int i = 0; i < N; i++){
        arr[i] = i + 1;
    }

    DFS(0, 0);

    return 0;
}


