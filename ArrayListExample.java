import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Criando um objeto ArrayList para armazenar números inteiros
        ArrayList<Integer> numeros = new ArrayList<>();

        // Adicionando elementos ao ArrayList
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        // Imprimindo o ArrayList
        System.out.println("ArrayList antes da remoção: " + numeros);

        // Removendo o segundo elemento do ArrayList
        numeros.remove(1);

        // Imprimindo o ArrayList novamente
        System.out.println("ArrayList depois da remoção: " + numeros);

        // Acessando um elemento específico do ArrayList
        int primeiroElemento = numeros.get(0);
        System.out.println("O primeiro elemento do ArrayList é: " + primeiroElemento);

        // Verificando se o ArrayList contém um elemento específico
        boolean contemElemento = numeros.contains(20);
        System.out.println("O ArrayList contém o elemento 20? " + contemElemento);

        // Verificando o tamanho do ArrayList
        int tamanho = numeros.size();
        System.out.println("O tamanho do ArrayList é: " + tamanho);
    }
}
