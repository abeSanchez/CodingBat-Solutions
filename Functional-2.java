//Given a list of integers, return a list of the integers, omitting any that are less than 0.
public List<Integer> noNeg(List<Integer> nums) {
  nums.removeIf(n -> n < 0);
  return nums;
}

//Given a list of non-negative integers, return a list of those numbers except omitting any that end with 9. (Note: % by 10)
public List<Integer> no9(List<Integer> nums) {
  nums.removeIf(n -> n % 10 == 9);
  return nums;
}

//Given a list of integers, return a list of those numbers, omitting any that are between 13 and 19 inclusive.
public List<Integer> noTeen(List<Integer> nums) {
  nums.removeIf(n -> n >= 13 & n <= 19);
  return nums;
}

//Given a list of strings, return a list of the strings, omitting any string length 4 or more.
public List<String> noLong(List<String> strings) {
  strings.removeIf(s -> s.length() > 3);
  return strings;
}

//Given a list of strings, return a list of the strings, omitting any string that contains a "z". (Note: the str.contains(x) method returns a boolean)
public List<String> noZ(List<String> strings) {
  strings.removeIf(s -> s.contains("z"));
  return strings;
}

//Given a list of strings, return a list of the strings, omitting any string length 3 or 4.
public List<String> no34(List<String> strings) {
  strings.removeIf(s -> s.length() == 3 || s.length() == 4);
  return strings;
}

//Given a list of strings, return a list where each string has "y" added at its end, omitting any resulting strings that contain "yy" as a substring anywhere.
public List<String> noYY(List<String> strings) {
  strings.replaceAll(s -> s + "y");
  strings.removeIf(s -> s.contains("yy"));
  return strings;
}

//Given a list of non-negative integers, return a list of those numbers multiplied by 2, omitting any of the resulting numbers that end in 2.
public List<Integer> two2(List<Integer> nums) {
  nums.replaceAll(n -> n * 2);
  nums.removeIf(n -> n % 10 == 2);
  return nums;
}

//Given a list of integers, return a list of those numbers squared and the product added to 10, omitting any of the resulting numbers that end in 5 or 6.
public List<Integer> square56(List<Integer> nums) {
  nums.replaceAll(n -> (int) Math.pow(n, 2) + 10);
  nums.removeIf(n -> Integer.toString(n).charAt(Integer.toString(n).length()-1) == '5' || Integer.toString(n).charAt(Integer.toString(n).length()-1) == '6');
  return nums;
}
