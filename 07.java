/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		if (l1 == null || l2 == null) return l1 != null ? l1 : l2;

		Stack<Integer> l1St = new Stack<>();
		Stack<Integer> l2St = new Stack<>();

		addToStack(l1St, l1);
		addToStack(l2St, l2);

		ListNode result = null;
		int carry = 0;
		while (!l1St.isEmpty() || !l2St.isEmpty()) {

			int sum = (l1St.isEmpty() ? 0 : l1St.pop()) +
				(l2St.isEmpty() ? 0 : l2St.pop()) + carry;

			int val = sum % 10;
			carry = sum / 10;

			ListNode newNode = new ListNode(val);
			newNode.next = result;
			result = newNode;
		}

		if (carry > 0) {

			ListNode newNode = new ListNode(1);
			newNode.next = result;
			result = newNode;
		}

		return result;
	}

	private void addToStack(Stack<Integer> st, ListNode node) {
		while (node != null) {

			st.push(node.val);
			node = node.next;
		}
	}
}