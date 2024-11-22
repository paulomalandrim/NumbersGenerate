import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.println("[INFO] Iniciando Sorteio de Numeros");
        System.out.println("****************************************************************");

        List<Integer> listNumeros = new ArrayList<>();
        Random random = new Random();

        // MAIOR NUMERO A SER SORTEADO
        // QUINA -- int maiorNumeroASerSorteado = 80;
        // MEGASENA -- int maiorNumeroASerSorteado = 60;
        // LOTOFACIL -- int maiorNumeroASerSorteado = 25;
         int maiorNumeroASerSorteado = 25;

        // QUANTIDADE DE NUMEROS PARA UM JOGO
        // QUINA -- int qtdeNumeros = 5;
        // MEGASENA -- int qtdeNumero = 6;
        // LOTOFACIL -- int qtdeNumero = 15;
        int qtdeNumeros = 15;

        // QUANTIDADE DE JOGOS A SEREM REALIZADOS
        int qtdeJogos = 3;

        // TESTAR POSSIVEL LOOP
        if (qtdeNumeros > maiorNumeroASerSorteado) {
            System.out.println("[ERROR] Sorteio Finalizado com erro!");
            System.out.println("[ERROR] Não é possivel realizar sorteio: Quantidade de numeros e maior que range do sorteio");
            return;
        }

        // LOOP COM A QUANTIDADE DE JOGOS
        for (int jogos=1; jogos <= qtdeJogos; jogos++) {

            int numeros = qtdeNumeros;

            // LOOP COM A QUANTIDADE DE NUMEROS POR JOGOS
            while (numeros > 0){

                // RANDOM O NUMERO SORTEADO (NUMERO MÁXIMO A SER SORTEADO)
                int num = random.nextInt(maiorNumeroASerSorteado)+1;

                // ADICIONA SOMENTE SE O NUMERO NAO ESTIVER PRESENTE
                if (listNumeros.stream().noneMatch(n -> n == num)){
                    listNumeros.add(num);
                    numeros--;
                }

            }

            System.out.println("Jogo " + jogos + ": " + listNumeros.stream().sorted().toList());
            listNumeros.clear();
        }

        System.out.println("****************************************************************");
        System.out.println("[INFO] Sorteio Finalizado com sucesso!");



    }
}