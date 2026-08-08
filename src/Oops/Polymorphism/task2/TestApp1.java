package Oops.Polymorphism.task2;

import java.util.Scanner;

public class TestApp1 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hospital Management System");
		System.out.println("1) Doctor");
		System.out.println("2) Nurse");
		System.out.println("3) Patient");
		System.out.println("4) Receptionist");
		System.out.println("Enter the choice : ");
		int choice = sc.nextInt();
		
		HospitalPerson person = null;
		
		switch(choice)
		{
		case 1: 
			person = new Doctor();
			break;
			
		case 2: 
			person = new Nurse();
			break;
			
		case 3: 
			person = new Patient();
			break;
			
		case 4: 
			person = new Receptionist();
			break;
			
		default:
			System.out.println("invalid choice");
			return;
		}
		
		person.performDuty();
		
		if(person instanceof Doctor)
		{
			Doctor dr = (Doctor)person;
			dr.prescribeMedicine();
		}
		else if(person instanceof Nurse)
		{
			Nurse nr = (Nurse)person;
			nr.assistPatient();
		}
		else if(person instanceof Patient)
		{
			Patient pt = (Patient)person;
			pt.getTreatment();
		}
		else
		{
			Receptionist rt = (Receptionist)person;
			rt.bookAppointment();
		}
	}

}
