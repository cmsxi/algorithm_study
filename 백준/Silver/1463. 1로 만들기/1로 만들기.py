import sys
input = sys.stdin.readline

n = int(input())
m = [ 0 for _ in range(n+1)]

for i in range(2, n+1):
	m[i] = m[i-1] + 1 #1을 빼는 경우
	if i % 3 == 0:
		m[i] = min(m[i//3]+1, m[i]) #어떤 경우가 더 횟수가 적게 드는지
	if i % 2 == 0:
		m[i] = min(m[i//2]+1, m[i]) #어떤 경우가 더 횟수가 적게 드는 지
		
print(m[-1])