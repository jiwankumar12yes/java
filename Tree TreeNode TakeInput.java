import java.util.*;
import java.util.ArrayList;
public class TakeInput {
    public static void main(String args[]){

    }
    public static Treenode2<Integer> TakeInput(){
        int n;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the root node");
        n=s.nextInt();
        Treenode2<Integer> root=new Treenode2(n);
        System.out.println("Enter the number of children for"+n);
        int childcount;
        childcount=s.nextInt();
        for(int i=0;i<childcount;i++){
            Treenode2<Integer> children=TakeInput();
            root.children.add(children);
        }
        return root;
    }
    
}
class Treenode2<T>{
    public T data;
    public ArrayList<Treenode2<T>> children;
    public Treenode2(T data){
        this.data=data;
        children=new ArrayList<>();
    }
}
