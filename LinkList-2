public class print_LL {
    public static void main(String args[]){
        node<Integer> node1=new node(10);
        node<Integer> node2=new node(20);
        node<Integer> node3=new node(30);
        node1.next=node2;
        node2.next=node3;
        node<Integer> head=node1;
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
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
