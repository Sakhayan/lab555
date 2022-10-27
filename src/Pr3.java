import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class Pr3 {
    public static void readAllByByte(InputStream in) throws IOException{
        byte[] buff = new byte [5];
        while(true) {
            int count = in.read(buff);
            if (count != -1){
                System.out.println("Количество = " + count +
                        ", buff = " + Arrays.toString(buff) + ", str = " +
                        new String(buff, 0, count, "cp1251"));//UTF8
            } else {
                break;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        String fileName = "C:\\ppk\\MyFile2.txt";
        InputStream inFile = null;
        try{
            inFile = new FileInputStream(fileName);
            readAllByByte(inFile);
        } catch (IOException e) {
            System.out.println("Ошибка открытия-закрытия файла" + fileName + e);
        } finally{
            if (inFile != null){
                try{
                    inFile.close();
                } catch (IOException ignore){
                    /*NOP*/
                }
            }
        }
    }

}
