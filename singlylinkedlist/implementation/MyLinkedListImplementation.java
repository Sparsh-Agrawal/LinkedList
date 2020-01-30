package singlylinkedlist.implementation;

import singlylinkedlist.linkedlist.MyLinkedList;
import singlylinkedlist.node.Node;

public class MyLinkedListImplementation
{
    public static void main(String[] args)
    {
        MyLinkedList linkedList=new MyLinkedList();
        Node delete=linkedList.deleteFromBeginning();
        if(delete!=null)
        {
            System.out.println("deleted data -> "+delete.getData());
        }
        else
        {
            System.out.println("List is Empty");
        }
        linkedList.insertAtLast(20);
        linkedList.insertAtLast(10);
        linkedList.printList();
        linkedList.insertAtBeginning(6);
        linkedList.insertAtBeginning(7);
        linkedList.printList();

        delete=linkedList.deleteFromBeginning();
        if(delete!=null)
        {
            System.out.println("deleted data -> "+delete.getData());
        }
        else
        {
            System.out.println("List is Empty");
        }
    }
}
