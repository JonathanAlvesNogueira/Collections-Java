import java.util.ArrayDeque;

public class ExemploArrayDeque {
    public static void main(String[] args) {
        
        // Criando um ArrayDeque vazio
        ArrayDeque<String> deque = new ArrayDeque<>();

        // Adicionando elementos ao deque
        deque.add("elemento 1");
        deque.addFirst("elemento 2");
        deque.addLast("elemento 3");

        // Imprimindo o deque
        System.out.println("Deque: " + deque);

        // Acessando o primeiro e o último elemento do deque
        String primeiro = deque.getFirst();
        String ultimo = deque.getLast();
        System.out.println("Primeiro elemento: " + primeiro);
        System.out.println("Último elemento: " + ultimo);

        // Removendo o primeiro e o último elemento do deque
        deque.removeFirst();
        deque.removeLast();

        // Imprimindo o deque novamente
        System.out.println("Deque após remoção: " + deque);
    }
}
