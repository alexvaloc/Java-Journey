public class Node {

  public String data;
  private Node next;

  //Los nodos se componen del dato que guardan y un link al siguiente nodo
  //Head -> Nodo inicial. Si su valor es null la lista esta vacia
  //Tail -> Nodo final. El valor de su propiedad "next" es null.

  public Node(String data) {
    this.data = data;
    this.next = null;
  }

  public void setNextNode(Node node) {
    this.next = node;
  }

  public Node getNextNode() {
    return this.next;
  }

}