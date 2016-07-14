package com.flp.ems.view;

import java.util.Scanner;

class BootClass
{
	
	static Scanner sc=new Scanner(System.in);
   public static void MenuSelection(){
	   UserInteraction ui =new UserInteraction();
	   System.out.println("option 1 for AddEmployee");
	   System.out.println("option 2 for ModifyEmployee");
	   System.out.println("option 3 for RemoveEmployee");
	   System.out.println("option 4 for SearchEmployee");
	   System.out.println("option 5 for GetEmployee");
	  
	       int i= sc.nextInt();
	      
	   switch(i){
	   case 1:
		   ui.AddEmployee();
		   break;
	   case 2:
		   ui.ModifyEmployee();
		   break;
	   case 3:
		   ui.RemoveEmployee();
		   break;
	   case 4:
		   ui.SearchEmployee();
		   break;
	   case 5:
		   ui.GetallEmployee();
		   break;
		   default:System.out.println("Invalid choice");
		   break;
		   
	   }
   }
   public static void main(String[] args) {
	   BootClass.MenuSelection();
	
}
}


  
   
   
   
   
   
   
   
   
	  



