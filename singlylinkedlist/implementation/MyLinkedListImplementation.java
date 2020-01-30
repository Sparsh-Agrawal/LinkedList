package singlylinkedlist.implementation;

import singlylinkedlist.linkedlist.MyLinkedList;

public class MyLinkedListImplementation
{
    public static void main(String[] args)
    {
        MyLinkedList linkedList=new MyLinkedList();
        linkedList.insertAtLast(20);
        linkedList.insertAtLast(10);
        linkedList.printList();
        linkedList.insertAtBeginning(6);
        linkedList.insertAtBeginning(7);
        linkedList.printList();
    }
}
