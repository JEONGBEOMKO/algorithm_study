n = int(input("개수 입력: \n"))

num_list = []

for _ in range(n):
    num_list.append(int(input("입력: ")))

num_list1 = sorted(num_list)
for i in range(len(num_list)):
    print(num_list1[i])


# 1. 첫째 줄에서 이후 주어질 수의 개수를 입력 받는다.
# 2. num_list를 통해 숫자들의 리스트를 만든다.
# 3. n만큼 반복하여 num_list에 항목들을 추가한다.
# 4. num_list를 sorted로 정렬한다.
# 5. 요소들을 하나씩 출력한다. 