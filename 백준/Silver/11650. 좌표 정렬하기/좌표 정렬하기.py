import sys
input = sys.stdin.readline

n = int(input())
lst = []

for _ in range(n):
	a, b = map(int, input().split())
	lst.append([a, b])

lst.sort(key=lambda lst: lst[1])
lst.sort()

for i in range(n):
	print(lst[i][0], lst[i][1])