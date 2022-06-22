n = int(input("입력: \n"))

nums = []

for _ in range(n):
    nums.append(int(input()))

nums.sort()
for i in range(len(nums)):
    print(nums[i])


# 입력 값 (n)을 받아 n개의 수를 리스트 안에 추가한다. 그 후 내장 함수인 sort를 이용하여 정렬하고 다시 반복문을 통해 하나하나 출력해준다.

