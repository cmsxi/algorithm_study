num = int(input())

reward_a = [500, 300, 200, 50, 30, 10]
ranking_a = [1, 3, 6, 10, 15, 21]

reward_b = [512, 256, 128, 64, 32]
ranking_b = [1, 3, 7, 15, 31]

reward = 0

for i in range(num):
	temp_a, temp_b = map(int,input().split())
	reward = 0
	
	if temp_a != 0 and temp_a <= 21:
		idx = 0
		while temp_a > ranking_a[idx]:
			idx += 1
		reward = reward_a[idx]

	if temp_b != 0 and temp_b <= 31:
		idx = 0
		while temp_b > ranking_b[idx]:
			idx += 1
		reward += reward_b[idx]
	
	if reward != 0:
		print(str(reward)+'0000')
	else:
		print(0)