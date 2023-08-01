import sys
input = sys.stdin.readline

n = int(input())
lst = list(map(int, input().split()))

temp = sorted(list(set(lst)))
idx = [x for x in range(len(temp))]

num_dict = {num:idx for num, idx in zip(temp, idx)}

for i in lst:
	print(num_dict[i], end = ' ')