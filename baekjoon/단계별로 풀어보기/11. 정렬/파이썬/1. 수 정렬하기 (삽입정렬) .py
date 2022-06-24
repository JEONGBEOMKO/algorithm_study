N = int(input("갯수 입력 :  \n"))

M = []

for i in range(N) :
    M.append(int(input()))

# Insert Sort
for i in range(1, len(M)) :
    while (i>0) & (M[i] < M[i-1]) :
        M[i], M[i-1] = M[i-1], M[i]

        i -= 1

for n in M:
    print(n)
