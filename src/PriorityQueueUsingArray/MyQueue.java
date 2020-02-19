package PriorityQueueUsingArray;

/*
    Created by Abhinav Bhardwaj on IntelliJ IDEA
    on   19-02-2020 ,  Time :-    16 : 48
 
 */
public class MyQueue {
    int front ;
    int rear ;
    Element arr [];
    public MyQueue( int size ){
        front = -1 ;
        rear = -1 ;
        arr = new Element[size];
    }

    public boolean isEmpty(){
        return front == -1;
    }
    public boolean isFull(){
        return rear == arr.length-1;
    }
    public void enqueue ( Element newelement ){
        int i = 0;
        if ( arr == null ){
            System.out.println("Not Created yet... ");
        }
        else if (isFull()){
            System.out.println("Overflow Condition... ");
        }
        else if ( isEmpty() ){
            front ++ ;
            rear ++ ;
            arr [ rear ] = newelement;
        }
        else {
            for ( i = rear ; i >= front ; i -- ){
                if (newelement.priority < arr [i].priority){
                    arr [i+1] = arr[i];
                }
                else {
                    break;
                }
            }
            arr[i+1] = newelement;
            rear ++ ;
        }
    }

    public void dequeue () {
        if( arr == null){
            System.out.println("Yet not Created... ");
        }
        else  if ( isEmpty() ){
            System.out.println("Queue is Empty... ");
        }
        else{
            arr [front] = null;
            front ++ ;
        }
    }

    public void display (){
        for ( int i = 0 ; i <= arr.length-1 ; i++ ){
            System.out.println(arr[i].data);
        }
    }
}
