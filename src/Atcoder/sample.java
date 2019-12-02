package Atcoder;
import com.sun.corba.se.impl.util.SUNVMCID;

import static java.lang.System.*;
import java.io.*;
public class sample {
    public static void main(String[] args)throws IOException{
        BufferedReader br=
                new BufferedReader(new InputStreamReader(in));
        String S = br.readLine();
        char res = S.charAt(0);

        int day =0;
        switch (S){
            case "SUN":
                 day =7;
                break;
            case"MON":
                day =6;
                break;
            case"TUE":
                day =5;
                break;
            case"WED":
                day =4;
                break;
            case"THU":
                day =3;
                break;
            case"FRI":
                day =2;
            case"SAT":
                day =1;
        }
        out.println(day);
    }
}
