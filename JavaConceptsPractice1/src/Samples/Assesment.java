package Samples;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Assesment {

public static void main(String[] args) throws IOException {
//FileReader fr=null;
BufferedReader br=null;
try {
FileReader fr1 = new FileReader("D:\\demo\\fileReader.txt");
br = new BufferedReader(fr1);
  //String contentline = br.readLine();
int a=Integer.parseInt(br.readLine());
String contentline1 = Integer.toString(a);
    while (contentline1 != null) {
    System.out.println(contentline1);
    contentline1= br.readLine();
    }
}catch (FileNotFoundException e) {
e.printStackTrace();
}finally {
try {
br.close();
} catch (IOException e) {
e.printStackTrace();
    }
   }

}

}

