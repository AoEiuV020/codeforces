# https://codeforces.com/problemset/problem/1474/A
t = int(input())
for _ in [0] * t:
    n = int(input())
    line = input()
    last = ''
    a = 1
    for bit in line:
        if (bit == last) or (last == '0' and a == 0):
            a = int(not a)
        print(a, end='')
        last = bit
    print('')
