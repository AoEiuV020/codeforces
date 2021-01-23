# https://codeforces.com/problemset/problem/1472/A
for _ in range(int(input())):
    w, h, n = map(int, input().split())
    bw = bin(w)
    bh = bin(h)
    print(['NO', 'YES'][2 ** (len(bw) - bw.rfind('1') - 1) * 2 ** (len(bh) - bh.rfind('1') - 1) >= n])
