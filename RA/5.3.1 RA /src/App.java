import tree.TreePrinter;
import tree.Btree;

public class App {
    public static void main(String[] args) throws Exception {

        Btree<Integer> tree = new Btree<Integer>();
        TreeOperations<Integer> operator = new TreeOperations<Integer>();
        TreePrinter printer = new TreePrinter<>();

        tree.add(10);
        tree.add(9);
        tree.add(8);
        tree.add(7);
        tree.add(6);


        int count = operator.countNodes(tree.getRoot());
        System.out.println(count);

        int height = operator.findAltura(tree.getRoot());
        System.out.println(height);


        tree.treePrinter();

        Btree<Integer> reflejo = tree.refleja(tree);

        reflejo.treePrinter();


    }
}


