//$Id$
package com.learn.java.Problems;

class LinkedListNode {
    int data;
    LinkedListNode right;

    LinkedListNode(int data) {
        this.data = data;
        right = null;
    }
}

public class ReversingLinkedList {
    public static void main(String[] args) {
        LinkedListNode node = new LinkedListNode(1);
        node.right = new LinkedListNode(2);
        node.right.right = new LinkedListNode(3);
        node.right.right.right = new LinkedListNode(4);
        System.out.println("normal linked list");
        for (LinkedListNode present = node; present != null; present = present.right) {
            System.out.print(present.data+"  ->  ");
        }
        System.out.println("\nreversed linked list");
        LinkedListNode reversed = reverse(node);
        for (LinkedListNode present = reversed; present != null; present = present.right) {
            System.out.print(present.data+"  ->  ");
        }
    }
    static LinkedListNode reverse(LinkedListNode head)
    {
        //***************
        
        LinkedListNode reversed = null;
        while(head!=null)
        {
            LinkedListNode next = head.right;
            head.right = reversed;
            reversed = head;
            head = next;
        }
        //**************
        return reversed;
    }
}

/**
 * head = 1
 * next = 2
 * head.right = reversed = null        1 will be inserted
 * reversed = head = 1 -> null
 * 
 * head = 2
 * next = 3
 * head.right = reversed = 1 ->null     2 will be inserted
 * reversed = head = 2 -> 1 -> null
 **/
