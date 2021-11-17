/**
 * Project name(项目名称)：算法_二叉树的实现之前序遍历
 * Package(包名): PACKAGE_NAME
 * Class(类名): BinaryTree
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/17
 * Time(创建时间)： 10:18
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class BinaryTree
{

    private TreeNode root;//根节点

    public BinaryTree()
    {
        root = null;
    }

    public void preOrder(TreeNode root)
    {
        /********** Begin *********/
        if (root == null)
        {
            return;
        }
        System.out.print(root.item + " ");
        preOrder(root.leftChild);
        preOrder(root.rightChild);

        /********** End *********/
    }

    /**
     * 以数组arr的数据，依次从上至下，从左至右构建一颗二叉树
     *
     * @param arr
     * @param
     * @return
     */
    public TreeNode createTree(int[] arr)
    {
        TreeNode[] tmp = new TreeNode[arr.length + 1];
        for (int k = 1; k <= arr.length; k++)
        {
            TreeNode node = new TreeNode(arr[k - 1]);
            tmp[k] = node;
            if (k == 1)
            {
                root = node;
            }
            else
            {
                int j = k / 2;
                if (k % 2 == 0)
                {
                    tmp[j].leftChild = node;
                }
                else
                {
                    tmp[j].rightChild = node;
                }
            }
        }
        return root;
    }

    public static class TreeNode
    {
        private TreeNode leftChild;
        private TreeNode rightChild;
        private int item;

        public TreeNode(int item)
        {
            this(null, null, item);
        }

        public TreeNode(TreeNode leftChild, TreeNode rightChild, int item)
        {
            this.leftChild = leftChild;
            this.rightChild = rightChild;
            this.item = item;
        }
    }

}
