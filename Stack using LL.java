import java.util.*;

public class Stack_array {
    public static void main(String args[]) throws stackfullException{
        // System.out.println("Hello");
        Stack1 s=new Stack1();
        s.push(1);
        s.push(11);
        s.push(111);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }

    }
    
}
class Stack1{
    private int data[];
     int top;
    public Stack1(){
        data=new int[10];
        top=-1;
    }
    public Stack1(int capacity){
        data=new int[capacity];
        top=-1;
    }
    public boolean isEmpty(){
        // if(top==-1){
        //     return true;
        // }
        // else{
        //     return false;
        // }
        return (top==-1);
    }
    public int size(){
       return top+1; 
    }
    public int top() throws StackEmptyException{
        if(size()==0){
            StackEmptyException e=new StackEmptyException();
            throw e;
        }
        return  data[top];
    }
    public void push(int elem) throws stackfullException{
        if(size()==data.length){
        // stack full
        stackfullException e=new stackfullException();
        throw e;
        }
        top++;
        data[top]=elem;
    }
    public int pop(){
        int temp=data[top];
        top--;
        return temp;
    }
}
class StackEmptyException extends Exception{
    

}
class stackfullException extends Exception{
   
}
