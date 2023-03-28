public class Main {
    public static void main(String[] args){

        Link myLink = new Link();

        myLink.add(5);
        myLink.add(8);
        myLink.add(10);
        myLink.add(1);

        System.out.print("Linked list before sorted\t: ");
        myLink.printList();
        System.out.print("Linked list after sorted\t: ");
        myLink.sort();
        myLink.printList();
        }

}