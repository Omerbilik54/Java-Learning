import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        // LinkedList oluşturuluyor
        LinkedList<String> tasks = new LinkedList<>();

        // Sona ekleme
        tasks.add("Kod yaz");

        // Başa ekleme (ArrayList’te pahalı, burada ucuz)
        tasks.addFirst("Bilgisayarı aç");

        // Sona ekleme
        tasks.addLast("Test et");

        // İlk elemanı alma
        System.out.println(tasks.getFirst());

        // Son elemanı silme
        tasks.removeLast();

        // Listeyi gezme
        for (String task : tasks) {
            System.out.println(task);
        }
    }
}
