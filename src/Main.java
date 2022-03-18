import java.util.*;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args)  {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        TreeNode root= new TreeNode(3);
        TreeNode h1 = root;
        h1.left = new TreeNode(9);
        h1.right = new TreeNode(20);
        TreeNode h2 = h1.left;
        TreeNode h3 = h1.right;
        h2.left = null; h2.right = null;
        h3.left = new TreeNode(15);
        h3.right =  new TreeNode(7);
        out.println(new MinimumDepthOfBinaryTree().minDepth(root));

        TreeNode rut = new TreeNode(2);
        TreeNode hh = rut;
        hh.left = null;
        hh.right = new TreeNode(3);
        hh = hh.right;
        hh.left = null;
        hh.right = new TreeNode(4);
        hh= hh.right;
        hh.left = null;
        hh.right = new TreeNode(5);
        hh = hh.right;
        hh.left = null;
        hh.right = new TreeNode(6);
//        [2,null,3,null,4,null,5,null,6]
        out.println(new MinimumDepthOfBinaryTree().minDepth(rut));
        in.close();
        out.close();
    }
}
