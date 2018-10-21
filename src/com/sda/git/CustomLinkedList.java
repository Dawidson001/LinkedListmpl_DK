package com.sda.git;

public class CustomLinkedList<E> implements CustomList<E>
{

    private int size;
    private Node head;

    public CustomLinkedList()
    {
        head = new Node(null);
    }


    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public void add(E e) {
        Node copy = head;
//        System.out.println("Copy= " + copy);
        head = new Node(e);
//        System.out.println("Head = " + head);
        head.next = copy;
//        System.out.println("Next = " + head.next);
        size++;
    }

    public void printList ()
    {
        Node tmp = head;
        while (tmp != null)
        {
            System.out.println(tmp.data);
            tmp = tmp.next;
        }
    }

@Override
public void addTail(E e)
{
    Node tmp = head;
    while (tmp.next != null)
    {
        tmp = tmp.next;
    }
    tmp.next = new Node(e);
    System.out.println(tmp);
}

@Override
public void find(int index)
{
 Node tmp = head;
 for (int i = 0; i < index; i++)
 {
     tmp = tmp.next;
 }
    System.out.println(tmp);
}

    @Override
    public int size() {
        return 0;

    }



    class Node
    {
        private  Object data;
        private Node next;

        public Node (Object data)
        {
            this.data = data;
        }
        public Object getData ()
        {
            return this.data;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", next=" + next +
                    '}';


        }
    }
}
