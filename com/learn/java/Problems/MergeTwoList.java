package com.learn.java.Problems;

class MergeTwoList {
    public static void main(String[] args) {
        Node list1 = new Node(1);
        list1.next = new Node(2);
        list1.next.next = new Node(4);
        list1.next.next.next = new Node(7);
        
        Node list2 = new Node(3);
        list2.next = new Node(5);
        list2.next.next = new Node(6);
        
        Node s = null;
        System.out.println(s);
        
        Node list = merge(list1,list2);
        for(Node l = list;l!=null;l=l.next)
        {
            System.out.println(l.data);
        }
    }
    static Node merge(Node list1,Node list2)
    {
        Node res  = null;
        if(list1==null && list2==null)
        {
            return null;
        }
        else if (list1==null)
        {
            return list2;
        }
        else if (list2==null) {
            return list1;
        }
        else
        {
            if (list1.data>list2.data)
            {
                res = new Node(list2.data);
                list2 = list2.next;
            }
            else {
                res = new Node(list1.data);
                list1 = list2.next;
            }
        }
        res = start(list1,list2,res.next);
        return res;
    }
    
    static Node start(Node list1,Node list2,Node res)
    {
        if(list1==null && list2==null)
        {
            return null;
        }
        else if (list1==null)
        {
            return res = list2;
        }
        else if (list2==null) {
            return res = list1;
        }
        else
        {
            if (list1.data>list2.data)
            {
                res = new Node(list2.data);
                list2 = list2.next;
                res = start(list1,list2,res.next);
                return res;
            }
            else {
                res = new Node(list1.data);
                list1 = list2.next;
                res = start(list1,list2,res.next);
                return res;
            }
        }
        
    }
}

class Node {
    Node next;
    int data;

    Node(int data) {
        this.data = data;
    }
}
