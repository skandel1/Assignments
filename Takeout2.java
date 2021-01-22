package Remhomework;

import java.util.Scanner;

public class Takeout2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of people");
        int numberoftrays;
        int people = input.nextInt();
        if(people<10){
            System.out.println("number of people are invalid");
        }
        else{
            Takeout a = new Takeout();
            a.displayMainmenu();
            Scanner input1 = new Scanner(System.in);
            String food = input1.nextLine();
            if(food.equals("Italian")){
                Takeout Italian = new Takeout();
                Italian.displayItalianFoodMenu();
                int item = input.nextInt();
                if(item == 1){
                    Takeout tray = new Takeout();
                    tray.DetermineTrays(people,5);
                    double price = 17.99;
                    if(people%5==0){
                        numberoftrays = (people/5) ;
                    }
                    else {
                        numberoftrays = (people/5)+1;}

                    Takeout sum = new Takeout();
                    sum.getSubTotal(price,numberoftrays);
                    Takeout tax = new Takeout();
                    double total = price*numberoftrays;
                    tax.getTax(total,0.07);
                    Takeout.getTip(total,0.15);
                    Takeout.getGrandTotal(total,0.07*total,0.15*total);
                    Takeout.pricePerPerson(Takeout.getGrandTotal(total,0.07*total,0.15*total),people);
                    Takeout.determineLeftOver(5,numberoftrays,people);
                }
                else if(item == 2){
                    Takeout tray2 = new Takeout();
                    tray2.DetermineTrays(people,7);
                    double price = 15.99;
                    if(people%7==0){
                        numberoftrays = (people/7) ;
                    }
                    else {
                        numberoftrays = (people/7)+1;}
                    Takeout sum = new Takeout();
                    sum.getSubTotal(price,numberoftrays);
                    Takeout tax = new Takeout();
                    double total = price*numberoftrays;
                    tax.getTax(total,0.07);
                    Takeout.getTip(total,0.15);
                    Takeout.getGrandTotal(total,0.07*total,0.15*total);
                    Takeout.pricePerPerson(Takeout.getGrandTotal(total,0.07*total,0.15*total),people);
                    Takeout.determineLeftOver(7,numberoftrays,people);
                }
                else if(item == 3){
                    Takeout tray3 = new Takeout();
                    tray3.DetermineTrays(people,4);
                    double price = 12.99;
                    if(people%4==0){
                        numberoftrays = (people/4) ;
                    }
                    else {
                        numberoftrays = (people/4)+1;}

                    Takeout sum = new Takeout();
                    sum.getSubTotal(price,numberoftrays);
                    Takeout tax = new Takeout();
                    double total = price* numberoftrays;
                    tax.getTax(total,0.07);
                    Takeout.getTip(total,0.15);
                    Takeout.getGrandTotal(total,0.07*total,0.15*total);
                    Takeout.pricePerPerson(Takeout.getGrandTotal(total,0.07*total,0.15*total),people);
                    Takeout.determineLeftOver(4,numberoftrays,people);
                }else System.out.println("please enter correct item number");

            }
            else if (food.equals("Chinese")){
                Takeout Chinese = new Takeout();
                Chinese.displayChineseFoodMenu();
                int item = input.nextInt();
                if(item == 1){
                    Takeout tray = new Takeout();
                    tray.DetermineTrays(people,7);
                    double price = 18.99;
                    if(people%7==0){
                        numberoftrays = (people/7) ;
                    }
                    else {
                        numberoftrays = (people/7)+1;
                    }

                    Takeout sum = new Takeout();
                    sum.getSubTotal(price,numberoftrays);
                    Takeout tax = new Takeout();
                    double total = price* numberoftrays;
                    tax.getTax(total,0.07);
                    Takeout.getTip(total,0.15);
                    Takeout.getGrandTotal(total,0.07*total,0.15*total);
                    Takeout.pricePerPerson(Takeout.getGrandTotal(total,0.07*total,0.15*total),people);
                    Takeout.determineLeftOver(7,numberoftrays,people);

                }
                else if(item == 2){
                    Takeout tray2 = new Takeout();
                    tray2.DetermineTrays(people,7);
                    double price = 18.99;
                    if(people%7==0){
                        numberoftrays = (people/7) ;
                    }
                    else {
                        numberoftrays = (people/7)+1; }
                    Takeout sum = new Takeout();
                    sum.getSubTotal(price,numberoftrays);
                    Takeout tax = new Takeout();
                    double total = price*numberoftrays;
                    tax.getTax(total,0.07);
                    Takeout.getTip(total,0.15);
                    Takeout.getGrandTotal(total,0.07*total,0.15*total);
                    Takeout.pricePerPerson(Takeout.getGrandTotal(total,0.07*total,0.15*total),people);
                    Takeout.determineLeftOver(7,numberoftrays,people);
                }
                else if(item == 3){
                    Takeout tray3 = new Takeout();
                    tray3.DetermineTrays(people,5);
                    double price = 10.99;
                    if(people%5==0){
                        numberoftrays = (people/5) ;
                    }
                    else {
                        numberoftrays = (people/5)+1;}
                    Takeout sum = new Takeout();
                    sum.getSubTotal(price,numberoftrays);
                    Takeout tax = new Takeout();
                    double total = price*numberoftrays;
                    tax.getTax(total,0.07);
                    Takeout.getTip(total,0.15);
                    Takeout.getGrandTotal(total,0.07*total,0.15*total);
                    Takeout.pricePerPerson(Takeout.getGrandTotal(total,0.07*total,0.15*total),people);
                    Takeout.determineLeftOver(5,numberoftrays,people);
                }else System.out.println("please enter correct item number");
            }
            else if(food.equals("American")){
                Takeout American = new Takeout();
                American.displayAmericanFoodMenu();
                int item = input.nextInt();
                if(item == 1){
                    Takeout tray = new Takeout();
                    tray.DetermineTrays(people,8);
                    double price = 21.99;
                    if(people%8==0){
                        numberoftrays = (people/8) ;
                    }
                    else {
                        numberoftrays = (people/8)+1;}
                    Takeout sum = new Takeout();
                    sum.getSubTotal(price,numberoftrays);
                    Takeout tax = new Takeout();
                    double total = price*numberoftrays;
                    tax.getTax(total,0.07);
                    Takeout.getTip(total,0.15);
                    Takeout.getGrandTotal(total,0.07*total,0.15*total);
                    Takeout.pricePerPerson(Takeout.getGrandTotal(total,0.07*total,0.15*total),people);
                    Takeout.determineLeftOver(8,numberoftrays,people);

                }
                else if(item == 2){
                    Takeout tray2 = new Takeout();
                    tray2.DetermineTrays(people,5);
                    double price = 22.99;
                    if(people%5==0){
                        numberoftrays = (people/5) ;
                    }
                    else {
                        numberoftrays = (people/5)+1;}
                    Takeout sum = new Takeout();
                    sum.getSubTotal(price,numberoftrays);
                    Takeout tax = new Takeout();
                    double total = price*numberoftrays;
                    tax.getTax(total,0.07);
                    Takeout.getTip(total,0.15);
                    Takeout.getGrandTotal(total,0.07*total,0.15*total);
                    Takeout.pricePerPerson(Takeout.getGrandTotal(total,0.07*total,0.15*total),people);
                    Takeout.determineLeftOver(5,numberoftrays,people);
                }
                else if(item == 3){
                    Takeout tray3 = new Takeout();
                    tray3.DetermineTrays(people,10);
                    double price = 26.99;
                    if(people%10==0){
                        numberoftrays = (people/10) ;
                    }
                    else {
                        numberoftrays = (people/10)+1;}
                    Takeout sum = new Takeout();
                    sum.getSubTotal(price,numberoftrays);
                    Takeout tax = new Takeout();
                    double total = price*numberoftrays;
                    tax.getTax(total,0.07);
                    Takeout.getTip(total,0.15);
                    Takeout.getGrandTotal(total,0.07*total,0.15*total);
                    Takeout.pricePerPerson(Takeout.getGrandTotal(total,0.07*total,0.15*total),people);
                    Takeout.determineLeftOver(10,numberoftrays,people);
                }else System.out.println("please enter correct item number");
            }
            else System.out.println("Please enter correct item");
        }


    }
}
