package sample;
import java.io.*;

import static java.lang.System.*;

public class Sample4 {
    public static void main(String[] args) throws  IOException {
            out.println("いくつ*を出力しますか");
            BufferedReader br =
                    new BufferedReader(new InputStreamReader(in));

            String str = br.readLine();
            int num = Integer.parseInt(str);
        for(int i=1; i<=num; i++){
            out.print("*");
        }
    }

}
