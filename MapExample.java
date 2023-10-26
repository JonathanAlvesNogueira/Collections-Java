  
import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        // Criando um HashMap
        Map<String, Integer> map = new HashMap<>();

        // Adicionando elementos ao mapa
        map.put("um", 1);
        map.put("dois", 2);
        map.put("três", 3);

        // Imprimindo o mapa
        System.out.println("Mapa: " + map);

        // Acessando um valor no mapa
        int valor = map.get("dois");
        System.out.println("Valor associado à chave 'dois': " + valor);

        // Verificando se uma chave existe no mapa
        boolean contemChave = map.containsKey("quatro");
        System.out.println("O mapa contém a chave 'quatro'? " + contemChave);

        // Verificando se um valor existe no mapa
        boolean contemValor = map.containsValue(3);
        System.out.println("O mapa contém o valor '3'? " + contemValor);

        // Removendo um elemento do mapa
        int valorRemovido = map.remove("dois");
        System.out.println("Valor removido: " + valorRemovido);
        System.out.println("Mapa após remoção: " + map);

        // Iterando sobre as chaves do mapa
        System.out.println("Chaves do mapa:");
        for (String chave : map.keySet()) {
            System.out.println(chave);
        }

        // Iterando sobre os valores do mapa
        System.out.println("Valores do mapa:");
        for (int valorMapa : map.values()) {
            System.out.println(valorMapa);
        }

        // Iterando sobre as entradas do mapa
        System.out.println("Entradas do mapa:");
        for (Map.Entry<String, Integer> entrada : map.entrySet()) {
            System.out.println(entrada.getKey() + " = " + entrada.getValue());
        }

        // Limpando o mapa
        map.clear();
        System.out.println("Mapa após limpeza: " + map);
    }
}





