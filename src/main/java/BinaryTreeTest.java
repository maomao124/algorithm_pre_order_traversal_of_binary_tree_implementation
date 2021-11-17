import java.util.Scanner;

/**
 * Project name(项目名称)：算法_二叉树的实现之前序遍历
 * Package(包名): PACKAGE_NAME
 * Class(类名): BinaryTreeTest
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/17
 * Time(创建时间)： 10:19
 * Version(版本): 1.0
 * Description(描述)：
 * 测试输入：
 *
 * 6
 * 3 4 7 0 5 6
 * 预期输出：
 *
 * 3
 * 4
 * 0
 * 5
 * 7
 * 6
 */

public class BinaryTreeTest
{
    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 0;
        int[] data = new int[n];
        while (in.hasNext())
        {
            int item = in.nextInt();
            data[i++] = item;
        }
        BinaryTree.TreeNode root = tree.createTree(data);
        tree.preOrder(root);
    }
}
