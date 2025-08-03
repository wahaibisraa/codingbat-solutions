def evenlySpaced(a, b, c):
    nums = sorted([a, b, c])
    return nums[2] - nums[1] == nums[1] - nums[0]
