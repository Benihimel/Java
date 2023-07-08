package Java_progect.hw_002;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;



public class task002 {
    private static File log;
    private static FileWriter fileWriter;

    public static void main(String[] args) {
        try {
            log = new File("logfile.txt");
            log.createNewFile();
            fileWriter = new FileWriter(log);
            int[] sortArr = { 29, 105, -2, -10, 1003, -100000 };
            bubbleSort(sortArr);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public static void bubbleSort(int[] sortArr){
        for (int i = 0; i < sortArr.length - 1; i++) {
            for(int j = 0; j < sortArr.length - i - 1; j++) {
                if(sortArr[j + 1] < sortArr[j]) {
                    int temp = sortArr[j];
                    sortArr[j] = sortArr[j + 1];
                    sortArr[j + 1] = temp;
                }
            }
            writeLog(Arrays.toString(sortArr));
        }
    }    

    public static void writeLog(String list) {
        
        try(FileWriter writer = new FileWriter("log.txt"))
        {
           fileWriter.write(list + "\n"); 
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
