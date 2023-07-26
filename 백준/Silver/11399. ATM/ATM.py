import sys

input = sys.stdin.readline

n = int(input())
people = list(map(int, input().split()))

people.sort()
temp = []

for i in people:
	temp.append(i*n)
	n -= 1
	
print(sum(temp))