import java.sql.*;
import java.util.Scanner;

public class InsertSQL{
   Scanner sc = new Scanner(System.in);
   private Connection conn;
   
   public InsertSQL() throws SQLException{
//MUST UPDATE BELOW WITH YOUR CLASS LINK AND PASSWORD////////////////////
      String url = "CLASS_LINK_HERE phpMyAdmin_SQL";
      url += "PERSONAL_PASSWORD_FROM_CLASS";
//MUST UPDATE ABOVE WITH YOUR CLASS LINK AND PASSWORD/////////////////////
         
      conn = DriverManager.getConnection(url);
   }
   
   public void insertMemento() throws SQLException{
      
      System.out.println("Insert Row into Memento");      
      System.out.print("Enter the name: ");
      String Name = sc.nextLine();
      
      System.out.print("Enter the yield: ");
      String yield = sc.nextLine();
      
      System.out.print("Enter the LeaderID: ");
      String LeaderID = sc.nextLine();
      
      Statement stmt= conn.createStatement();  
      String update = "INSERT INTO Memento VALUES('"+Name+"', '"
         +yield+"', "+LeaderID+")"; 
      stmt.executeUpdate(update);
      System.out.println("Insert Completed.");
   }
   
   public void insertBuilding() throws SQLException{
      
      System.out.println("Insert Row into Building");
      System.out.print("Enter the name: ");
      String Name = sc.nextLine();
      
      System.out.print("Enter the Attribute: ");
      String Attribute = sc.nextLine();
      
      System.out.print("Enter the yield: ");
      String yield = sc.nextLine();
      
      System.out.print("Enter the CivID: ");
      String CivID = sc.nextLine();
      
      Statement stmt= conn.createStatement();  
      String update = "INSERT INTO Building VALUES('"+Name+"', '"
      +Attribute+"', '"+yield+"', "+CivID+")"; 
      stmt.executeUpdate(update);
      System.out.println("Insert Completed.");
   }
   
   public void insertCivilization() throws SQLException{
      
      System.out.println("Insert Row into Civilization");
      System.out.print("Enter the name: ");
      String Name = sc.nextLine();
      
      System.out.print("Enter the Attribute: ");
      String Attribute = sc.nextLine();
      
      System.out.print("Enter the Attribute2: ");
      String Attribute2 = sc.nextLine();
      
      System.out.print("Enter the yield: ");
      String yield = sc.nextLine();
      
      
      
      Statement stmt= conn.createStatement();  
      String update = "INSERT INTO Civilization (Name, Attribute, Attribute2, yield) VALUES('"
      +Name+"', '"+Attribute+"', '"+Attribute2+"', '"+yield+"')"; 
      stmt.executeUpdate(update);
      System.out.println("Insert Completed.");
   }
   
   public void insertLeader() throws SQLException{
      
      System.out.println("Insert Row into Leader");
      System.out.print("Enter the name: ");
      String Name = sc.nextLine();
      
      System.out.print("Enter the Attribute: ");
      String Attribute = sc.nextLine();
      
      System.out.print("Enter the Attribute2: ");
      String Attribute2 = sc.nextLine();
      
      System.out.print("Enter the yield: ");
      String yield = sc.nextLine();
      
      System.out.print("Enter the yield2: ");
      String yield2 = sc.nextLine();
      
      
      
      Statement stmt= conn.createStatement();  
      String update = "INSERT INTO Leader (Name, Attribute, Attribute2, yield, yield2) VALUES('"
      +Name+"', '"+Attribute+"', '"+Attribute2+"', '"+yield+"', '"+yield2+"')"; 
      stmt.executeUpdate(update);
      System.out.println("Insert Completed.");
   }
   
   
   
}