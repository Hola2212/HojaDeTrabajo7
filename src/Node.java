public class Node<T extends Comparable<T>> {
    private Node<T> left;
    private Node<T> right;
    private T data;
    public Node(T data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
    public Node<T> getLeft(){
        return this.left;
    }
    public Node<T> getRight(){
        return this.right;
    }
    public T getData(){
        return this.data;
    }
    public void setLeft(Node<T> newData){
        this.left = newData;
    }
    public void setRight(Node<T> newData){
        this.right = newData;
    }
}