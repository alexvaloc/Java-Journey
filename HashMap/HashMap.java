public class HashMap {

    public LinkedList[] hashmap;

    public HashMap(int size) {
        this.hashmap = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            this.hashmap[i] = new LinkedList();
        }
    }

    public int hash(String key) {
        int hashCode = 0;
        for (int i = 0; i < key.length(); i++) {
            hashCode = hashCode + Character.codePointAt(key, i);
        }
        hashCode = hashCode % this.hashmap.length;
        return hashCode;
    }

    public void assign(String key, String value) {
        int arrayIndex = this.hash(key);
        LinkedList list = this.hashmap[arrayIndex];
        if (list.head == null) {
            list.addToHead(key, value);
            return;
        }
        Node current = list.head;
        while (current != null) {
            if (current.key == key) {
                current.setKeyValue(key, value);
            }
            if (current.getNextNode() == null) {
                current.setNextNode(new Node(key, value));
                break;
            }
            current = current.getNextNode();
        }
    }

    public String retrieve(String key) {
        int arrayIndex = this.hash(key);
        Node current = this.hashmap[arrayIndex].head;
        while (current != null) {
            if (current.key == key) {
                return current.value;
            }
            current = current.getNextNode();
        }
        return null;
    }

    public void remove(String key) {
      int arrayIndex = this.hash(key);
      LinkedList list = this.hashmap[arrayIndex];
      if(list.head == null) {
        return; //Nada que eliminar
      }

      if(list.head.key == key){
        list.head = list.head.getNextNode(); //Actualizamos el head de la lista
        return;
      }

      //Si el nodo a eliminar está en otra parte de la lista
      Node current = list.head;
      while(current.getNextNode() != null) {
        if(current.getNextNode().key == key) {
          current.setNextNode(current.getNextNode().getNextNode());
          return;
        }
        current.getNextNode();
      }

    }

    public static void main(String[] args) {

      HashMap birdCensus = new HashMap(15);
      birdCensus.assign("mandarin duck","Central Park Pond");
      birdCensus.assign("monk parakeet", "Brooklyn College");
      birdCensus.assign("horned owl","Pelham Bay Park");
      System.out.println(birdCensus.retrieve("mandarin duck"));
      System.out.println(birdCensus.retrieve("monk parakeet"));
      System.out.println(birdCensus.retrieve("horned owl"));

      birdCensus.remove("mandarin duck");
      System.out.println(birdCensus.retrieve("mandarin duck"));
 
    } 
}