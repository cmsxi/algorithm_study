import sys
input = sys.stdin.readline

t = int(input())
wave_lst = [1, 1, 1] 

for _ in range(t):
	n = int(input())
	
	if n > (len(wave_lst)):
		while(n != len(wave_lst)):
			wave_lst.append(wave_lst[-2] + wave_lst[-3])
			
	print(wave_lst[n-1])