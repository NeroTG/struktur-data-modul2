public class Link {
    Node head;

    public Link(){
        this.head = null;
    }

    public void add(int data){
        Node newNode = new Node(data);

        if (head == null){
            head = newNode;
        } else {
            Node currentNode = head; //menyediakan representasi
            while (currentNode.next != null){
                currentNode= currentNode.next;
            }
            currentNode.next = newNode; //implementasi
        }
    }

    // sorting data
    public void sort(){ //menggurutkan
        Node current = head;
        Node nextNode = null;
        int temp; //variable untuk menyimpan nilai

        if (head == null){ //mengurutkan elemen elemen
            return;
        } else {
            while (current != null){ //menngurutkan secara menaik
                nextNode = current.next;
                while (nextNode != null){
                    if (current.data > nextNode.data){
                        temp = current.data;
                        current.data = nextNode.data;
                        nextNode.data = temp;
                    }
                    nextNode = nextNode.next;
                }
                current = current.next;
            }
        }
    }
    public void printList(){
        Node currentNode = head;
        while (currentNode != null){
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
        }
}