# https://codeforces.com/problemset/problem/263/A
for i in range(5):
    line = input()
    if '1' in line:
        print(abs(i - 2) + abs(line.split().index('1') - 2))
