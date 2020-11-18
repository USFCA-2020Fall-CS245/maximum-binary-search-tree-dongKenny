/*
* Main testing class for BST
* @author: USFCACS 245
*/
public class BSTtest
{
    public static void main(String[] args)
    {
        //TODO CHANGE CLASS AS NEEDED TO TEST CODE
        BST<Integer> tree = new BST<Integer>();
        tree.insert(5);
        tree.insert(2);
        tree.insert(7);
        tree.insert(1);
        tree.insert(4);
        tree.print();
        System.out.println();
        System.out.println(tree.toString());
        System.out.println(tree.rangeSum(1, 4));

//        int L = Integer.parseInt(args[0]);
//        int R = Integer.parseInt(args[1]);
//        for(int i=2; i < args.length; i++)
//        {
//            tree.insert(args[i]);
//
//        }
//
//        tree.delete(args[3]);
//        System.out.println(tree.find(args[4]));
//        tree.print();
//
//        System.out.println(tree.rangeSum(L, R));
    }
}
