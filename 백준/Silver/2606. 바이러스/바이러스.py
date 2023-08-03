import sys
input = sys.stdin.readline

com_num = int(input())
link_num = int(input())

com = [x for x in range(1, com_num+1)]
link = [[] for _ in range(com_num)]

virus = [1]

for _ in range(link_num):
	a ,b = map(int, input().split())
	link[a-1].append(b)
	link[b-1].append(a)

flag = True
while flag:
	flag = True
	temp = len(virus)
	
	for i in virus:
		if link[i-1] == 0:
			continue
		
		virus += link[i-1]
		virus = list(set(virus))
		link[i-1] = 0

	
	if temp == len(virus):
		flag = False

print(len(set(virus))-1)