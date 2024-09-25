import java.math.BigInteger;
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
        ListNode result = new ListNode();
        ListNode current = result;

        BigInteger listOne = getParsedValue(l1);
        BigInteger listTwo = getParsedValue(l2);
        BigInteger sum = listOne.add(listTwo);
        String sumString = sum.toString();

        for (int i = sumString.length(); i > 0; i--) {
            current.next = new ListNode(Character.getNumericValue(sumString.charAt(i - 1)));
            current = current.next;
        }

        return result.next;
    }

    private BigInteger getParsedValue(ListNode listNode) {
        Stack<Integer> stack = new Stack<>();

        while (listNode != null) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }

        String sb = "";
        while (!stack.isEmpty()) {
            int value = stack.pop();
            sb = sb + value;
        }

        return sb == "" ? new BigInteger("0") : new BigInteger(sb);
    }

}
