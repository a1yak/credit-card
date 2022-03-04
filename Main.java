package com.company;


import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        CreditCard card1 = new CreditCard();
        CreditCard card2 = new CreditCard();
        CreditCard card3 = new CreditCard();
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите действие, которое нужно выполнить  1)Положить деньги на карту   2)Снять деньги с карты   3)Посмотреть информацию о картах");
        int choise = sc.nextInt();
        int temp;
        double tempAmount;
        do
        {

            switch (choise) {
                case 1:
                    System.out.println("Выберите карту на которую надо положить деньги");
                    temp = sc.nextInt();
                    System.out.println("Введите сумму, которую желаете положить на карту");
                    tempAmount=sc.nextDouble();
                    switch (temp)
                    {
                        case 1:
                            card1.putMoney(tempAmount);
                            break;
                        case 2:
                            card2.putMoney(tempAmount);
                            break;
                        case 3:
                            card3.putMoney(tempAmount);
                            break;
                        default:System.out.println("Неверный ввод, всего есть 3 карты");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Выберите карту с которой надо снять деньги");
                 temp = sc.nextInt();
                    System.out.println("Введите сумму, которую желаете снять с карты");
                    tempAmount=sc.nextDouble();
                 switch (temp)
                 {
                     case 1:
                         card1.eraseMoney(tempAmount);
                         break;
                         case 2:
                             card2.eraseMoney(tempAmount);
                     break;
                     case 3:
                         card3.eraseMoney(tempAmount);
                         break;
                     default:System.out.println("Неверный ввод, всего есть 3 карты");
                         break;
                 }
                    break;
                case 3:
                    card1.display();
                    card2.display();
                    card3.display();
                    break;
                default: System.out.println("Неверный ввод, введите число 1-3");
                break;

            }
            System.out.println("Выберите действие, которое нужно выполнить  1)Положить деньги на карту   2)Снять деньги c карты   3)Посмотреть информацию о картах");
            choise = sc.nextInt();
        }while(choise>0||choise<4);

    }
}