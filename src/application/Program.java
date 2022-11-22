package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Entre os dados do contrato : ");
        System.out.println("Numero : ");
        int contractNumber = sc.nextInt();
        System.out.println("Data (dd/MM/yyyy) : ");
        Date contractDate = sdf.parse(sc.next());
        System.out.println("Entre com o valor do contrato : ");
        double contractValur = sc.nextDouble();
        System.out.println("Entre com o numero de parcelas : ");
        int numberOfParcel = sc.nextInt();




        sc.close();
    }
}