import sys
# python 입력속도 빠르게 하기
input = sys.stdin.readline

n = int(input())
fibo = [[1,0], [0,1]]
max_k = 1

for _ in range(n):
	k = int(input())
	
	if k > max_k:
		for i in range(max_k, k):
			temp_a = fibo[i][0] + fibo[i-1][0]
			temp_b = fibo[i][1] + fibo[i-1][1]
			fibo.append([temp_a, temp_b])
		max_k = k
		
	print(fibo[k][0], fibo[k][1])