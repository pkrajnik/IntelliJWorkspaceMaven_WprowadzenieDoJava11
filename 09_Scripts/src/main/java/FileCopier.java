import java.io.IOException;
public class FileCopier {
    public static void main(String args[]) throws IOException {
        Runtime run = Runtime.getRuntime();
        System.out.println("Executing the external program . . . . . . . .");
        for (int i=1;i<=2;i++){
            String file = "cmd /C copy "+i+".txt .\\a\\"+i+".txt";
            run.exec(file);
        }    }
}