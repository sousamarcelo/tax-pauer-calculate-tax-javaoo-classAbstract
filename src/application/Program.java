package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.LegalPeason;
import entities.NaturalPerson;
import entities.TaxPayer;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<TaxPayer>();
		
		System.out.print("Enter the number of tax payers: ");
		int N = sc.nextInt();
		
		for(int i = 1; i <= N; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)?: ");
			char c = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			Double incame = sc.nextDouble();
			if (c == 'i') {
				System.out.print("Health expenditures: ");
				Double HealthExpense = sc.nextDouble();
				list.add(new NaturalPerson(name, incame, HealthExpense));				
			} else {
				System.out.print("Number of employees: ");
				Integer numberEmployees = sc.nextInt();
				list.add(new LegalPeason(name, incame, numberEmployees));
			}			
		}
		System.out.println();
		
		Double sum = 0.0;
		System.out.println("TAXES PAID: ");
		for(TaxPayer t : list) {
			System.out.println(t.getName() + ": $ " + String.format("%.2f", t.taxPaid()) );
			sum += t.taxPaid();
		}
		
		System.out.println();
		
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
		
		sc.close();
	}

}
