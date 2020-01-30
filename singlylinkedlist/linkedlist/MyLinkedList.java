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
}
