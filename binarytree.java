public class binarytree {
    public node root;

    public void  NewNode(int data){
        root = NewNode(root, new node(data));
    }

    private node NewNode(node root, node newData){
        if (root == null){
            root = newData;
            return  root;
        }
        if (newData.data < root.data){
            root.left = NewNode(root.left, newData);
        }else {
            root.right = NewNode(root.right, newData);
        }
        return root;
    }
    public void inOrder(node node){
        if(node != null){
            inOrder(node.left);
            System.out.println(node.data + " ");
            inOrder(node.right);
        }
    }
    public void preOrder(node node){}
    public void postOrder(node node){}
}