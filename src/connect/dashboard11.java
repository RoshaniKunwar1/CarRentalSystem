package connect;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class dashboard11 {
    private int regNo;
    private String brand;
    private String price;
    private String status;
    private String modal;
    
    public dashboard11(int regno, String brand,String price, String status, String modal ){
        this.regNo = regno;
        this.brand = brand;
        this.modal = modal;
        this.price = price;
        this.status = status;
    }
    public dashboard11(){
        
    }

    public int getRegNo() {
        return regNo;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getModal() {
        return modal;
    }

    public void setModal(String modal) {
        this.modal = modal;
    }
    
    public void SaveCar( int id, String brand, String price, String status, String modal){
        String query1 = "Insert into ManageCar values(?, ?, ?, ?, ?)";
        try {
            PreparedStatement pstmt = DB.getConnection().prepareStatement(query1);
            pstmt.setInt(1, id);
            pstmt.setString(2,brand);
            pstmt.setString(3,price);
            pstmt.setString(4,modal);
            pstmt.setString(5,status);

            if(pstmt.executeUpdate() != 0){
               JOptionPane.showMessageDialog(null, "Car manage Added", "Add", 1);
           }
           else{
               JOptionPane.showMessageDialog(null, "Car manage not added! Sorry", "Add",2);
           
        }
        } catch (SQLException ex) {
            Logger.getLogger(dashboard11.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
   public void EditBrand(int id, String brand, String price, String status, String modal){
       try{
           String query = "Update ManageCar set brand=?, price=?, status=?, modal=?where regNo=? ";
           PreparedStatement pstmt = DB.getConnection().prepareStatement(query);
           pstmt.setString(1, brand);
           pstmt.setString(2, price);
           pstmt.setString(3, status);
           pstmt.setString(4, modal);
           pstmt.setInt(5, id);
           
           if(pstmt.executeUpdate() !=0){
               JOptionPane.showMessageDialog(null, "Car manage updated", "Edit", 1);
           }
           else{
               JOptionPane.showMessageDialog(null, "Car manage not updated! Sorry", "Edit",2);
           }
       }
       catch(Exception e){
           e.printStackTrace();
       }
   }
        
public void deleteCar(int id){
    try{
        String query = "Delete  from ManageCar where regNo=?";
        PreparedStatement pstmt = DB.getConnection().prepareStatement(query);
        pstmt.setInt(1, id);
        
        if(pstmt.executeUpdate()!=0){
            JOptionPane.showMessageDialog(null, "Cars Deleted", "Delete",1);
        }
        else{
               JOptionPane.showMessageDialog(null, "Car manage not Deleted! Sorry", "Delete",2);
           }
    }
    catch(Exception e){
        e.printStackTrace();
    }
}

public ArrayList<dashboard11> carList(){
    ArrayList<dashboard11> dashi = new ArrayList<>();
    String query= "Select * from ManageCar";
        try {
            PreparedStatement pstmt = DB.getConnection().prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                dashboard11 dashi1;
                dashi1 = new dashboard11(rs.getInt(1), rs.getString(2),
                        rs.getString(3), rs.getString(4), rs.getString(5));
                
                System.out.println(dashi1);
                dashi.add(dashi1);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(dashboard11.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dashi;
}
String carStatus = "avilable";
     public ArrayList<dashboard11> carList1(){
    ArrayList<dashboard11> dashi1 = new ArrayList<>();
    String query= "select * from managecar where status='"+"avilable"+"' ";
        try {
            PreparedStatement pstmt = DB.getConnection().prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                dashboard11 dashi11;
                dashi11 = new dashboard11(rs.getInt(1), rs.getString(2),
                        rs.getString(3), rs.getString(4), rs.getString(5));
                
                System.out.println(dashi1);
                dashi1.add(dashi11);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(dashboard11.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dashi1;
}
}
