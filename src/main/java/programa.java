import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class programa {

    public static void  main(String[] args) throws IOException {

        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Quanto tempo em minutos?");
        //int tempo = scanner.nextInt();
        var tempo = 6000;

        Process negaDesligar = Runtime.getRuntime().exec("shutdown -a");
        Process ativaDesligar = Runtime.getRuntime().exec(String.format("shutdown -s -t %d", tempo));
        printResults(ativaDesligar);
    }

    public static void printResults(Process process) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String line = "";
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    }
}
