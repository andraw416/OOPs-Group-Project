package com.syntax.coding3;

public class Car {
    double carPrice;
    String color;

    double calculateSalePrice(){
        return carPrice;
    }
}
class Sedan extends Car {
double weight, carPrice;


    public Sedan(double weight, double carPrice) {
        this.weight = weight;
        this.carPrice = carPrice;
    }

    @Override
    double calculateSalePrice() {
        if(weight>2000) {
           double   total = carPrice - (carPrice * 0.10);
            return total;
        }else{ double total= carPrice - (carPrice * 0.20);
            return total;
        }

    }
}

class Truck extends Car {
    double length, carPrice;


    public Truck(double length, double carPrice) {
        this.length = length;
        this.carPrice = carPrice;
    }

    @Override
    double calculateSalePrice() {
        if(length>20) {
            double   total = carPrice - (carPrice * 0.05);
            return total;
        }else{ double total= carPrice - (carPrice * 0.10);
            return total;
        }

    }
}
class CarTester{
    public static void main(String[] args) {

        Sedan sedan = new Sedan(2500,24000);
        System.out.println("The price of this sedan will be "+sedan.calculateSalePrice());

        Truck truck = new Truck(55,45000);
        System.out.println("The price of this truck will be "+truck.calculateSalePrice());

    }


}