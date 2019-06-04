package br.univali.kob.model;

public class Tree {
    private int total;
    private Node root;

    /**
     * Default constructor for Tree class.
     * @param root: Node value that will be passed to root.
     */
    public Tree(Node root) {
        this.root = root;
        this.total = 0;
    }

    /**
     * Get class root value.
     * @return Node with the reference for the root.
     */
    public Node getRoot() { return this.root; }

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
    public boolean isInside(Node node) {
        return false;
    }

    /**
     * Insert a Object data (with a Node) inside a tree.
     * @param data: Object reference with data that will be inserted.
     */
    public void insert(Object data) {
        insert(data, this.root);
    }

    /**
     * Remove a node from tree.
     * @param node: Node reference that will bel deleted.
     */
    public void remove(Node node) {

    }

    private void insert(Object data, Node node) {
        if (node.isEmpty()) {
            node = new Node();
            node.setData(data);
            node.setRight(null);
            node.setLeft(null);
        } else {
            if (node.getData().hashCode() > data.hashCode()) {
                insert(data, node.getRight());
            } else {
                insert(data, node.getLeft());
            }
        }
    }

    private void removeElement(Node node) {

    }
}
