package connect;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class rent {

    int regno;
    String cName;
    Date rentDate;
    Date returnDate;
    int fees;

    public rent(int regno, String cName, Date rentDate, Date returnDate, int fees) {
        this.regno = regno;
        this.cName = cName;
        this.rentDate = rentDate;
        this.returnDate = returnDate;
        this.fees = fees;
    }

    rent() {
        
    }

    public int getRegno() {
        return regno;
    }

    public void setRegno(int regno) {
        this.regno = regno;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public Date getRentDate() {
        return rentDate;
    }

    public void setRentDate(Date rentDate) {
        this.rentDate = rentDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    public void saveCarRental(int regno, String cName, Date rentDate, Date returnDate, int fees) {
        try {
            Connection con = DB.getConnection();
            String query = "Insert into carRental values(?,?,?,?,?)";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1, regno);
            pstmt.setString(2, cName);
            pstmt.setDate(3, rentDate);
            pstmt.setDate(4, returnDate);
            pstmt.setInt(5, fees);
            if (pstmt.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Car Rental Added", "Add", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Car Rental not added! Sorry", "Add", 2);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void editCarRental(int regno, String cName, Date rentDate, Date returnDate, int fees) {
        try {
            Connection con = DB.getConnection();
            String query = "Update carRental set cName=?, rentDate = ?, returnDate=?, fees=? where regno=?";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(5, regno);
            pstmt.setString(1, cName);
            pstmt.setDate(2, rentDate);
            pstmt.setDate(3, returnDate);
            pstmt.setInt(4, fees);
            if (pstmt.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Car Rental Updated", "Edit", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Car Rental not Updated! Sorry", "Edit", 2);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    
     public void deleteCarRental(int regno) { 
      try{
          Connection con = DB.getConnection();
          String query = "Delete from carRental where regno=?";
          PreparedStatement pstmt= con.prepareStatement(query);
          pstmt.setInt(1, regno);
        
            if(pstmt.executeUpdate() !=0){
               JOptionPane.showMessageDialog(null, "Car Rental Delete", "Delete", 1);
           }
           else{
               JOptionPane.showMessageDialog(null, "Car Rental not Deleted! Sorry", "Delete",2);
           
        }
      }
      catch(SQLException e){
          e.printStackTrace();
      }
      
  }
     
     public ArrayList<rent> carRentList(){
     //    java.util.Date dt = new java.util.Date();
    ArrayList<rent> dashi = new ArrayList<>();
    String query= "Select * from carRental";
        try {
            PreparedStatement pstmt = DB.getConnection().prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                rent rental;
                rental= new rent(rs.getInt(1), rs.getString(2),
                        rs.getDate(3), rs.getDate(4), rs.getInt(5));
                System.out.println(rental);
                dashi.add(rental);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(dashboard11.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dashi;
}
     
}
