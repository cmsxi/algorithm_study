import sys
input = sys.stdin.readline

n, k = map(int, input().split())
coins = []
cnt = 0

for _ in range(n):
	temp = int(input())
	coins.append(temp)
	
coins.reverse()

for coin in coins:
	if coin > k:
		continue
	cnt += (k//coin)
	k %= coin

print(cnt)
