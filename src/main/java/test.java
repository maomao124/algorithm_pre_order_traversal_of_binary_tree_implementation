import java.awt.*;

/**
 * Project name(项目名称)：算法_二叉树的实现之前序遍历
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/17
 * Time(创建时间)： 10:25
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class test
{
    public static void main(String[] args)
    {
        if (args.length == 0)
        {
            BinaryTree tree = new BinaryTree();
            int[] data = {3, 4, 7, 0, 5, 6};
            BinaryTree.TreeNode root = tree.createTree(data);
            tree.preOrder(root);
        }
        else
        {
            int pos = 1;
            try
            {
                BinaryTree tree = new BinaryTree();
                int[] data = new int[args.length];
                for (int i = 0; i < args.length; i++)
                {
                    data[i] = Integer.parseInt(args[i]);
                    pos++;
                }
                System.out.println("已传递参数");
                BinaryTree.TreeNode root = tree.createTree(data);
                tree.preOrder(root);
            }
            catch (Exception e)
            {
                Toolkit.getDefaultToolkit().beep();
                System.out.println("参数传递异常！！！请检查第" + pos + "个参数");
            }
        }
    }
}
