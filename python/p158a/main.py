# https://codeforces.com/problemset/problem/158/A
n, k = map(int, input().split())
count = 0
last = 1
for i, v in enumerate(map(int, input().split())):
    if v == 0:
        break
    elif i < k:
        count += 1
        last = v
    elif v == last:
        count += 1
    else:
        break
print(count)
