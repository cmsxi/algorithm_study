import sys
input = sys.stdin.readline

n = int(input())

for _ in range(n):
	s = input().rstrip()
	result = 'YES'
	idx = 0
	for c in s:
		if c == '(':
			idx += 1
		else:
			idx -= 1
		
		if idx < 0:
			result = 'NO'
			break
		
	if idx != 0:
		result = 'NO'
	
	print(result)
	