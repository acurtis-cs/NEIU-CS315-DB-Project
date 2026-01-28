import java.sql.*;

public class ReadSQL{
  
   private Connection conn;
   
   public ReadSQL() throws SQLException{
//MUST UPDATE BELOW WITH YOUR CLASS LINK AND PASSWORD////////////////////
      String url = "CLASS_LINK_HERE phpMyAdmin_SQL";
      url += "PERSONAL_PASSWORD_FROM_CLASS";
//MUST UPDATE ABOVE WITH YOUR CLASS LINK AND PASSWORD/////////////////////
         
      conn = DriverManager.getConnection(url);
   }
   
   public void readMemento() throws SQLException{
      
      Statement stmt= conn.createStatement();  
      String query = "SELECT * FROM Memento"; 
      ResultSet rs = stmt.executeQuery(query);
      
      System.out.printf("%-21s %-11s %-8s%n",
         "Name", "Yield", "LeaderID");
      System.out.println("-----------------------------------------------");
      
      while(rs.next()){
         int LeaderID = rs.getInt("LeaderID");
         String Name = rs.getString("Name");
         String yield = rs.getString("yield");
            
         System.out.printf("%-21s %-11s %7d%n",
            Name, yield, LeaderID);
       }
   }
   
   public void readBuilding() throws SQLException{
      
      Statement stmt= conn.createStatement();  
      String query = "SELECT * FROM Building"; 
      ResultSet rs = stmt.executeQuery(query);
      
      System.out.printf("%-18s %-13s %-11s %-5s%n",
         "Name", "Attribute", "Yield", "CivID");
      System.out.println("---------------------------------------------------------");
      
      while(rs.next()){
         int CivID = rs.getInt("CivID");
         String Name = rs.getString("Name");
         String yield = rs.getString("yield");
         String Attribute = rs.getString("Attribute");
            
         System.out.printf("%-18s %-13s %-11s %5d%n",
            Name, Attribute, yield, CivID);
       }
   }
   
   
   public void readCivilization() throws SQLException{
      
      Statement stmt= conn.createStatement();  
      String query = "SELECT * FROM Civilization"; 
      ResultSet rs = stmt.executeQuery(query);
      
      System.out.printf("%-6s %-13s %-13s %-13s %-11s%n",
         "CivID", "Name", "Attribute", "Attribute2", "Yield");
      System.out.println("---------------------------------------------------------");
      
      while(rs.next()){
         int CivID = rs.getInt("CivID");
         String Name = rs.getString("Name");
         String yield = rs.getString("yield");
         String Attribute = rs.getString("Attribute");
         String Attribute2 = rs.getString("Attribute2");
            
         System.out.printf("%-6d %-13s %-13s %-13s %-11s%n",
            CivID, Name, Attribute, Attribute2, yield);
       }
   }
   
   public void readLeader() throws SQLException{
      
      Statement stmt= conn.createStatement();  
      String query = "SELECT * FROM Leader"; 
      ResultSet rs = stmt.executeQuery(query);
      
      System.out.printf("%-9s %-23s %-13s %-13s %-11s %-11s%n",
         "LeaderID", "Name", "Attribute", "Attribute2", "Yield", "Yield2");
      System.out.println("----------------------------------------------------------------------------------");
      
      while(rs.next()){
         int LeaderID = rs.getInt("LeaderID");
         String Name = rs.getString("Name");
         String yield = rs.getString("yield");
         String yield2 = rs.getString("yield2");
         String Attribute = rs.getString("Attribute");
         String Attribute2 = rs.getString("Attribute2");
            
         System.out.printf("%-9d %-23s %-13s %-13s %-11s %-11s%n",
            LeaderID, Name, Attribute, Attribute2, yield, yield2);
       }
   }
   
   public void readView() throws SQLException{
      
      Statement stmt= conn.createStatement();  
      String query = "SELECT * FROM OnlyScienceWithCombatBonus"; 
      ResultSet rs = stmt.executeQuery(query);
      
      System.out.printf("%-9s %-23s %-6s %-13s %-21s%n",
         "LeaderID", "LeaderName","CivID", "CivName", "Memento");
      System.out.println("----------------------------------------------------------------------------");
         
      
      
      while(rs.next()){
         int LeaderID = rs.getInt("LeaderID");
         String LeaderName = rs.getString("LeaderName");
         int CivID = rs.getInt("CivID");
         String CivName = rs.getString("CivName");
         String Memento = rs.getString("Memento");
            
         System.out.printf("%-9d %-23s %-6d %-13s %-21s%n",
            LeaderID, LeaderName, CivID, CivName, Memento);
      }
   }

}