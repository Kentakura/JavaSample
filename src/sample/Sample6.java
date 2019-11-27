package sample;
import java.io.*;

import static java.lang.System.*;

public class Sample6 {
    public static void main(String arg[])throws IOException{
        out.println("テストの受験者数を入力");

        BufferedReader br=
                new BufferedReader(new InputStreamReader(in));

        String str = br.readLine();
        int num = Integer.parseInt(str);

        int[] test = new int[num];

        out.println("必要な人数の手数を入力");

        for(int i=0; i<num; i++) {
            str = br.readLine();
            int tmp = Integer.parseInt(str);
            test[i] = tmp;
        }
        for(int i=0; i<num; i++){
            out.println((i +1) + "番目の人数は" + test[i] + "です。");
        }
    }

}
