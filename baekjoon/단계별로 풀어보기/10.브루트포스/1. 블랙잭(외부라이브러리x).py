N, M = map(int, (input().split()))

d = list(map(int, input().split()))

result = 0
Max = 0

for i in range(N-2): # 3중 for문을 돌면서 겹치지 않게 범위를 지정
    for j in range(i+1, N-1):
        for k in range(j+1, N):
            if d[i]+d[j]+d[k] > M: # 3개의 값 더한것이 M보다 크다면 넘어감

                continue
            else:
                result = d[i]+d[j]+d[k]
                if Max <= result: #M과 가장 유사한 값은 가장 큰값이기 때문에 비교해서 큰값을 저장

                    Max = result

print(Max)


# 코드 설명

# 3장을 뽑아야 하기 때문에 3중 for문을 돌고 겹치지 않게 뽑기 위해 처음 for문은 N-2전까지 다음 for문은 N-2전까지 다음 for문은 i값보다 1크면서 N-1전까지 돌고 마지막 for문은 j보다 1크면서 N전까지 돌게 범위를 잡는다.
# 합이 M보다 크다면 넘어가고 합이 M보다 작거나 같으면서 가장 큰 값을 저장해둔다음 출력해준다.
