package com.demo.test;
import java.util.List;
import java.util.Scanner;

import com.demo.model.User;
import com.demo.service.*;
public class TestCrud {
	
	public static void main(String[] args) {
		Iservice iser=new ServiceImpl();
		int choice=0;
		Scanner sc =new Scanner(System.in);
		do{			
			System.out.println("1. Add new USer\n2. Display all user\n 3. display by id");
			System.out.println("4. delete by id\n5. update by id\n 6. sort by id\n 7.exit");
			System.out.println("Enter your Choice : ");
			choice=sc.nextInt();
		switch(choice) {
		case 1:
			iser.AddnewUser();
			break;
		case 2:
			List<User>ulist=iser.DisplayAll();
			System.out.println(ulist);
			break;
		case 3:
			break;
		case 4:
			System.out.println("Enter the user id");
			int id=sc.nextInt();
			boolean status=iser.DeleteByid(id);
			if(status)
			{
				System.out.println("Deleted Succesfully");
			}
			else
			{
				System.out.println("ID not found");
			}
			break;
		case 5:
			break;
		case 6:
			break;
		
		case 7:
			System.out.println("Thank you!!");
			break;
			
		}
		}while(choice!=7);
		
		
	}

}
