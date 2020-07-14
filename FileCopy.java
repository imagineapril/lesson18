package ru.timokhina.lesson18;

import java.io.*;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Arrays;

public class FileCopy {
    public static void main(String[] args) {


        try(InputStreamReader isr = new InputStreamReader(new FileInputStream("FileToEncode.txt"), "UTF-8");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("EncodedFile"), "ASCII"))    {
            int v;
            while((v = isr.read()) != -1)   {
                osw.write(v);
            }
        } catch (Exception ex)  {
            ex.printStackTrace();
        }
//        try(Writer fw = new FileWriter("FileToEncode.txt")) {
//        fw.write("Раскодируй меня в ASCII");
//        } catch (IOException ex)    {
//        }

//        try(InputStreamReader isr = new InputStreamReader(new FileInputStream("FileToEncode.txt"), "UTF-8"))    {
//            int v = 0;
//            char buf[] = new char[100];
//            int sz = 0;
//            while ((sz=isr.read(buf)) != -1)    {
//                System.out.println(Arrays.copyOf(buf, sz));
//            }
//            catch (Exception exc)   {
//                exc.printStackTrace();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        try(OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("FileToEncode2.txt"), "ASCII"))    {
//            osw.write("What's up?");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }
}

