import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Main {
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;

        while (cur != null || !stack.empty()) {
            while(cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            list.add(cur.val);
            cur = cur.right;
        }
        return list;
    }

    public static void main(String[] args) {
        TreeNode cur = new TreeNode(5);
        cur = new TreeNode(4, cur, null);
        cur = new TreeNode(3, null, cur);
        cur = new TreeNode(1, new TreeNode(2), cur);

        System.out.println(inorderTraversal(cur).toString());

    }
}