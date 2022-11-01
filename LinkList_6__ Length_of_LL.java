import java .util.*;
import java.util.Scanner;

public class Length_LL{
    public static void main(String args[]){
        node<Integer> head=take_input_fun();
        print( head);
        int count=length(head);
        System.out.println(count);
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
                // while(temp.next!=null){
                //     temp=temp.next;
                // }
                // temp.next=newnode;
                tail.next=newnode;
                tail=newnode;
            }
            data=s.nextInt();
        }
        return head;
    }
    public static int length(node<Integer> head){
        node<Integer> temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
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
