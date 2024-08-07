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
        // MEGASENA
        int maiorNumeroASerSorteado = 60;
        // QUINA
//        int maiorNumeroASerSorteado = 80;

        // QUANTIDADE DE NUMEROS PARA UM JOGO
        // MEGASENA
        int qtdeNumeros = 6;
        // QUINA
        // int qtdeNumeros = 5;


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