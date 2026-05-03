package LinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        //[null] <- [Ömer] <-> [Onur] <-> [Ali] -> [null]
        //LinkedList'in içi böyledir .
        //[Ömer] = previous(önceki) demek
        //[Onur] = next(sonraki) demek

        //LinkedList oluşturma ve ekleme
        LinkedList<String> isimler = new LinkedList<>();

        isimler.add("Ömer");
        // Listeye eleman ekler (sona)

        isimler.addFirst("Onur");
        // Listenin başına eleman ekler

        isimler.addLast("Ali");
        // Listenin sonuna eleman ekler


        //Eleman okuma
        String ilk = isimler.getFirst();
        // Listenin ilk elemanını getirir

        String son = isimler.getLast();
        // Listenin son elemanını getirir

        String eleman = isimler.get(1);
        // 1. index'teki elemanı getirir (yavaştır)


        //Eleman silme
        isimler.removeFirst();
        // Listenin başındaki elemanı siler

        isimler.removeLast();
        // Listenin sonundaki elemanı siler

        isimler.remove(1);
        // Verilen index'teki elemanı siler


        //LinkedList, Queue ve Deque interface’lerini implement eder.
        LinkedList<String> kuyruk = new LinkedList<>();

        kuyruk.offer("A");
        // Kuyruğun sonuna ekler

        kuyruk.poll();
        // Kuyruğun başından eleman alır ve siler

        //SON SÖZ (BUNU BİL)
        //
        //LinkedList = “ekle/sil hızlı, oku yavaş”
        //ArrayList = “oku hızlı, ekle/sil yer değiştirir”
    }




}
