package singlylinkedlist.linkedlist;

import singlylinkedlist.node.Node;

public class MyLinkedList
{
    Node head;

    public MyLinkedList()
    {
        head = null;
    }

    public Node getHead()
    {
        return head;
    }

    //insert at last
    public void insertAtLast(int data)
    {
        Node node=new Node(data);

        if(head==null)
        {
            head=node;
        }
        else
        {
            Node temp=head;
            while(temp.getNext()!=null)
            {
                temp=temp.getNext();
            }
            temp.setNext(node);
        }
    }

    //traverse
    public void printList()
    {
        System.out.println("\n**********************************************************");
        System.out.println("Printing List.......");
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.getData());
            temp=temp.getNext();
            System.out.print(" ---> ");
        }
        System.out.print("null");
        System.out.println("\n**********************************************************\n");
    }

    //insert at beginning
    public void insertAtBeginning(int data)
    {
        Node node=new Node(data);
        node.setNext(head);
        head=node;
    }

    //delete from beginning
    public Node deleteFromBeginning()
    {
        Node response=null;
        response=head;
        if(head!=null)
        {
            head = head.getNext();
        }
        return response;
    }

    //delete from last
    public Node deleteFromLast()
    {
        Node response=null;
        if(head!=null)
        {
            Node temp=head;
            Node previous=null;
            while (temp.getNext()!=null)
            {
                previous=temp;
                temp=temp.getNext();
            }
            if(previous!=null)
            {
                response=previous.getNext();
                previous.setNext(null);
            }
            else
            {
                response=head;
                head=null;
            }
        }
        return response;
    }
}
