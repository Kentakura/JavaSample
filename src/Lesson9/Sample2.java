//import static java.lang.System.*;
//
//class Car {
//    public static int sum = 0;
//    private int num;
//    private double gas;
//
//    public Car() {
//        num = 0;
//        gas = 0.0;
//        sum++;
//        out.println("車を作成");
//    }
//
//    public void setCar(int n, double g) {
//        num = n;
//        gas = g;
//        out.println("ナンバーを" + num + "にガソリン量を" + gas + "にしました。");
//    }
//
//    public static void showSum() {
//        out.println("車は全部で" + sum + "台あります。");
//    }
//
//    public void show() {
//        out.println("車のナンバーは" + num + "です");
//        out.println("ガソリン量は" + gas + "です");
//    }
//}
//
//public class Sample2 {
//    public static void main(String[] args){
//        Car.showSum();
//
//        Car car1 = new Car();
//        car1.setCar(1234,20.5);
//        Car.showSum();
//
//        Car car2 = new Car();
//        car2.setCar(4567, 30.5);
//        Car.showSum();
//
//    }
//}
