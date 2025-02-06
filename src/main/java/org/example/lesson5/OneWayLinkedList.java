package org.example.lesson5;

public class OneWayLinkedList {
    private Node head;
    private Node tail;
    private int size;


    public OneWayLinkedList add(OneWayLinkedList list, int value) {
        Node new_node = new Node(value);
        if (list.head == null) {
            this.head = new_node;
        } else {
            this.tail = new_node;
        }
        this.size++;
        return list;
    }

    public void print(OneWayLinkedList list) {
        Node currNode = list.head;
        while (currNode != null) {
            System.out.print(currNode.getValue() + " ");
            currNode = currNode.getNext();
        }
    }

    public OneWayLinkedList deleteByKey(OneWayLinkedList list, int value) {
        Node currNode = list.head, prev = null;
        if (currNode != null && currNode.getValue() == value) {
            list.head = currNode.getNext();
            list.size--;
            return list;
        }
        while (currNode != null && currNode.getValue() != value) {
            prev = currNode;
            currNode = currNode.getNext();
        }

        if (currNode != null) {
            prev.setNext(currNode.getNext());
            list.size--;
        }

        if (currNode == null) System.out.println("Not found");

        return list;
    }

    public OneWayLinkedList delByPosition(OneWayLinkedList list, int position){
        Node currNode = list.head, prev = null;
        if (position == 0 && currNode != null) {
            list.head = currNode.getNext();
            return list;
        }

        int count = 0;
        while(currNode != null) {
            if (count == position) {
                prev.setNext(currNode.getNext());
                break;
            }
            prev = currNode;
            currNode = currNode.getNext();
            count++;
        }
        if (currNode == null) System.out.println("Not found");
        return list;
    }
}
