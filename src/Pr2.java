import java.io.*;

public class Pr2 {
    public static void readAllByByte(InputStream in) throws IOException {
        while (true) {
            int oneByte = in.read();
            if (oneByte != -1) {
                File f2 = new File("C:\\MyFile2.txt");
                f2.createNewFile();
                System.out.println((char) oneByte);
            } else {
                System.out.println("end");
                break;
            }
        }
    }

    public static void main(String[] args) {
        try {
            InputStream inFile = new FileInputStream("C:/ppk/MyFile2.txt");
            readAllByByte(inFile);
            System.out.println("\n\n");
            inFile.close();

            /*InputStream inUrl = new URL("http://google.com").openStream();
            readAllByByte(inUrl);
            System.out.println("\n\n");
            inUrl.close();*/

            InputStream inArray = new ByteArrayInputStream(new byte[] {7, 9, 3, 7, 4});
            readAllByByte(inArray);
            System.out.println("\n\n");
            inArray.close();


        } catch (IOException e){
            System.out.println("Ошибка - " + e);
        }
    }
}
