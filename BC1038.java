
/*
Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item.
A seguir, calcule e mostre o valor da conta a pagar.
|--------|-----------------|---------|
| Código |  Especificação  |  Preço  |
|   1    | Cachorro Quente | R$ 4.00 |
|   2    |    X-Salada     | R$ 4.50 |
|   3    |     X-Bacon     | R$ 5.00 |
|   4    | Torrada Simples | R$ 2.00 |
|   5    |  Refrigerante   | R$ 1.50 |
|--------|-----------------|---------|
Entrada
O arquivo de entrada contém dois valores inteiros correspondentes ao código e à quantidade de um item conforme tabela acima.

Saída
O arquivo de saída deve conter a mensagem "Total: R$ " seguido pelo valor a ser pago, com 2 casas após o ponto decimal.
|---------------------|------------------|
| Exemplo de Entrada	| Exemplo de Saída |
|       3 2           | Total: R$ 10.00  |
|       4 3           | Total: R$ 6.00   |
|       2 3           | Total: R$ 13.50  |
|---------------------|------------------|
*/
import java.util.Scanner;

public class BC1038 {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    int codigo, quantidade;
    double total = 0;

    codigo = input.nextInt();
    quantidade = input.nextInt();

    switch (codigo) {
      case 1:
        total = quantidade * 4.00;
        break;
      case 2:
        total = quantidade * 4.50;
        break;
      case 3:
        total = quantidade * 5.00;
        break;
      case 4:
        total = quantidade * 2.00;
        break;
      case 5:
        total = quantidade * 1.50;
        break;
      default:
        break;
    }

    System.out.printf("Total: R$ %.2f\n", total);
    input.close();
  }
}
