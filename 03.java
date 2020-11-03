class Solution {
	public int maxPower(String s) {
		int count = 1;
		int curr = 1;
		for (int i = 1; i<s.length(); i++) {
			if (s.charAt(i) != s.charAt(i - 1)) {
				count = 1;
			} else if (s.charAt(i) == s.charAt(i - 1)) {
				count++;
			}
			curr = Math.max(curr, count);
		}
		return curr;
	}
}