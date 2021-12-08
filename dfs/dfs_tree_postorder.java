package dfs;

class nodexyz{
    int key;
    nodexyz left,right;
    nodexyz(int item){
        key=item;
        left=right=null;
    }
}
class dfs_tree_postorder{
    static nodexyz root;
    dfs_tree_postorder(){
        root=null;
    }

    void printxyz(nodexyz nodexxx){
        if(nodexxx==null)
            return;
        printxyz(nodexxx.left);
        printxyz(nodexxx.right);
        System.out.println(nodexxx.key+" ");
    }
    void printxyz()
    {
    printxyz(root);
    }

    public static void main(String[] args) {
        dfs_tree_postorder zzz=new dfs_tree_postorder();
        zzz.root=new nodexyz(1);
        zzz.root.left=new nodexyz(2);
        zzz.root.right=new nodexyz(3);
        zzz.root.left.left=new nodexyz(4);
        zzz.root.left.right=new nodexyz(5);
        zzz.printxyz();
    }
}