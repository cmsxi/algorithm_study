a, b = map(int, input().split())
ball = list(range(1, a + 1))

for i in range(b):
    temp1, temp2 = map(int, input().split())
    if temp1 == temp2:
        continue
    ball[temp1 - 1], ball[temp2 - 1] = ball[temp2 - 1], ball[temp1 - 1]
    
for b in ball:
	if b == ball[-1]:
		print(b)
		break
	print(b, end = ' ')