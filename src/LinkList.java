public class LinkList<T>{



    public Node headNode;
    public int size;

    public class Node{
        public T data;
        public Node nextNode;
    }
    public void SinglyLinkedList(){
        headNode = null;
        size = 0;
    }

    public void insertsAtHead(T data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.nextNode = headNode;
        headNode = newNode;
        size++;
    }
    public void inse(T data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.nextNode = null;

        if (isEmpty()) {
            headNode = newNode;
        } else {
            Node current = headNode;
            while (current.nextNode != null) {
                current = current.nextNode;
            }
            current.nextNode = newNode;
        }
        size++;
    }
    public boolean cont(T dataToFind) {
        Node current = headNode;
        while (current != null) {
            if (current.data.equals(dataToFind)) {
                return true;
            }
            current = current.nextNode;
        }
        return false;
    }


    public void print(){

        if (isEmpty()){
            System.out.println("ERROR");
            return;
        }
        Node current = headNode;
        System.out.println("List: ");
        while (current.nextNode!=null){
            System.out.print(current.data.toString() + "->");
            current=current.nextNode;
        }
        System.out.println(current.data.toString() + "-> null");
    }
    public LinkList<T> mergeLists(LinkList<T> list2) {
        LinkList<T> mergedList = new LinkList<>();

        Node current = this.headNode;
        while (current != null) {
            mergedList.inse(current.data);
            current = current.nextNode;
        }

        current = list2.headNode;
        while (current != null) {
            mergedList.inse(current.data);
            current = current.nextNode;
        }


        return mergedList;
    }



    public boolean isEmpty(){
        if(headNode==null)
            return true;
        return false;
    }


    @Override
    public String toString() {
        return "LinkedList{" +
                "headNode=" + headNode +
                ", size=" + size +
                '}';
    }
}