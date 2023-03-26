package aplication;
import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;
import entities.QuartosPensionato; // importando entities

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // criando metodo que converte unidades
        Scanner sc = new Scanner(System.in); // entrada de dados

        QuartosPensionato[] vect = new QuartosPensionato[10]; // criando obj da classe entities

        System.out.println("quanto quartos serao alugados?");
        int n = sc.nextInt(); // numero de quartos a serem alugados

        for ( int i=1; i<=n; i++) { // n = numeros de quartos a serem alugados
            System.out.println();
            System.out.println("quarto #"+ i + ":");
            System.out.println("name: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.println("email: ");
            String email = sc.nextLine();
            System.out.println(" quarto: ");
            int quarto = sc.nextInt();
            vect[quarto] = new QuartosPensionato(nome, email);// numero do quarto escolhido é o elemento do array |chamada do construtor
        }
        System.out.println();
        System.out.println("quartos ocupados: ");
        for ( int i=0; i<10; i++){
            if(vect[i] !=null){
                System.out.println(i + ":"+ vect[i]);
            }
        }
        sc.close();
    }

}
