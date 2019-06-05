package br.univali.kob.model;

import java.util.Objects;

/**
 * Class to represent a flower on the binary tree.
 */
public class Node<T extends Comparable<T>> {
    private T data;
    private Node<T> right;
    private Node<T> left;

    /**
     * Default constructor for Node class.
     */
    public Node() {
        this.data = null;
        this.right = null;
        this.left = null;
    }

    /**
     * Constructor passing the value of data.
     * @param data: Object that contains the value passed to data.
     */
    public Node(T data) {
        super();
        this.data = data;
    }

    /**
     * Get the value of data class attribute.
     * @return T with the reference for the data value on the class.
     */
    public T getData() { return this.data; }

    /**
     * Set value for data class attribute.
     * @param data with the value that will be inserted on the class attribute.
     */
    public void setData(T data) {
        this.data = data;
    }

    /**
     * Get the value of right class attribute.
     * @return Node with the reference for the right value on the class.
     */
    public Node<T> getRight() { return this.right; }

    /**
     * Set value for right class attribute.
     * @param right with the value that will be inserted on the class attribute.
     */
    public void setRight(Node<T> right) {
        this.right = right;
    }

    /**
     * Get the value of left class attribute.
     * @return Node with the reference for the left value on the class.
     */
    public Node<T> getLeft() { return this.left; }

    /**
     * Set the value for left class attribute.
     * @param left with the value that will be inserted on the class attribute.
     */
    public void setLeft(Node<T> left) {
        this.left = left;
    }

    /**
     * Check if the node is empty (data and childes)
     * @return boolean with true if the node is empty and false if not
     */
    public boolean isEmpty() { return (this.data == null && this.left == null && this.right == null); }

    /**
     * Print the node in fork
     */
    public void print() {
        System.out.println(" " + this.data.toString());
        System.out.print(" /");
        System.out.print(" ");
        System.out.println("\\");
        System.out.print(this.left.getData());
        System.out.print(" ");
        System.out.print("  " + this.right.getData());
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", right=" + right +
                ", left=" + left +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return Objects.equals(data, node.data) &&
                Objects.equals(right, node.right) &&
                Objects.equals(left, node.left);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, right, left);
    }
}
