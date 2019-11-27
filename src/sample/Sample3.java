import java.io.*;

class Sample3{

    public static void main(String[] args) throws IOException{
        System.out.println("sei su wo nyu ryoku");

        BufferedReader br =
                new BufferedReader(new InputStreamReader (System.in));

        String str1 = br.readLine();
        String str2 = br.readLine();
        String str3 = br.readLine();
        String str4 = br.readLine();
        String str5 = br.readLine();

    int sum =0;
        sum+= Integer.parseInt(str1);
        sum+= Integer.parseInt(str2);
        sum+= Integer.parseInt(str3);
        sum+= Integer.parseInt(str4);
        sum+= Integer.parseInt(str5);


        System.out.println("tasi zan ha"+ (sum)+"desu");
        System.out.println("hei kin ten ha"+(sum/(double)5)+"desu");
    }
}
