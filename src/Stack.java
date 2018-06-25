public class Stack {

    private int nForSize;  //traks size
    private Node first;    // first element

    private class Node{
        private int data;
        private Node next;
    }


    public Stack(){
        nForSize = 0;
        first = null;
    }

    //is empty
    public boolean isEmpty(){
        return first==null;
    }

    //push
    public void push(int data){


        Node oldFirst = first;
        first = new Node();
        first.data = data;
        first.next=oldFirst;
        nForSize++;


    }
    //size
    public int size(){
        return nForSize;
    }
    //pop
    public int pop(){

        int data = first.data;

        first = first.next;
        nForSize--;

        return data;
    }

    //peek
    public int peek(){
        return first.data;
    }

}
