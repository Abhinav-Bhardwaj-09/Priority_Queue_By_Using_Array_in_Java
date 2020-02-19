package PriorityQueueUsingArray;

/*
    Created by Abhinav Bhardwaj on IntelliJ IDEA
    on   19-02-2020 ,  Time :-    17 : 13
 
 */
public class Main {
    public static void main(String[] args) {
        Element e1 = new Element(10,5);
        Element e2 = new Element(20,3);
        Element e3 = new Element(30,2);
        Element e4 = new Element(40,1);
        MyQueue obj = new MyQueue(4);
        obj.enqueue(e1);
        obj.enqueue(e2);
        obj.enqueue(e3);
        obj.enqueue(e4);
        obj.display();
    }
}
