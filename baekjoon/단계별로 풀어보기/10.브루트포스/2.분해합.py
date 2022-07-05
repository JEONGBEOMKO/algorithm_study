N = int(input())

result = 0

for i in range(1, N+1) : 
    A = list(map(int, str(i))
    result = i + sum(A) 
    if result == N :
        print(i)
        break

    if i == N :
        print(0)



# solution 1
#1 : 입력값 입력
#2 : 입력값 N과 비교하기 위한 변수
#3 : str함수를 통해 i의 각 자리수를 A 리스트에 넣기
#4 : 예제를 봤을 때, 분해합은 256(245+ 2 + 4 + 5) 라고 했으므로, 그대로인 값 i와 각 자리수가 들어간 A 리스트의 합을 더하면 된다.
#5 : #4의 합을 더한 것과 N 비교
#6 : 생성자가 없을 경우에는 0 출력

