package PriorityQueueUsingArray;

/*
    Created by Abhinav Bhardwaj on IntelliJ IDEA
    on   19-02-2020 ,  Time :-    16 : 45
 
 */
public class Element {
    int data;
    int priority;
    public Element( int d , int p ){
        data = d ;
        priority = p ;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
