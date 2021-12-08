package dfs;

class node123{
    int key;
    node123 left,right;
    node123(int item)
    {
        key=item;
        left=right=null;
    }
}

class dfs_tree_preorder{
    static node123 root;
    dfs_tree_preorder(){
        root=null;
    }
 void print123(node123 nodeabc){
        if(nodeabc==null)
            return;
      System.out.println(nodeabc.key+" ");
      print123(nodeabc.left);
      print123(nodeabc.right);
}
void print123()
{
print123(root);
};

    public static void main(String[] args) {
        dfs_tree_preorder aaa=new dfs_tree_preorder();
        aaa.root=new node123(1);
        aaa.root.left=new node123(2);
        aaa.root.right=new node123(3);
        aaa.root.left.left=new node123(4);
        aaa.root.left.right=new node123(5);
        aaa.print123();
    }
}
