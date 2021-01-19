# https://codeforces.com/problemset/problem/71/A
n = int(input())
for i in range(n):
    line = input()
    if len(line) <= 10:
        print(line)
    else:
        print(f'{line[0]}{len(line) - 2}{line[-1]}')
