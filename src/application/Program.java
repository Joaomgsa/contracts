package application;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre os dados do contrato : ");
        System.out.print("Numero : ");
        int contractNumber = sc.nextInt();
        System.out.print("Data (dd/MM/yyyy) : ");
        LocalDate date = LocalDate.parse(sc.next(),fmt);
        System.out.print("Entre com o valor do contrato : ");
        double contractValue = sc.nextDouble();

        Contract obj = new Contract(contractNumber,date,contractValue);

        System.out.print("Entre com o numero de parcelas : ");
        int numberOfInstallment = sc.nextInt();

        ContractService contractService = new ContractService(new PaypalService());

        contractService.processContract(obj,numberOfInstallment);



        System.out.println("Parcelas :");
        for (Installment installment : obj.getInstallments()){
           System.out.println(installment);
        }

        sc.close();
    }
}