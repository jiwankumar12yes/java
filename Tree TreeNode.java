import java.util.ArrayList;
public class TreeNode {
        public static void main(String args[]){
            TreeNode_cls<Integer> root=new TreeNode_cls(1);
            TreeNode_cls<Integer> node1=new TreeNode_cls(2);
            TreeNode_cls<Integer> node2=new TreeNode_cls(3);
            TreeNode_cls<Integer> node3=new TreeNode_cls(4);
            TreeNode_cls<Integer> node4=new TreeNode_cls(5);
            root.children.add(node1);
            root.children.add(node2);
            root.children.add(node3);
            node2.children.add(node4);
        }
}
class TreeNode_cls<T>{
    public T data;
    public ArrayList<TreeNode_cls<T>> children;
    public TreeNode_cls(T data){
        this.data=data;
        children=new ArrayList<>();
    }
}
