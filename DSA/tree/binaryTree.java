import java.util.LinkedList;
import java.util.Queue;

public class binaryTree{

    static class node{
        int data;
        node left;
        node right;
        node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class tree{
        int idx = -1;
        node treeBuilder(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            node newNode = new node(nodes[idx]);
            newNode.left = treeBuilder(nodes);
            newNode.right = treeBuilder(nodes);
            return newNode;
        }
    }

    // //pre order traversal - root -> left -> right
    // static void preOrder(node root){
    //     if(root==null){
    //         return;
    //     }
    //     System.out.print(root.data+" ");
    //     preOrder(root.left);
    //     preOrder(root.right);
    // }

    // //in order traversal - left -> root -> right
    // static void inOrder(node root){
    //     if(root==null){
    //         return;
    //     }
    //     inOrder(root.left);
    //     System.out.print(root.data+" ");
    //     inOrder(root.right);
    // }    

    // //post order traversak - left -> right -> root
    // static void postOrder(node root){
    //     if(root==null){
    //         return;
    //     }        
    //     postOrder(root.left);
    //     postOrder(root.right);
    //     System.out.print(root.data+" ");
    // }

    //level order traversal
    static void levelOrder(node root){
        if(root==null){
            return;
        }
        Queue<node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            node currNode = q.remove();
            if(currNode==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(currNode.data+" ");
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }
        }
    }


    public static void main(String[] args){
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        tree newTree = new tree();
        node root = newTree.treeBuilder(nodes);
        
        // System.out.print("PreOrder  : ");
        // preOrder(root);
        // System.out.println();
        
        // System.out.print("InOrder   : ");
        // inOrder(root);
        // System.out.println();

        // System.out.print("PostOrder : ");
        // postOrder(root);
        // System.out.println();

        // System.out.print("LevelOrder : ");
        levelOrder(root);
    }
}