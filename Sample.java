import java.io.*;

class Sample{

  public static void main(String[] args) throws IOException{
    System.out.println("sei su wo nyu ryoku");

    BufferedReader br =
      new BufferedReader(new InputStreamReader (System.in));

      String str1 = br.readLine();
      String str2 = br.readLine();

      int num1 = Integer.parseInt(str1);
      int num2 = Integer.parseInt(str2);

      System.out.println("tasi zan ha"+ (num1+num2)+"desu");
  }
}
