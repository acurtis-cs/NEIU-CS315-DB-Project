import java.sql.*;
import java.util.Scanner;

public class UpdateSQL{
   Scanner sc = new Scanner(System.in);
   private Connection conn;
   
   public UpdateSQL() throws SQLException{
//MUST UPDATE BELOW WITH YOUR CLASS LINK AND PASSWORD////////////////////
      String url = "CLASS_LINK_HERE phpMyAdmin_SQL";
      url += "PERSONAL_PASSWORD_FROM_CLASS";
//MUST UPDATE ABOVE WITH YOUR CLASS LINK AND PASSWORD/////////////////////
           
      conn = DriverManager.getConnection(url);
   }
   
   public void updateRow() throws SQLException{
            
      System.out.println("Updating row info");
      System.out.print("Enter Table name that need to be update: ");
      String Table = sc.nextLine();
      
      System.out.print("Enter column name that needs to be update: ");
      String Column = sc.nextLine();
      
      System.out.print("Enter the updated information: ");
      String Info = sc.nextLine();
      
      System.out.print("Enter row 'name' that needs to be update: ");
      String Row = sc.nextLine();
            
      Statement stmt= conn.createStatement();  
      String update = "UPDATE "+Table+" SET "+Column+" = '"
         +Info+"' WHERE Name = '"+Row+"';"; 
      stmt.executeUpdate(update);
      System.out.println("Updated Row Completed.");
      System.out.println();
   }
}