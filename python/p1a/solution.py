line = input()
nums = line.split(' ')
w = int(nums[0])
h = int(nums[1])
a = int(nums[2])
wc = (w + a - 1) // a
hc = (h + a - 1) // a
ret = wc * hc
print(ret)
