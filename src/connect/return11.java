package connect;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class return11 {
    
    int regNo;
    String custName;
    Date returnDate;
    int delay;
    int fine;

    public return11(int regNo, String custName, Date returnDate, int delay, int fine) {
        this.regNo = regNo;
        this.custName = custName;
        this.returnDate = returnDate;
        this.delay = delay;
        this.fine = fine;
    }

    return11() {
       
    }

    public int getRegNo() {
        return regNo;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public int getDelay() {
        return delay;
    }

    public void setDelay(int delay) {
        this.delay = delay;
    }

    public int getFine() {
        return fine;
    }

    public void setFine(int fine) {
        this.fine = fine;
    }
    
    public void InReturn(int regNo, String custName, Date returnDate, int delay, int fine){
                try {
            Connection con = DB.getConnection();
            String query = "Insert into caronrent values(?,?,?,?,?)";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1, regNo);
            pstmt.setString(2, custName);
            pstmt.setDate(3, returnDate);
            pstmt.setInt(4, delay);
            pstmt.setInt(5, fine);
            if (pstmt.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Rented car is returned Succesfully", "return", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Rented car is not returned", "return", 2);

            }
        }
                catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
      public ArrayList<return11> carOnRentList(){
     //    java.util.Date dt = new java.util.Date();
    ArrayList<return11> dashi = new ArrayList<>();
    String query= "Select * from caronrent";
        try {
            PreparedStatement pstmt = DB.getConnection().prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                return11 rental;
                rental= new return11(rs.getInt(1), rs.getString(2),
                        rs.getDate(3), rs.getInt(4), rs.getInt(5));
                System.out.println(rental);
                dashi.add(rental);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(dashboard11.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dashi;
}
      
}
