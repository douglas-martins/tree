package br.univali.kob.test;

import br.univali.kob.model.Node;
import br.univali.kob.model.Tree;
import br.univali.kob.model.TreeTravelType;

public class TreeTestCase {

    public static void main(String[] args) {
        Node<Integer> node = new Node<>(10);
        node.setLeft(new Node<>(2));
        node.setRight(new Node<>(1));

        Tree<Integer> tree = new Tree<>(null);

        tree.insert(3);
        tree.insert(4);
        tree.insert(5);
        tree.insert(1);
        tree.insert(6);
        tree.insert(7);
        tree.insert(0);
        tree.insert(8);

        System.out.print("Print tree in pre order: ");
        tree.print(TreeTravelType.PRE_ORDER);
        System.out.println();
        System.out.print("Print tree in in order: ");
        tree.print(TreeTravelType.IN_ORDER);
        System.out.println();
        System.out.print("Print tree in post order: ");
        tree.print(TreeTravelType.POST_ORDER);
        System.out.println();

        System.out.println();
        System.out.println("Total " + tree.treeTotal());
    }
}
