# https://codeforces.com/problemset/problem/1471/A
import math
for _ in range(int(input())):
    n, x = map(int, input().split())
    arr = list(map(int, input().split()))
    print(math.ceil(sum(arr) / x), sum(math.ceil(k / x) for k in arr))
