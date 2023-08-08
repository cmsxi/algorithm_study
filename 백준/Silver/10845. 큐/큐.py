import sys
input = sys.stdin.readline

n = int(input())
queue = []

for _ in range(n):
	cmd = input()
	if ' ' in cmd:
		cmd, num = cmd.split()
		num = int(num)
	cmd = cmd.strip()
	
	if cmd == 'push':
		queue.append(num)
		
	elif cmd == 'pop':
		if len(queue) == 0:
			print(-1)
		else:
			print(queue.pop(0))
			
	elif cmd == 'size':
		print(len(queue))
		
	elif cmd == 'empty':
		if len(queue) == 0:
			print(1)
		else: 
			print(0)
			
	elif cmd == 'front':
		if len(queue) == 0:
			print(-1)
		else:
			print(queue[0])
			
	elif cmd == 'back':
		if len(queue) == 0:
			print(-1)
		else:
			print(queue[-1])
		