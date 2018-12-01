package unmsm.cyds;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

    public static void main(String[] args) throws Exception {
        ApplicationContext context = new GenericXmlApplicationContext("beans.xml");

        InterestCalculatorContex calculadorInteres = new InterestCalculatorContex();
        RateCalculatorInterface rateCalculatorInterface = (RateCalculatorInterface) context.getBean(Constantes.BCP);
        
        Scanner sc = new Scanner(System.in);
        double amount;
        System.out.print("Introduzca el monto: ");
        amount = sc.nextDouble();
        double year;
        System.out.print("Introduzca plazo (número de años): ");
        year = sc.nextDouble();
        System.out.println("Total a pagar: " + calculadorInteres.calculate(amount, year, rateCalculatorInterface));
    }
}
