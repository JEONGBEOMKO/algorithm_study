#include<iostream>
#include<string>
using namespace std;

int main()
{
	string num;
	int n;
	cin >> n;
	num = to_string(n);
    // 변환 되었는지 확인해보기
	// cout << num;
	
    // 문자열의 길이만큼 반복하며 수를 정렬
	for (int i = 0; i < num.length();i++)
	{	
		int temp;
		for (int j = i+1; j < num.length();j++)
		{
			if (num[i] < num[j])
			{
				temp = num[i];
				num[i] = num[j];
				num[j] = temp;
			}
		}
	}
	for (int i = 0; i < num.length(); i++)
	{
		cout << num[i];
	}
}