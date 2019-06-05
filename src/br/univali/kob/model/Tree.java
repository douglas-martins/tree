package br.univali.kob.model;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Class to represent a Binary Tree
 */
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
    public void insert(Comparable data) {
        this.root = insert(data, this.root);
    }

    /**
     * Remove a object with the value passed.
     * @param data: Object with the value that will be removed from tree.
     */
    public void remove(Object data) { remove(data, this.root); }

    /**
     * Print the Tree with the Nodes on fork.
     */
    public void print(Node node) {
        ArrayList<ArrayList<Node>> elements;
    }

    private Node insert(Comparable data, Node node) {
        if (node == null) {
            return new Node(data);
        }

        if (data.compareTo(node.getData()) < 0) {
            node.setLeft(insert(data, node.getLeft()));
        } else if (data.compareTo(node.getData()) > 0) {
            node.setRight(insert(data, node.getRight()));
        } else {
            // value already exists
            return node;
        }

        return node;


//        if (node == null) {
//            node = new Node();
//            node.setData(data);
//            node.setRight(null);
//            node.setLeft(null);
//            this.total++;
//        } else {
//            if (node.dataSize() > data.hashCode()) {
//                insert(data, node.getRight());
//            } else {
//                insert(data, node.getLeft());
//            }
//        }
    }

    private void remove(Object data, Node node) {
        Node reference = null;

//        if (data.hashCode() < node.get()) {
//            remove(data, node.getLeft());
//        } else {
//            if (data.hashCode() > node.dataSize()) {
//                remove(data, node.getRight());
//            } else {
//                reference = node;
//                if (reference.getRight() == null) {
//                    node = reference.getLeft();
//                    reference.setLeft(node);
//                } else {
//                    if (reference.getLeft() == null) {
//                        node = reference.getRight();
//                        reference.setRight(node);
//                    } else {
//                        removeElement(reference, reference.getLeft());
//                    }
//                }
//            }
//        }

//        procedimento retira (elemento : inteiro; var p : ref)
//        variável
//        q : ref

//        início
//        se elemento < p.chave então
//        retira (elemento, p.subArvoreEsquerda)
//        senão
//        se elemento > p.chave então
//        retira (elemento, p.subArvoreDireita)
//        senão
//        q  p
//        se q.subArvoreDireita = nulo então
//        p  q.subArvoreEsquerda
//                senão
//        se q.subArvoreEsquerda = nulo então
//        p  q.subArvoreDireita
//                senão
//        retiraElemento (q.subArvoreEsquerda)
//        fim se
//        fim se
//        libere (q)
//        fim se
//        fim se
//        fim
    }

    private void removeElement(Node reference, Node node) {
        if (node.getRight() != null) {
            removeElement(reference, node.getRight());
        } else {
            reference.setData(node.getData());
            reference = node;
            node.setLeft(node.getLeft());
        }

//        procedimento retiraElemento (var r : ref)
//        início
//        se r.subArvoreDireita ≠ nulo então
//        retiraElemento (r.subArvoreDireita)
//        senão
//        q.chave  r.chave
//        q  r
//        r  r.subArvoreEsquerda
//        fim se
//        fim
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
