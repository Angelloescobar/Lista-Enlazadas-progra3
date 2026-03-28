package umg.edu.gt.listasenlazadas.retos;

import umg.edu.gt.listasenlazadas.simple.SinglyLinkedList;

public class LinkedListChallenges {

    public static void run() {
        System.out.println("=== RETOS DE IMPLEMENTACION ===");
        challenge1CountOccurrences();
        challenge2Clear();
        challenge3Reverse();
        challenge4RemoveDuplicates();
        System.out.println();
    }

    private static void challenge1CountOccurrences() {
        System.out.println("Reto 1 - Analitica de eventos (lista simple)");
        SinglyLinkedList<String> events = new SinglyLinkedList<>();
        events.addLast("LOGIN");
        events.addLast("CLICK");
        events.addLast("LOGIN");
        events.addLast("SCROLL");
        events.addLast("LOGIN");

        int occurrences = events.countOccurrences("LOGIN");

        System.out.println("Eventos: " + events);
        System.out.println("Resultado esperado para LOGIN: 3");
        System.out.println("Resultado obtenido: " + occurrences);
        System.out.println();
    }

    private static void challenge2Clear() {
        System.out.println("Reto 2 - Limpiar lista");
        SinglyLinkedList<Integer> lista = new SinglyLinkedList<>();
        lista.addLast(10);
        lista.addLast(20);
        lista.addLast(30);

        System.out.println("Antes: " + lista);
        lista.clear();
        System.out.println("Despues: " + lista);
        System.out.println("Esta vacia?: " + lista.isEmpty());
        System.out.println();
    }

    private static void challenge3Reverse() {
        System.out.println("Reto 3 - Invertir lista");
        SinglyLinkedList<Integer> lista = new SinglyLinkedList<>();
        lista.addLast(2);
        lista.addLast(4);
        lista.addLast(5);
        lista.addLast(6);

        System.out.println("Antes: " + lista);
        lista.reverse();
        System.out.println("Despues: " + lista);
        System.out.println();
    }

    private static void challenge4RemoveDuplicates() {
        System.out.println("Reto 4 - Eliminar duplicados");
        SinglyLinkedList<Integer> lista = new SinglyLinkedList<>();
        lista.addLast(1);
        lista.addLast(2);
        lista.addLast(2);
        lista.addLast(3);
        lista.addLast(1);
        lista.addLast(4);

        System.out.println("Antes: " + lista);
        lista.removeDuplicates();
        System.out.println("Despues: " + lista);
        System.out.println();
    }
}