package eleven;

import java.io.*;

public class SequenceDemo {
    public static void main(String[] args)throws IOException{
        FileInputStream in1 = null, in2=null;
        SequenceInputStream s = null;
        FileOutputStream out = null;
        try{
            // 构造两个被读入的文件
            File inputFile1 = new File("D:" + File.separator + "1.txt");
            File inputFile2 = new File("D:" + File.separator + "2.txt");
            // 构造一个输出文件
            File outputFile = new File("D:" + File.separator + "12.txt");

            in1 = new FileInputStream(inputFile1);
            in2 = new FileInputStream(inputFile2);

            // 将两个输入流合并为一个输入流
            s = new SequenceInputStream(in1, in2);
            out = new FileOutputStream(outputFile);

            int c;
            while ((c = s.read())!=-1){
                out.write(c);
            }
            in1.close();
            in2.close();
            s.close();
            out.close();
            System.out.println("ok....");

        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(in1!=null){
                try{
                    in1.close();
                }catch (IOException e){}
            }if(in2!=null){
                try{
                    in2.close();
                }catch (IOException e){}
            }if(s!=null){
                try{
                    s.close();
                }catch (IOException e){}
            }if(out!=null){
                try{
                    out.close();
                }catch (IOException e){}
            }
        }
    }
}
