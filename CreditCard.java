package com.company;

import java.util.Random;

public class CreditCard {
    private int idNumber;
    private double summ;
    public CreditCard()
    {
        Random random = new Random();
        this.summ = 0.0;
        this.idNumber = random.nextInt();
    }
    public double putMoney(double amount)
    {
        this.summ+=amount;
        return this.summ;
    }
    public double eraseMoney(double amount)
    {
        if(this.summ>=amount)
        this.summ-=amount;
        else System.out.println("Столько денег нет на счету\n");
        return this.summ;
    }
    public void display()
    {
        System.out.println("Сумма на счету: "+this.summ+"\nНомер карточки: "+this.idNumber);
    }
}
