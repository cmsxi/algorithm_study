import sys
# python 입력속도 빠르게 하기
input = sys.stdin.readline

n = int(input())
lst = [1, 3] # 5, 11, 21, 43, 85, 171
# a1 = 1, a2 = 3, a3 = 2*a1 + a2...

for i in range(2, n):
	lst.append(2 * lst[i-2] + lst[i-1])

print(lst[n-1] % 10007)