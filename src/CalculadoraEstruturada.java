import java.util.Scanner;
/**
 * Este é um programa de calculadora estruturada em Java.
 * Ele realiza várias operações matemáticas como soma, subtração, multiplicação, divisão e potência.
 * Além disso, ele também pode retornar o valor de constantes matemáticas como Pi, e Phi.
 *  @see <a href="https://docs.oracle.com/javase/8/docs/technotes/tools/windows/javadoc.html">Documentação do JavaDoc</a>
 * @author  Autor do código  desconhecido,ATIVIDADE 3 - ESOFT - PROGRAMAÇÃO DE SISTEMAS I - 54/2023
 * @author Autor da geração da documentação,Romário Silva Nunes
 * @version 1.0
 */
public class CalculadoraEstruturada {
  /**
   * O método principal do programa.
   * Ele lê a operação desejada do usuário e realiza a operação.
   * @param args Argumentos da linha de comando.
   */
       public static void main(String[] args) {

             try (Scanner sc = new Scanner(System.in)) {
              double operandoA, operandoB, resultado;

                    operandoA = operandoB = resultado = 0;

                    char operacao;

                    System.out.println("Escolha a operação: ");

                    System.out.println("Soma______________: + ");

                    System.out.println("Subtração_________: - ");

                    System.out.println("Multiplicação_____: * ");

                    System.out.println("Divisão___________: / ");

                    System.out.println("Potência__________: ^ ");

                    System.out.println("Valor de Pi_______: p ");

                    System.out.println("Valor de PHI______: f ");

                    System.out.println("Valor de e________: e ");

                    System.out.println("----------------------");

                    System.out.println("Sair______________: s \n");

                    System.out.println();

                    operacao = sc.next().charAt(0);

                    if (operacao == 's') {

                    } else if (operacao == 'p') {

                           resultado = getPi();

                           System.out.printf("pi= %.2f ", resultado);

                    } else if (operacao == 'f') {

                           resultado = getFi();

                           System.out.printf("phi= %.2f ", resultado);

                    } else if (operacao == 'e') {

                           resultado = getE();

                           System.out.printf("e= %.2f ", resultado);

                    } else if (operacao == '+' || operacao == '-'

                                  || operacao == '*' || operacao == '/' || operacao == '^') {

                           System.out.println("Operando A: ");

                           operandoA = sc.nextDouble();

                           System.out.println("Operando B: ");

                           operandoB = sc.nextDouble();

                           resultado = operacaoesBasicas(operandoA, operacao, operandoB);

                           System.out.printf("%.2f %c %.2f = %.2f", operandoA, operacao,

                                         operandoB, resultado);

                    }
       }

       }
       
      /**
       * Realiza uma das operações básicas (soma, subtração, multiplicação, divisão, potência) nos operandos fornecidos.
       * @param x O primeiro operando.
       * @param operador A operação a ser realizada.
       * @param y O segundo operando.
       * @return O resultado da operação.
       */
       public static double operacaoesBasicas(double x, char operador, double y) {

             double resultado = 0.0;

             switch (operador) {

             case '+':

                    resultado = x + y;

                    break;

             case '-':

                    resultado = x - y;

                    break;

             case '*':

                    resultado = x * y;

                    break;

             case '/':

                    resultado = x / y;

                    break;

             case '^':

                    resultado = Math.pow(x, y);

             }

             return resultado;

       }
 
       /**
        * Retorna o valor da constante matemática Pi.
        * @return O valor de Pi.
        */
       public static double getPi() {

             return Math.PI;

       }
       /**
        * Retorna o valor da constante matemática e.
        * @return O valor de e.
        */
       public static double getE() {

             return Math.E;

       }
       /**
        * Retorna o valor da constante matemática Phi.
        * @return O valor de Phi.
        */
       public static double getFi() {

             return 1.61803398874989484820;

       }

}