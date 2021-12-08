package dfs;

class Node{
    int key;
    Node left,right;
     Node(int item){
        key=item;
        left=right=null;
    }
}

public class dfs_tree_inorder {
    static Node root;
    dfs_tree_inorder(){
        root=null;
    }

    void printtree(Node node){
        if(node==null)
            return;
        printtree(node.left);
        System.out.println(node.key+" ");
        printtree(node.right);
    }
    void printtree()
    {
        printtree(root);
    }

    public static void main(String[] args) {
        dfs_tree_inorder abc=new dfs_tree_inorder();
        abc.root=new Node(1);
        abc.root.left=new Node(2);
        abc.root.right=new Node(3);
        abc.root.left.left=new Node(4);
        abc.root.left.right = new Node(5);
        System.out.println("++");
        abc.printtree();

    }
}