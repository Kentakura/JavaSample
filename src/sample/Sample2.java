package sample;
import java.io.*;

import static java.lang.System.*;

public class Sample2{
    public static void main(String[] args) throws IOException {
        out.println("整数を入力");

        BufferedReader br =
                new BufferedReader(new InputStreamReader(in));
        String str =br.readLine();
        int res =Integer.parseInt(str);

        switch(res){
            case 1:
                out.println("１が入力された");
                break;
            case 2:
                out.println("2が入力されta");
                break;
            default:
                out.println("１か２を入力しろ");
                break;
        }
    }
}
