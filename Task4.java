package com.company;

import java.io.*;

class DataManagement{
    String ShanjedAli56275 ;
    void ReadDataAli56275() throws IOException {
        BufferedReader tv = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" Please Input Your Full Name");
        ShanjedAli56275=tv.readLine();
    }
    void WriteDataToAli56275File(){
        try(FileWriter ts = new FileWriter("task4.txt")) {
            ts.write(ShanjedAli56275);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    void readDataViaAli56275File(){
        String result;
        try(BufferedReader br = new BufferedReader(new FileReader("task4.txt"))) {
            while((result=br.readLine()) !=null){
                System.out.println(result);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}





public class Task4 {
    public static void main(String []args) throws IOException {
        DataManagement obj = new DataManagement();
        obj.readDataViaAli56275File();
        obj.WriteDataToAli56275File();
        System.out.println();
        obj.ReadDataAli56275();
    }

}
