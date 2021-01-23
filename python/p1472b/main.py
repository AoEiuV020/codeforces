# https://codeforces.com/problemset/problem/1472/B
for _ in range(int(input())):
    n = int(input())
    line = input()
    count1 = line.count('1')
    count2 = line.count('2')
    print(['YES', 'NO'][count1 % 2 == 1 or count1 == 0 and count2 % 2 == 1])
