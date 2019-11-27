import static java.lang.System.*;

class MyPoint{
    int num;
    int num2;

    int getX(){
        out.println("ナンバーを調べました");
        return num;
    }
    int getY(){
        out.println("Yのナンバーを調べた");
        return num2;
    }

    void setXY(int x, int y){
        num = x;
        num2 = y;
        out.println("Xのナンバーは"+ num+"desu");
        out.println("Yのナンバーは"+ num2+ "です");
        return;
    }void show(){
        out.println("Xのナンバーは"+ num +"Yのナンバーは"+ num2 +" にする");
    }
}
class sample1{
    public static void main(String []args){
        MyPoint point1= new MyPoint();
        int number = point1.getX();
        int number2 = point1.getY();
        point1.setXY(3212,213);
        out.println("ナンバーは"+ number  + "Yになった");

    }
}
