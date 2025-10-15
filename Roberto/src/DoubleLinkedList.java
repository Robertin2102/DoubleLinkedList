public class DoubleLinkedList {
    node head;

    public void add (int data) {
        node newNode = new node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;//Guarda el nuevo nodo
        newNode.prev = current;//En e nuevo nodo guarda la referencia del anterior
    }
        public void printForward(){
            if(head == null){
                System.out.println("La lista esta vacia");
                return;
            }
            node current = head;
            while(current!=null){
                System.out.println(current.data);
                current=current.next;
            }
            System.out.println("Null");
        }

        public void printBackward(){
        if(head == null){
                System.out.println("La lista esta vacia");
                return;
        }
        node current = head;
        while(current.next!=null){
            current=current.next;
        }
        while(current!=null){
            System.out.println(current.data);
            current=current.prev;
        }
        }
    }