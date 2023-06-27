num = int(input())
case_lst = [1, 2]

idx = 0
while num > len(case_lst):
	case_lst.append(case_lst[idx]+case_lst[idx+1])
	idx += 1

if num == 1:
	print(1)
elif num == 2:
	print(2)
else: 
	print(case_lst[-1]%10007)