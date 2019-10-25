package orientadoAoBjetos;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		int opcao;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a opção do menu que deseja !");
		
		System.out.println("Exercicio 1 - Retangulo");
		System.out.println("Exercicio 2 - Employee");
		System.out.println("Exercicio 3 - Student");
		System.out.println("Exercicio 4 - Statics Members");

		opcao = sc.nextInt();
		
		switch (opcao) {
		case 1:
			Retangle ret = new Retangle();
			System.out.println("Enter widht of retangle");
			ret.setHeight(sc.nextDouble());
			System.out.println("Enter height of retangle");
			ret.setWidth(sc.nextDouble());
			
			System.out.println("ÁREA = "+ret.area());
			System.out.println("PERÍMETRO = "+ret.perimenter());
			System.out.println("DIAGONAL = "+ret.diagonal());
			break;
		case 2:
			Employee emp = new Employee();
			System.out.println("write name of employee ");
			emp.setName(sc.next());
			System.out.println("write Gross Salary of employee ");
			emp.setGrossSalary(sc.nextDouble());
			System.out.println("write tax of employee ");
			emp.setTax(sc.nextDouble());
			System.out.println("Employee: "+emp.getName() + " $ " + emp.nextSalary());
			System.out.println("Wich percentage to increase salary?");
			emp.encreaseSalary(sc.nextDouble());
			System.out.println("Employee: "+emp.getName() + " $ " + emp.nextSalary());
			break;	
		case 3:
			Student stu = new Student();
			System.out.println("write name of Student ");
			stu.setName(sc.next());
			System.out.println("write note 1 of Student ");
			stu.setNote1(sc.nextDouble());
			System.out.println("write note 2 of Student ");
			stu.setNote2(sc.nextDouble());
			System.out.println("write note 3 of Student ");
			stu.setNote3(sc.nextDouble());
			stu.verifyYearNotes();
			break;
		case 4:
			System.out.println("What is the dollar price?");
			double dollar = sc.nextDouble();
			System.out.println("How many dollares will be bought?");
			double valueDolares = sc.nextDouble();
			System.out.println("Amount to be paid in reias = " + CurrencyConverter.returnValReais(dollar, valueDolares));
			break;
		default:
			break;
		}
	}

}
