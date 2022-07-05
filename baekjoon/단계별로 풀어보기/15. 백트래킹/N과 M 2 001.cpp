#include <iostream>
#define MAX 8

using namespace std;

int arr[MAX];
bool visited[MAX];
int cnt, idx, n, m;

void Print() {
    for(int i = 0; i<n; i++)
        if(visited[i]) {
            cout << arr[i] << " ";
        }
    cout << '\n';
}

void DFS(int cnt, int idx) {
    if(cnt == m) {
        Print();
        return;
    }
}