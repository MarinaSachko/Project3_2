// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int account; int Sum_add; int prezent; int quantity_for_prezent, Sum_bonus;
            account = 1500;                                           //первоначальный счет
            prezent = 1;                                              //количество бонусных рублей
            quantity_for_prezent = 100;                               //за какое количетво рублей дается prezent бонусов
            Sum_add = 500;                                            //сумма пополнения

            Sum_bonus = (Sum_add>1000) ? Sum_add / 100 * prezent : 0; //сумма бонусных рублей

            account = account + Sum_add + Sum_bonus;

            System.out.println("Итоговый счет " + account + " в том числе бонусных рублей " + Sum_bonus);
    }
}