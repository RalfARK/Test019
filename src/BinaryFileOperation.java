import java.io.*;
import java.util.Scanner;

public class BinaryFileOperation {

    public static void main(String[] args) {
        String patch = "D:\\Rafal\\PROGRAMOWANIE\\JAVA\\IdeaProjects\\Test018";
        String fileName;
        Scanner in = new Scanner(System.in);
        int rok;
        int miesiac;
        int dzien;

        System.out.println("Podaj nazwe pliku");
        fileName = in.nextLine();
        patch = patch.concat("\\"+fileName);

        System.out.println("Podaj rok urodzenia");
        rok = in.nextInt();
        System.out.println("Podaj miesiac urodzenia");
        miesiac = in.nextInt();
        System.out.println("Podaj dzien urodzenia");
        dzien = in.nextInt();

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(patch))) {
            dos.writeInt(rok);
            //dos.writeBytes(System.lineSeparator());
            dos.writeInt(miesiac);
           // dos.writeBytes(System.lineSeparator());
            dos.writeInt(dzien);


        }
        catch (IOException e) {
            e.printStackTrace();
        }

        try (DataInputStream dis = new DataInputStream(new FileInputStream(patch))) {
            //int rr;
            for (int i = 0; i < dis.available(); i++) {
                System.out.println(dis.readInt());
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }


    }


}
