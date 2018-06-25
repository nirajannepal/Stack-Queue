public class Queue {
    int size;
    Node first;
    Node last;

    private class Node{
        int data;
        Node next;
    }

    public Queue(){
        size = 0;
        first= null;
        last=null;
    }
    //isEmpty
    public boolean isEmpty(){
        return first==null;
    }
    //size
    public int size(){
        return size;
    }
    //queue 4-->7-->8-->
    public void queue(int data){
        Node oldLast = last;
        last = new Node();
        last.data = data;
        last.next = null;
        if(first==null) first=last;
        else oldLast.next=last;
        size++;
    }
    //dequeue
    public int dequeue(){
        int data = first.data;
        first =first.next;
        if(isEmpty()) {
            last = null;
        }
        size--;
        return data;
    }
}
