import sys
# python 입력속도 빠르게 하기
input = sys.stdin.readline

n = int(input())
slst = []

for _ in range(n):
	# 개행문자 제거
	cmd = input().rstrip()
	if ' ' in cmd:
		cmd, num = cmd.split()
		num = int(num)
	
	if cmd == "push":
		slst.append(num)
		
	elif cmd == "pop":
		if len(slst) == 0:
			print(-1)
			continue
			
		print(slst.pop())
		
	elif cmd =="size":
		print(len(slst))
		
	elif cmd =="empty":
		if len(slst) == 0:
			print(1)
		else:
			print(0)
		
	elif cmd == "top":
		if len(slst) == 0:
			print(-1)
		else:
			print(slst[-1])
		