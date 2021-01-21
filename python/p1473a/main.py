#!/usr/bin/env python3
# -*- coding: utf-8 -*-
# http://codeforces.com/problemset/problem/1473/A
for _ in range(int(input())):
    n, d = map(int, input().split())
    x = 0
    m1 = d
    m2 = d
    success = True
    for a in map(int, input().split()):
        if a > d:
            success = False
        if a + m1 <= d:
            success = True
            break
        if a < m1:
            m1 = a
    print(['NO', 'YES'][success])


