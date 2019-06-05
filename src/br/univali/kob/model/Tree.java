package br.univali.kob.model;

import java.util.Objects;

/**
 * Class to represent a Binary Tree
 */
public class Tree<T extends Comparable<T>> {
    private int total;
    private Node<T> root;

    /**
     * Default constructor for Tree class.
     * @param root: Node value that will be passed to root.
     */
    public Tree(Node<T> root) {
        this.root = root;
        this.total = 0;
    }

    /**
     * Get class root value.
     * @return Node with the reference for the root.
     */
    public Node<T> getRoot() { return this.root; }

    /**
     * Check if the tree is empty.
     * @return boolean with true if the tree is empty and false if not
     */
    public boolean isEmpty() { return this.root == null; }

    /**
     * Get the tree total of nodes inside.
     * @return int with the value of nodes in the tree.
     */
    public int treeTotal() { return this.total; }

    /**
     * Check if a node is inside this tree.
     * @param node: Node object that will be searched on the tree.
     * @return boolean with the true value if Node is inside the tree and false if not.
     */
    public boolean isInside(Node<T> node) {
        return false;
    }

    /**
     * Insert a Object data (with a Node) inside a tree.
     * @param data: Object reference with data that will be inserted.
     */
    public void insert(T data) {
        this.root = insert(data, this.root);
    }

    /**
     * Remove a object with the value passed.
     * @param data: Object with the value that will be removed from tree.
     */
    public void remove(T data) { this.root = remove(data, this.root); }

    /**
     * Print the Tree with the Nodes on fork.
     * @param type: TreeTravelType of print order the tree has to bem printed.
     */
    public void print(TreeTravelType type) {
        switch (type) {
            case IN_ORDER:
                printInOrder(this.root);
                break;
            case POST_ORDER:
                printPostOrder(this.root);
                break;
                default:
                    printPreOrder(this.root);
        }
    }

    private Node<T> insert(T data, Node<T> node) {
        if (node == null) { return new Node<>(data); } // empty root

        if (data.compareTo(node.getData()) < 0) { // smaller than the node more to the left
            node.setLeft(insert(data, node.getLeft()));
        } else if (data.compareTo(node.getData()) > 0) { // bigger than the node more to the left
            node.setRight(insert(data, node.getRight()));
        } else { // value already exists
            return node;
        }

        return node;
    }

    private Node<T> remove(Comparable<T> data, Node<T> node) {
        if (node == null) { return null; }

        if (data.compareTo(node.getData()) == 0) { // Node to delete found
            if (node.getLeft() == null && node.getRight() == null) { return null; } // no nodes

            if (node.getRight() == null) { return node.getLeft(); } // one node, right

            if (node.getLeft() == null) { return node.getRight(); } // one node, left

            // two nodes
            T smallestData = treeSmallestData(node.getRight());
            node.setData(smallestData);
            node.setRight(remove(smallestData, node.getRight()));
            return node;
        }

        if (data.compareTo(node.getData()) < 0) {
            node.setLeft(remove(data, node.getLeft()));
            return node;
        }

        node.setRight(remove(data, node.getRight()));
        return node;
    }

    private T treeSmallestData(Node<T> node) {
        return node.getLeft() == null ? node.getData() : treeSmallestData(node.getLeft());
    }

    private T treeBiggerData(Node<T> node) {
        return node.getRight() == null ? node.getData() : treeBiggerData(node.getRight());
    }

    private void printPreOrder(Node<T> node) { // PRÉ-ORDEM
        if (node != null) {
            System.out.print(" " + node.getData());
            printPreOrder(node.getLeft());
            printPreOrder(node.getRight());
        }
    }

    private void printInOrder(Node<T> node) { // IN-ORDEM
        if (node != null) {
            printInOrder(node.getLeft());
            System.out.print(" " + node.getData());
            printInOrder(node.getRight());
        }
    }

    private void printPostOrder(Node<T> node) { // PÓS-ORDEM
        if (node != null) {
            printPostOrder(node.getLeft());
            printPostOrder(node.getRight());
            System.out.print(" " + node.getData());
        }
    }

    @Override
    public String toString() {
        return "Tree{" +
                "total=" + total +
                ", root=" + root +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tree tree = (Tree) o;
        return total == tree.total &&
                Objects.equals(root, tree.root);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, root);
    }
}
