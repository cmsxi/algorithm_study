n , k = map(int, input().split())

lst = list(range(1, n+1))
idx = k-1

print('<', end = '')
while(len(lst) > 1):
	print(lst.pop(idx), end = ', ')
	
	idx += (k-1)
	idx %= len(lst)

print(lst[0], end ='>')