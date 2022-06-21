# 솔루션 1
# 1.자료형이 숫자형인 N을 입력받는다.
# 2.len(N)으로 N의 크기에 따른 if문 설정
# 3.if N == 3자리수라면 (if len(N) == 3)
# 4.N = result + result/100 + (result%100)10 + ((result%)100)%10
# 5. 역함수로 result에 대한 식으로 풀어서 result 정의 
# 6.print(result)

# 솔루션 2
# 1.range(1, 1000000 + 1) 범위에 있는 분해합 생성자를 List에 append한다.
# 2. N을 입력받았을 때, List에 N이 있으면 N번째 인덱스에 -1 한 것이 result!
# 3. print(result)

# 솔루션 3
# 1. for i in range(1, N+1)로 1부터 최대범위까지 모든 경우의 수(브루트 포스)를 처음부터 끝까지 비교한다.
# 2. N을 str형으로 입력받고 list에 append
# 3. if i + sum(i) == N 이면, print(i)

#브루트 포스 문제는 모든 경우의 수를 고려해야하는 문제이기 때문에 입력받아야할 변수의 range에 답게 1부터 10000000까지의 모든 수를 따지는 for 로 구현하는게 좀 더 편할 것 같아서  솔루션 3으로 풀었다.

N = int(input())
result = 0

for i in range(1, N+1):
    a = list(map(int, str(i)))
    s = i + sum(a)
    if(s == N):
        result = i
        break

print(result)
