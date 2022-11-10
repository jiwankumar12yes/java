
public class using_array {
    public static void main(String args[]) throws QueueFull, queueEmptyException{
        Queue q=new Queue();
        for(int i=0;i<7;i++){
            q.enqueue(i);
        }
        while (!q.isEmpty) {
            System.out.println(q.dequeue());
            
        }
    }
    
}
class Queue{
    public boolean isEmpty;
    private int data[];
    private int front;
    private int rear;
    private int size;
    public Queue(){
        data=new int[10];
        front=-1;
        rear=-1;
        size=0;
    }
    public Queue(int capacity){
        data=new int[capacity];
        front=-1;
        rear=-1;
        size=0;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public int front() throws queueEmptyException{
        if(size==0){
            queueEmptyException e=new queueEmptyException();
            throw e;
        }
        return data[front];
    }
    public void enqueue(int elem) throws QueueFull{
        if(size==data.length){
            QueueFull e=new QueueFull();
            throw e;
        }
        if(size==0){
            front=0;
        }
        size++;
        rear++;
        if(rear==data.length){
            rear=0;
        }
        data[rear]=elem;
    }
    public int dequeue() throws queueEmptyException{
        if(size==0){
            throw new queueEmptyException();
        }
        int temp=data[front];
        front++;
        size--;
        if(size==0){
            front=-1;
            rear=-1;
        }
        return temp;
    }
}
class queueEmptyException extends Exception{

}
class QueueFull extends Exception{

}
