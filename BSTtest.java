/*
* Main testing class for BST
* @author: USFCACS 245
*/
public class BSTtest
{
    public static void main(String[] args)
    {
        BST<Integer> tree = new BST<Integer>();
        tree.insert(5);
        tree.insert(2);
        tree.insert(7);
        tree.insert(1);
        tree.insert(4);
        tree.print();
        System.out.println();
        System.out.println(tree.toString());
        System.out.println(tree.rangeSum(1, 7) + "\n");

        tree.delete(5);
        tree.print();
        System.out.println("\n"+tree.toString());
        System.out.println(tree.rangeSum(1, 7) + "\n");


        BST<String> tS = new BST<String>();
        tS.insert("a");
        tS.insert("b");
        tS.insert("c");
        tS.insert("d");
        tS.insert("e");
        tS.print();
        System.out.println(tS.toString());
        System.out.println(tS.rangeSum(0, 10));
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
