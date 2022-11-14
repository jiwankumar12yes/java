import java.util.*;
import java.util.ArrayList;
public class Print {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        // TakeInput(s);
        Treenode2<Integer> root=TakeInput(s);
        print(root);
    }
    public static Treenode2<Integer> TakeInput( Scanner s){
        int n;
        System.out.println("Enter the root node");
        n=s.nextInt();
        Treenode2<Integer> root=new Treenode2<Integer>(n);
        System.out.println("Enter the number of children for"+ n);
        int childcount=s.nextInt();
        
        for(int i=0;i<childcount;i++){
            Treenode2<Integer> child=TakeInput(s);
            root.children.add(child);
        }
        return root;
    }
    public static void print(Treenode2<Integer> root){
        String s=root.data+":";
        for(int i=0;i<root.children.size();i++){
            s=s+root.children.get(i).data+",";
        }
        System.out.println(s);
        for(int i=0;i<root.children.size();i++){
            print(root.children.get(i));
        }
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
