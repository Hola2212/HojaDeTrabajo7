public class Arbol<T extends Comparable<T>>{
    private Node<T> arbolito;
    private Node<T> actual;
    public Arbol(){
        this.arbolito = null;
    }
    public void add(T data) {
        if (this.arbolito == null){
            this.arbolito = new Node<>(data);
        }
        else{
            add(data, this.arbolito);
        }
    }
    public void add(T data, Node<T> actual){
        if (actual.getData().compareTo(data) > 0){
            if (actual.getLeft() == null){ actual.setLeft(new Node<T>(data)); }
            else{ add(data, actual.getLeft()); }
        }
        else{
            if (actual.getData().compareTo(data) < 0){
                if (actual.getRight() == null){ actual.setRight(new Node<T>(data)); }
                else{ add(data, actual.getRight()); }
            }
            else{
                throw new IllegalArgumentException("Can't add duplicated data!");
            }
        }
    }
    public String SortedArbolInOrder(){
        return inOrder(this.arbolito).strip().replaceAll(" ", ", ") + ".";
    }
    public String SortedArbolPreOrder(){
        return inOrder(this.arbolito).strip().replaceAll(" ", ", ") + ".";
    }
    public String SortedArbolPostOrder(){
        return inOrder(this.arbolito).strip().replaceAll(" ", ", ") + ".";
    }
    public String inOrder(Node<T> dataPoint){
        if (dataPoint == null) { return ""; }
        return inOrder(dataPoint.getLeft()) + dataPoint.getData() + " " + inOrder(dataPoint.getRight());
    }
    public String preOrder(Node<T> dataPoint){
        if (dataPoint == null) { return ""; }
        return dataPoint.getData() + " " + inOrder(dataPoint.getLeft()) + inOrder(dataPoint.getRight());
    }
    public String postOrder(Node<T> dataPoint){
        if (dataPoint == null) { return ""; }
        return inOrder(dataPoint.getLeft()) + inOrder(dataPoint.getRight()) + dataPoint.getData() + " ";
    }

    public T search(T data) {
        return search(data, this.arbolito);
    }

    private T search(T data, Node<T> current) {
        if (current == null) return null;

        int comparison = current.getData().compareTo(data);

        if (comparison == 0) return current.getData();
        else if (comparison > 0) return search(data, current.getLeft());
        else return search(data, current.getRight());
    }
}