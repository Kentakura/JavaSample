package sample;
import java.io.*;

import static java.lang.System.*;

public class Sample5 {
    public static void main(String[] args)throws IOException{
        int[] test1;
        test1 = new int[3];

        out.println("test1を宣言");
        out.println("配列要素を確保");

        test1[0] = 80;
        test1[1] = 60;
        test1[2] = 22;

        int[] test2;
        out.println("test2を宣言");

        test2 = test1;
        out.println("test2 にtest1 を代入しました");

        for(int i=0; i<3; i++){
            out.println("test1を指す"+(i+1) + "番目の人の点数は" +test2[i] +"です。");
        }
        for(int i=0; i<3; i++){
            out.println("test2 がさす"+ (i+1)+"番目の人の人数は" +test2[i]+"です。");
        }

        test1[2] = 100;
        out.println("test1がさす3番目の人の人数を変更します。");

        for(int i=0; i<3; i++){
            out.println("test1を指す"+(i+1) + "番目の人の点数は" +test1[i] +"です。");
        }
    }
}
