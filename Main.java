//package pertemuan5;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//import pertemuan5;

public class Main {
    public static void main(String[] args) { 
        Main m = new Main();
        System.out.println("Fetching Samsung");
        m.generateSamsung("H:/rio/Pertemuan 5/DaftarSamsung.txt");

        System.out.println();
        System.out.println("=========================================");
        System.out.println();
        System.out.println("Fetching Xiaomi");
        m.generateXiaomi("H:/rio/Pertemuan 5/DaftarXiomi.txt");
 }

    public void generateSamsung(String path){

        File file = new File(path);
        FileInputStream fis = null; 
        BufferedInputStream bis = null;
        DataInputStream dis = null;
        List<Samsung> listHandphone = new ArrayList<Samsung>();

        try {
            fis = new FileInputStream(file); 
			bis = new BufferedInputStream(fis);
			dis = new DataInputStream(bis);
            //System.out.println("File "+file.getName()+ "ditemukan");
            while(dis.available() != 0){               
                String line = dis.readLine();
				String[] data = line.split(",");
                
                Samsung i = new Samsung();
                i.setKamera(data[0]);
                double Layar = Double.parseDouble(data[1]);
                i.setLayar(Layar);
                i.setRam(data[2]);
                i.setType_series(data[3]);

                listHandphone.add(i); 
             }

            } catch (IOException ex) {//error handling
            System.out.println("File "+file.getName()+" tidak ditemukan..!!");
            System.out.println("Error: "+ex.getMessage());
            }


        //memanggil keluaran array
        int Number = 1; 
        for(Samsung i : listHandphone){
            
            System.out.println("=======["+Number+"]=========");
            System.out.println("Kamera: "+i.getKamera());
            System.out.println("Layar: "+i.getLayar());
            System.out.println("Ram: "+i.getRam());
            System.out.println("Tipe Series: "+i.getType_series());
            Number++;       
        }
    }

    public void generateXiaomi(String path){

        File file = new File(path);
        FileInputStream fis = null; 
        BufferedInputStream bis = null;
        DataInputStream dis = null;
        List<Xiaomi> listHandphone = new ArrayList<Xiaomi>();

        try {
            fis = new FileInputStream(file); 
			bis = new BufferedInputStream(fis);
			dis = new DataInputStream(bis);
            //System.out.println("File "+file.getName()+ "ditemukan");
            while(dis.available() != 0){               
                String line = dis.readLine();
				String[] data = line.split(",");
                              
                Xiaomi a = new Xiaomi();
                a.setKamera(data[0]);
                double setLayar = Double.parseDouble(data[1]);
                a.setLayar(setLayar);
                a.setRam(data[2]);
                a.setType_series(data[3]);
                
                listHandphone.add(a); 
            }      
        }catch (IOException ex) {//error handling
            System.out.println("File "+file.getName()+" tidak ditemukan..!!");
            System.out.println("Error: "+ex.getMessage());
        }

        //memanggil keluaran array
        int Number = 1; 
        for(Xiaomi a : listHandphone){
            
            System.out.println("=======["+Number+"]=========");
            System.out.println("Kamera: "+a.getKamera());
            System.out.println("Layar: "+a.getLayar());
            System.out.println("Ram: "+a.getRam());
            System.out.println("Tipe Series: "+a.getType_series());
            Number++;       

 }
    }
}
