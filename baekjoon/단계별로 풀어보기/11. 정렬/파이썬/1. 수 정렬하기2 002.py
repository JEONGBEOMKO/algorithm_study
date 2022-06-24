import sys
n = int(input())
li = []

for _ in range(n):
    li.append(int(sys.stdin.realine()))
for i in sorted(li):
    print(i)
