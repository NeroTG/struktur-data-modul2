import java.util.LinkedList;

public class main {

    public static void main(String[] args) {
        LinkedList<String> Hewan = new LinkedList<>();
        Hewan.add("Sapi");
        Hewan.add("Kelinci");
        Hewan.add("Kambing");
        Hewan.add("Unta");
        Hewan.add("Domba");
        System.out.println("Hewan = " + Hewan);

        LinkedList<String> DeleteHewan = new LinkedList<>();
        DeleteHewan.add("Kelinci");
        DeleteHewan.add("Kambing");
        DeleteHewan.add("Unta");

        Hewan.removeAll(DeleteHewan);

        System.out.println("Nama Hewan: " + Hewan);
        System.out.println("Jumlah Hewan: " + Hewan.size());


    }
}
