
public class linklist_1 {
    public static void main(String args[]){
        node<Integer> node1=new node<Integer>(10);
        System.out.println(node1.data);
        System.out.print(node1.next);
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
