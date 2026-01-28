import java.util.Scanner;
import java.util.InputMismatchException;

public class Main{
   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      boolean loop = true;

      while(loop){
         System.out.println("1 - Retrieve from database");
         System.out.println("2 - Insert into database");
         System.out.println("3 - Update database");
         System.out.println("4 - Delete from database");
         System.out.println("0 - Exit java application");
         System.out.print("Enter Choice: ");


         String choice = sc.nextLine();
         System.out.println();

         switch(choice){
            case "0":
               loop = false;
               break;
            
            
            case "1":
               boolean loop2 = true;
               while(loop2){
                  System.out.println("1 - Retrieve Leader Table");
                  System.out.println("2 - Retrieve Civilization Table");
                  System.out.println("3 - Retrieve Building Table");
                  System.out.println("4 - Retrieve Memento Table");
                  System.out.println("5 - Retrieve OnlyScienceWithCombatBonus View");
                  System.out.println("0 - Exit Retrieve Menu");
                  System.out.print("Enter Choice: ");

                  String choice2 = sc.nextLine();
                  System.out.println();

                  switch(choice2){
                     
                     case "0":
                        loop2 = false;
                        break;
                     
                     case "1":
                        try {
                           ReadSQL reader = new ReadSQL();   
                           reader.readLeader();                  

                        } catch (Exception ex) {
                           ex.printStackTrace();
                        }
                        System.out.println();
                        break;

                        
                     case "2":
                        try {
                           ReadSQL reader = new ReadSQL();   
                           reader.readCivilization();                  

                        } catch (Exception ex) {
                           ex.printStackTrace();
                        }
                        System.out.println();
                        break;
                     
                     case "3":
                        try {
                           ReadSQL reader = new ReadSQL();   
                           reader.readBuilding();                  

                        } catch (Exception ex) {
                           ex.printStackTrace();
                        }
                        System.out.println();
                        break;
                     
                     case "4":
                        try {
                           ReadSQL reader = new ReadSQL();   
                           reader.readMemento();                  

                        } catch (Exception ex) {
                           ex.printStackTrace();
                        }
                        System.out.println();
                        break;
                     
                     case "5":
                        try {
                           ReadSQL reader = new ReadSQL();   
                           reader.readView();                  

                        } catch (Exception ex) {
                           ex.printStackTrace();
                        }
                        System.out.println();
                        break;                                       
                  }
               } 
               break;            
            case "2":
               boolean loop3 = true;
               while(loop3){
                  System.out.println("1 - Insert Leader Table");
                  System.out.println("2 - Insert Civilization Table");
                  System.out.println("3 - Insert Building Table");
                  System.out.println("4 - Insert Memento Table");
                  System.out.println("0 - Exit Insert Menu");
                  System.out.print("Enter Choice: ");

                  String choice2 = sc.nextLine();
                  System.out.println();

                  switch(choice2){
                     
                     case "0":
                        loop3 = false;
                        break;
                        
                     case "1":
                        try {
                           InsertSQL insert = new InsertSQL();   
                           insert.insertLeader();                  
                        } catch (Exception ex) {
                           ex.printStackTrace();
                        }
                        System.out.println();
                        break;

                        
                     case "2":
                        try {
                           InsertSQL insert = new InsertSQL();   
                           insert.insertCivilization();                  

                        } catch (Exception ex) {
                           ex.printStackTrace();
                        }
                        System.out.println();
                        break;
                     
                     case "3":
                        try {
                           InsertSQL insert = new InsertSQL();   
                           insert.insertBuilding();                  

                        } catch (Exception ex) {
                           ex.printStackTrace();
                        }
                        System.out.println();
                        break;
                     
                     case "4":
                        try {
                           InsertSQL insert = new InsertSQL();   
                           insert.insertMemento();                  

                        } catch (Exception ex) {
                           ex.printStackTrace();
                        }
                        System.out.println();
                        break;                                     
                  }
               }
               break;      
         
            case "3":
               try {
                  UpdateSQL update = new UpdateSQL();   
                  update.updateRow();                  
               } catch (Exception ex) {
                  ex.printStackTrace();
               }
               break;
               
            case "4":
               boolean loop4 = true;
               while(loop4){
                  System.out.println("1 - Delete Leader Table");
                  System.out.println("2 - Delete Civilization Table");
                  System.out.println("3 - Delete Building Table");
                  System.out.println("4 - Delete Memento Table");
                  System.out.println("0 - Exit Insert Menu");
                  System.out.print("Enter Choice: ");

                  String choice2 = sc.nextLine();
                  System.out.println();

                  switch(choice2){
                     
                     case "0":
                        loop4 = false;
                        break;
                        
                     case "1":
                        try {
                           DeleteSQL delete = new DeleteSQL();   
                           delete.deleteLeader();                  
                        } catch (Exception ex) {
                           ex.printStackTrace();
                        }
                        System.out.println();
                        break;

                        
                     case "2":
                        try {
                           DeleteSQL delete = new DeleteSQL();   
                           delete.deleteCivilization();                  

                        } catch (Exception ex) {
                           ex.printStackTrace();
                        }
                        System.out.println();
                        break;
                     
                     case "3":
                        try {
                           DeleteSQL delete = new DeleteSQL();   
                           delete.deleteBuilding();                  

                        } catch (Exception ex) {
                           ex.printStackTrace();
                        }
                        System.out.println();
                        break;
                     
                     case "4":
                        try {
                           DeleteSQL delete = new DeleteSQL();   
                           delete.deleteMemento();                  

                        } catch (Exception ex) {
                           ex.printStackTrace();
                        }
                        System.out.println();
                        break;                                     
                  }
               }
               break;
         
         }
      }
   }
}
