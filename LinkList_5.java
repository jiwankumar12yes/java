import java .util.*;
import java.util.Scanner;

public class ith_LL {
    public static void main(String args[]){
        node<Integer> head=take_input_fun();
        print( head);
    }
    public static void print(node<Integer> head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.println();
    }
    public static node<Integer> take_input_fun(){
        node<Integer> head=null,tail=null;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no to create link list");
        int data=s.nextInt();
        while(data!=-1){
            node<Integer> newnode=new node<Integer>(data);
            if(head==null){
                head=newnode;
                tail=newnode;
            }
            else{
                node<Integer> temp=head;
                
                tail.next=newnode;
                tail=newnode;
            }
            data=s.nextInt();
        }
        return head;
    }
    
}
class node<T>{
    T data;
    node<T> next;
    node(T data){
        this.data=data;
        next=null;
    }
}
