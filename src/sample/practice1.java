package sample;

import static java.lang.System.*;
class Car{
    int num;
    double gas;

    void show(){
        out.println("車のナンバーは" + num + "です。");
        out.println("ガソリン量は" + gas +" です。");
    }void showCar(){
        out.println("これから車の情報を表示する");
        show();
    }
}

class practice1{
    public static void main(String args[]){
        Car car1;
        car1 = new Car();

        car1.num = 1234;
        car1.gas = 20.5;
        car1.showCar();
    }
}
