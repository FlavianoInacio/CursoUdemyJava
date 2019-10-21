package orientadoAoBjetos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcao;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a opção do menu que deseja !");
		
		System.out.println("Exercicio 1 - Retangulo");
		System.out.println("Exercicio 2 - Employee");
		System.out.println("Exercicio 3 - Student");

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
		default:
			break;
		}
	}

}
