import sys
input = sys.stdin.readline

temp = '0' + input().strip()
temp = list(temp.split('-'))
num_lst = []

for i in temp[1:]:
	if '+' in i:
		lst = list(map(int, i.split('+')))
		for k in lst:
			num_lst.append((-1)*k)
	else:
		num_lst.append((-1)*int(i))

if '+' in temp[0]:
	num_lst += list(map(int, temp[0].split('+')))
else:
	num_lst.append(int(temp[0]))

print(sum(num_lst))