public List<Integer> math1(List<Integer> nums) {
  nums.replaceAll(n -> n * 2 + 1);
  return nums;
}
