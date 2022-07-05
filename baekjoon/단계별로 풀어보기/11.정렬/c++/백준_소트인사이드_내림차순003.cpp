#include <iostream>
#include <vector>
#include <algorithm>//sort 사용
#include <functional> //greater 사용
using namespace std;

int main() {
	string str;
	char ch;
	vector<char> vec;
	cin >> str;
	for (unsigned i = 0; i < str.size(); i++){
		vec.push_back(str[i]);
	}
	sort(vec.begin(), vec.end(), greater<char>());
	for(char elem : vec)
		cout << elem;
}