import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<String> animalList = new ArrayList<>();
        animalList.add("Angsa");
        animalList.add("Bebek");
        animalList.add("Cicak");
        animalList.add("Domba");
        animalList.add("Elang");
        animalList.add("Gajah");

        System.out.println("Isi ArrayList hewan: \n");
        for (String namaHewan : animalList) {
            System.out.println(namaHewan);
        }

        animalList.add("Badak");
        animalList.add("Bebek");
        int countOfBebek = 0;
        int index = -1;
        for (String element : animalList) {
            if (element.equals("Bebek")) {
                countOfBebek++;
                if (index == -1) {
                    index = animalList.indexOf(element);
                }
            }
        }
        System.out.println("Jumlah elemen \"Bebek\" adalah " + countOfBebek + "\nIndex elemen \"Bebek\" adalah " + index);
        System.out.println("\ntampilkan 2. \n" + animalList);


        animalList.remove("Bebek");
        System.out.println("\ntampilkan 3.  \n" + animalList);
        System.out.println("\n");


        System.out.println("Elemen pada index ke-0 adalah " + animalList.get(0));
        System.out.println("Elemen pada index ke-2 adalah " + animalList.get(2));
        animalList.remove(0);
        System.out.println("\ntampilkan 4. \n" + animalList);

        animalList.set(0, "Ular");
        animalList.add(2, "Itik");
        System.out.println("\ntampilkan 5. \n" + animalList);

        animalList.subList(2, 5).clear();
        System.out.println("\ntampilkan 6. \n" + animalList);
        System.out.println("\n");

        System.out.println("Elemen pertama adalah " + animalList.get(0));
        System.out.println("Elemen terakhir adalah " + animalList.get(animalList.size() - 1));

        System.out.println("\nJumlah elemen pada ArrayList adalah \n" + animalList.size());

        index = animalList.indexOf("Badak");
        System.out.println("\nIndex elemen \"Badak\" adalah \n" + index);
    }
}

