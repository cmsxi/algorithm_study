import sys
input = sys.stdin.readline

word = input()

c_a = ['c=', 'c-', 'dz=', 'd-', 'lj', 'nj', 's=', 'z=']

for a in c_a:
	word = word.replace(a, '0')

print(len(word.strip()))