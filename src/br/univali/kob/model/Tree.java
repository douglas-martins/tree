package br.univali.kob.model;

public class Tree {
    private Node root;

    public Tree(Node root) {
        this.root = root;
    }

    public Node getRoot() { return this.root; }

    public boolean isEmpty() {
        return this.root == null;
    }

    public int treeTotal() {
        return -1;
    }

    public boolean isInside(Node node) {
        return false;
    }

    public void insert(Node node) {

    }

    public void remove(Node node) {

    }


}
