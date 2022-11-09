
public class dynamic_array {
    public static void main(String args[]){
        stack s=new stack();
        System.out.println(s.isEmpty());
        s.push(10);
        System.out.println(s.isEmpty());
        System.out.println(s.size());
        System.out.println(s.pop());
    }
    
}
class stack{
    private int data[];
    private int top;
    public stack(){
        data=new int[10];
        top=-1;
    }
    public stack(int capacity){
        data = new int[capacity];
        top=-1;
    }
    public boolean isEmpty(){
        return (top==-1);
    }
    public int size(){
        return top+1;
    }
    public int top(){
        return data[top];
    }
    public void push(int elem){
        if(size()==data.length)
        doubleCapacity();
        top++;
        data[top]=elem;
    }
    public int pop(){
        int temp=data[top];
        top--;
        return temp;
    }
    public  void doubleCapacity(){
        int[] temp=data;
        data=new int[temp.length*2];
        for(int i=0;i<data.length;i++){
            data[i]=temp[i];
        }
    }

}
