//package Lesson10;
//import static java.lang.System.*;
//import java.io.*;
//
//class Car{
//    private int num;
//    private int gas;
//    private int name;
//
//    public Car(){
//        num = 0;
//        gas = 0.0;
//        name = "名無し";
//        out.println("車を作成しました。");
//    }
//    public void setCar(int n, double g){
//        num = n;
//        gas = g;
//        out.println("ナンバーを"+ name + " にガソリン量を"+ gas + "にしました。");
//    }
//    public void setName(String nm){
//        name = nm;
//        out.println("名前を"+ name + "にしました。");
//    }
//    public void show(){
//        out.println("車のナンバーは"+ num + "です。");
//        out.println("ガソリン量は"+ gas + "です。");
//        out.println("名前は"+ name + "です。");
//    }
//}
//public class Sample1 {
//    public static void main(String[] args)throws IOException {
//        Car car1;
//        car1 = new Car();
//
//        car1.show();
//
//        int number = 1234;
//        double gasoline = 20.5;
//        String str = "1号車";
//
//        car1.setCar(number, gasoline);
//        car1.setName(str);
//
//        car1.show();
//    }
//}
