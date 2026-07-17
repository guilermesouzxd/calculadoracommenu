import java.util.Scanner;

public class App {
public static void main(String[] args) {
    int input;
    Scanner scaner = new Scanner(System.in);
    do {
    System.out.println("================ escolhe uma operação aí ====================");
    System.out.println("\n 1. SOMA\n 2. SUBTRAÇÃO\n 3. MULTIPLICAÇÃO\n 4. DIVISÃO\n 5. POTENCIAÇÃO\n 6. RADICIAÇÃO\n 7. SAIR");
    input = scaner.nextInt();
    if (input == 1){
        int qtd; 
        double inut;
        double soma = 0;
        System.out.println("quantos numeros tu quer adicionar?");
        qtd = scaner.nextInt();
        for(int i = 0; i < qtd; i++){
            inut = scaner.nextInt();
            soma += inut;
        }
        System.out.println("Soma final: " + soma);
    }
    if (input == 2){
        int qtd; 
        double inut;
        System.out.println("quantos numeros tu quer subtrair?");
        qtd = scaner.nextInt();
        inut = scaner.nextDouble();
        double soma = inut;
        for(int i = 0; i < qtd - 1; i++){
            inut = scaner.nextInt();
            soma -= inut;
        }
        System.out.println("Resultado final: " + soma);
    }
    if (input == 3){
        System.out.println("digita os numeros q tu quer multiplicar aí");
        double input1 = scaner.nextDouble();
        double input2 = scaner.nextDouble();
        System.out.println("Produto: " + produto(input2, input1));
    }
    if (input == 4){
      System.out.println("digita os numeros q tu quer dividir aí");
        double input1 = scaner.nextDouble();
        double input2 = scaner.nextDouble();
        System.out.println("Divisão:  " + divisão(input1, input2));
    }
    if (input == 5){
System.out.println("digita os numeros q tu quer potenciar aí");
        double input1 = scaner.nextDouble();
        double input2 = scaner.nextDouble();
        System.out.println("resultado:  " + potenciacão(input1, input2));
    }
    if (input == 6){
System.out.println("digita os numeros q tu quer radiciar aí");
        double input1 = scaner.nextDouble();
        double input2 = scaner.nextDouble();
        System.out.println("resultado:  " + radiciação(input1, input2));
    }
    } while(input != 7);
}
public static double produto(double a, double b){
    return a * b;
}
public static double divisão(double a, double b){
    return a / b;
}
public static double potenciacão(double a, double b){
    return Math.pow(a, b);
}
public static double radiciação(double a, double b){
    return Math.pow(a, Math.pow(b, -1));
}
}
