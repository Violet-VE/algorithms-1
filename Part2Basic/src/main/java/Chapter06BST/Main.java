/***********************************************************
 * @Description : 二叉树基本方法的测试工具类
 *         /////////////////
 *         //      5      //
 *         //    /   \    //
 *         //   3    6    //
 *         //  / \    \   //
 *         // 2  4     8  //
 *         /////////////////
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2019/12/30 0:37
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package Chapter06BST;

public class Main {
    public static void main(String[] args) {
        BST<Integer> bst = new BST<>();
        int[] nums = {5, 3, 6, 8, 4, 2};
        for (int num : nums) {
            bst.add(num);
        }
        // 1.前序遍历测试
        System.out.print("前序遍历的结果为：");
        bst.preOrder();
        System.out.println();

        // 2.中序遍历测试
        System.out.print("中序遍历的结果为：");
        bst.inOrder();
        System.out.println();

        // 3.后序遍历测试
        System.out.print("后序遍历的结果为：");
        bst.postOrder();
        System.out.println();
    }
}
/**
 * 前序遍历的结果为：5 3 2 4 6 8
 * 中序遍历的结果为：2 3 4 5 6 8
 * 后序遍历的结果为：2 4 3 8 6 5
 */