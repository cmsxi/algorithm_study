import sys
input = sys.stdin.readline

n = int(input())
S = set([])

for _ in range(n):
	temp = input().rstrip()
	
	if temp == "all":
		S = set(x for x in range(1, 21))
	
	elif temp == "empty":
		S = set([])
		
	else:
		cmd, x = temp.split()
		x = int(x)
	
		if cmd == "add":
			S.add(x)
			
		elif cmd == "remove":
			if x in S:
				S.remove(x)
				
		elif cmd == "check":
			if x in S:
				print(1)
			else:
				print(0)
				
		else:
			if x in S:
				S.remove(x)
			else:
				S.add(x)