import java.util.Scanner;

class node {
    int data;
    node left;
    node right;

    node(int data) {
        this.data = data;
    }
}

class bstCreatePrint {

    void printInOrder(node tree){
        if(tree==null) return;
        printInOrder(tree.left);
        System.out.println(tree.data);
        printInOrder(tree.right);
    }

    node create(int[] arr){
        node tree = null;
        for(int i = 0;i<arr.length;i++){
            tree = insert(tree,arr[i]);
        }
        return tree;
    }


    node insert(node tree, int ele){
        if(tree==null){
            tree = new node(ele);
            return tree;
        }

        if(ele>=tree.data){
            tree.right = insert(tree.right,ele);
        }
        else{
            tree.left = insert(tree.left,ele);
        }

        return tree;
    }
}

class bst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        node root;
        int arr[] = {3,1,8,9,4,3,100};
        bstCreatePrint obj = new bstCreatePrint();
        root = obj.create(arr);
        obj.printInOrder(root);


        sc.close();
    }
}