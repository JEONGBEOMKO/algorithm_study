import sys
n = int(input("개수 입력: "))
li = []
for _ in range(n):
    li.append(int(sys.stdin.readline()))

for i in sorted(li):
    print(i)

# 파이썬 기본 내장함수 sorted()
# 병합정렬 기반으로 만들어진 함수이며 O(nlogn)의 시간복잡도를 가지는 알고리즘이다.
# 일반적으로 직접 함수를 만들어서 사용하는 것보다 효과적이므로 문제에서 별도의 요구가 없다면 파이썬 내장함수 이용하는 것이 좋다.