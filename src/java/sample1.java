package java;
import static java.lang.System.*;
 class Car{
     protected int num;
     protected double gas;

     public Car(){
         num = 0;
         gas = 0.0;
         out.println("車を作成しました。");
     }
     public void setCar(int n, double g){
         num = n;
         gas = g;
         out.println("ナンバーを"+num + "にガソリン量を" + gas + "にしました。");
     }
    public void show(){
        out.println("車のナンバーは"+ num + "です。");
        out.println("ガソリン量は"+ gas + "です。");
    }
 }
 //update car
class RacingCar extends Car{
     private int course;

     public RacingCar(){
         course = 0;
         out.println("レーシングカーを作成しました");
     }
     public  void setCourse(int c){
         course = c;
         out.println("コース番号を"+ course + "にしました。");
     }
     public void show(){
         out.println("レーシングカーのナンバーは"+ num + "です。");
         out.println("ガソリン量は"+ gas);
         out.println("コース番号は"+ course);
     }
 }
 public class sample1{
     public static void main(String[] args){
         RacingCar rccar1 = new RacingCar();

         rccar1.setCar(1234,20.5);
         rccar1.setCourse(5);

         rccar1.show();
     }
 }
