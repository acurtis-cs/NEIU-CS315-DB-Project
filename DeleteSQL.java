import java.sql.*;
import java.util.Scanner;

public class DeleteSQL{
   Scanner sc = new Scanner(System.in);
   private Connection conn;
   
   public DeleteSQL() throws SQLException{
//MUST UPDATE BELOW WITH YOUR CLASS LINK AND PASSWORD////////////////////
      String url = "CLASS_LINK_HERE phpMyAdmin_SQL";
      url += "PERSONAL_PASSWORD_FROM_CLASS";
//MUST UPDATE ABOVE WITH YOUR CLASS LINK AND PASSWORD/////////////////////

      conn = DriverManager.getConnection(url);
   }
   
   public void deleteMemento() throws SQLException{
            
      System.out.println("Delete Row From Memento");
      System.out.print("Enter Memento name: ");
      String Name = sc.nextLine();
            
      Statement stmt= conn.createStatement();  
      String update = "DELETE FROM Memento WHERE Name = '"+Name+"';"; 
      stmt.executeUpdate(update);
      System.out.println("Delete Completed.");
      System.out.println();
   }
   
   public void deleteBuilding() throws SQLException{
      
      System.out.println("Delete Row From Building");
      System.out.print("Enter Building name: ");
      String Name = sc.nextLine();
            
      Statement stmt= conn.createStatement();  
      String update = "DELETE FROM Building WHERE Name = '"+Name+"';"; 
      stmt.executeUpdate(update);
      System.out.println("Delete Completed.");
      System.out.println();
   }
   
   public void deleteCivilization() throws SQLException{
      
      System.out.println("Delete Row From Civilization");
      System.out.print("Enter Civ name: ");
      String Name = sc.nextLine();
            
      Statement stmt= conn.createStatement();  
      String update = "DELETE FROM Civilization WHERE Name = '"+Name+"';"; 
      stmt.executeUpdate(update);
      System.out.println("Delete Completed.");
      System.out.println();
   }
   
   public void deleteLeader() throws SQLException{
      
      System.out.println("Delete Row From Leader");
      System.out.print("Enter Leader name: ");
      String Name = sc.nextLine();
            
      Statement stmt= conn.createStatement();  
      String update = "DELETE FROM Leader WHERE Name = '"+Name+"';"; 
      stmt.executeUpdate(update);
      System.out.println("Delete Completed.");
      System.out.println();
   }
   
   
   
}