import sys
# python 입력속도 빠르게 하기
input = sys.stdin.readline

n = int(input())
lst = []

for _ in range(n):
	start, end = map(int, input().split())
	lst.append([start, end])

lst.sort()
lst.sort(key=lambda lst: lst[1])

current_point = lst[0][0]
end_point = lst[0][1]

cnt = 1

for i in range(1, n):
	if lst[i][0] == lst[i][1]:
		cnt += 1
		continue
	
	if end_point > lst[i][0]:
		continue
	
	if end_point < lst[i][1]:
		current_point = lst[i][0]
		end_point = lst[i][1]
		cnt += 1
	

print(cnt)
