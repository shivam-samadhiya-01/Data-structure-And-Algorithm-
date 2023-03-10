import java.util.Scanner;

class Node
{
    int data;
    Node left ,right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }
}
public class BinaryTreeDynamic {
    static Node root;
    BinaryTreeDynamic()
    {
        root=null;
    }
    public static void main(String args[])
    {
        BinaryTreeDynamic bt=new BinaryTreeDynamic();
        Node ob=new Node(3);
        root=ob;
        Node ob1=new Node(3);
        root.left=ob;
        Node ob2=new Node(4);
        root.right=ob;
        Node ob3=new Node(5);
        root.left.left=ob;
        Node ob4=new Node(6);
        root.right.left=ob;
        Node ob5=new Node(7);
        root.left.right=ob;
        Node ob6=new Node(8);
        root.right.right=ob;
        
    }
}
