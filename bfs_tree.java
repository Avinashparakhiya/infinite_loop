import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class node{
    int data;
    node left,right;
     node(int key){
        data=key;
        left=right=null;
    }
}
class traverce{
    static node root;
    traverce(){
        root=null;
    }
         static List<List<Integer>> traverse(node root){
        List<List<Integer>> bfs=new ArrayList<>();
        if(root == null)
            return bfs;
             Queue<node> queue=new LinkedList<>();
             queue.add(root);
             while (!queue.isEmpty())
             {
                 int size= queue.size();
                 List<Integer>currentlevel=new ArrayList<>();
                 for(int i=0;i<size;i++)
                 {
                  node current=queue.poll();
                  currentlevel.add(current.data);
                  if(current.left!=null)
                        queue.add(current.left);
                  if (current.right!=null)
                        queue.add(current.right);
                 }
                 bfs.add(currentlevel);
             }

             return bfs;
         }

    public static void main(String[] args) {
        root=new node(1);
        root.left=new node(2);
        root.right=new node(3);
        root.left.left=new node(4);
//        root.left.right=new node(5);
        root.right.left=new node(6);
        root.right.right=new node(7);
        List<List<Integer>>ans=traverse(root);
        for(List<Integer>level:ans){
            System.out.println(level.toString());
        }
    }
}

