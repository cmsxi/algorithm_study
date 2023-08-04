import sys
input = sys.stdin.readline

clothes = dict()

n = int(input())

for _ in range(n):
	clothes.clear()

	k = int(input())
	for _ in range(k):
		cloth_kind, cloth_cls = input().split()
		
		if cloth_cls in clothes:
			clothes[cloth_cls] += 1
		else:
			clothes[cloth_cls] = 1
	
	temp = 1
	for i in clothes.values():
		temp *= (i+1)
		
	print(temp-1)