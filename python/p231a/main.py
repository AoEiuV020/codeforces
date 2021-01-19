# https://codeforces.com/contest/231/problem/A
print(sum(int(sum(int(c == '1') for c in input()) > 1) for i in range(int(input()))))
