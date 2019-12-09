package com.company;

/**
 * @Description
 * @Author: gaoxiaofeng
 * @Date:2019/12/9
 */
public class TwoNumAdd {
    /**
     * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
     * <p>
     * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
     * <p>
     * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
     * <p>
     * 示例：
     * <p>
     * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
     * 输出：7 -> 0 -> 8
     * 原因：342 + 465 = 807
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/add-two-numbers
     */
    public static void main(String[] args) {
        Node n1 = new Node(7);
        n1.next = new Node(8);
        n1.next.next = new Node(9);
        Node n2 = new Node(1);
        n2.next = new Node(2);
        n2.next.next = new Node(2);
        Node rs = twoNumAdd(n1, n2);
    }

    public static Node twoNumAdd(Node n1, Node n2) {
        Node result = new Node(0);
        Node curr = result;
        int carry = 0;
        while (n1 != null && n2 != null) {
            int x = n1 != null ? n1.val : 0;
            int y = n1 != null ? n2.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new Node(sum % 10);
            curr = curr.next;
            if (n1 != null) n1 = n1.next;
            if (n2 != null) n2 = n2.next;
        }
        if (carry > 0) {
            curr.next = new Node(carry);
        }
        return result.next;
    }
}

class Node {
    int val;
    Node next;

    public Node(int x) {
        val = x;
    }
}