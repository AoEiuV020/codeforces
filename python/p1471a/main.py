# https://codeforces.com/problemset/problem/1471/A
for _ in range(int(input())):
    n, x = map(int, input().split())
    arr = list(map(int, input().split()))
    print(-(sum(arr) // -x), sum(-(k // -x) for k in arr))
