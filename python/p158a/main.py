# https://codeforces.com/problemset/problem/158/A
n, k = map(int, input().split())
data = list(map(int, input().split()))
m = max(1, data[k - 1])
print(sum(x >= m for x in data))
