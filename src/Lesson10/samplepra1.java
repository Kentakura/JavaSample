package Lesson10;
import java.io.*;
import static java.lang.System.*;
public class samplepra1 {
    public static void main(String[] args)throws IOException{
        out.println("文字列を入力（Ex；HELLO");
        BufferedReader br =
                new BufferedReader(new InputStreamReader(in));

        String str1 = br.readLine();

        out.println(new StringBuilder(str1).reverse());
    }
}
