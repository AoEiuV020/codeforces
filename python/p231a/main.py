c = 0
for _ in range(int(input())):
    c += int(sum(map(int, input().split())) > 1)
print(c)
