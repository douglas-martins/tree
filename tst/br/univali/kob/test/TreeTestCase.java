package br.univali.kob.test;

import br.univali.kob.model.Node;
import br.univali.kob.model.Tree;

public class TreeTestCase {

    public static void main(String[] args) {
        Node node = new Node(10);
        node.setLeft(new Node(2));
        node.setRight(new Node(1));
        Tree tree = new Tree(null);

        tree.insert(3);
        tree.insert(4);
        tree.insert(5);
        tree.insert(1);
        tree.insert(6);
        tree.insert(7);
        tree.insert(0);
        tree.insert(8);

        tree.print(tree.getRoot());

        System.out.println();
        System.out.println("Total " + tree.treeTotal());


        // node.print();
    }
}
