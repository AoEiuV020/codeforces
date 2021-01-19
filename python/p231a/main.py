# https://codeforces.com/contest/231/problem/A
print(sum(input().count('1') > 1 for i in range(int(input()))))
