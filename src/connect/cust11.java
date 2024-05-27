/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connect;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class cust11 {
int id;
String name;
String address;
String phone;

    public cust11(int id, String name, String address, String phone) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public cust11() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

      public void SaveCar( int id, String name, String address, String phone){
        String query1 = "Insert into managecust values(?, ?, ?, ?)";
        try {
            PreparedStatement pstmt = DB.getConnection().prepareStatement(query1);
            pstmt.setInt(1, id);
            pstmt.setString(2,name);
            pstmt.setString(3,address);
            pstmt.setString(4,phone);
           

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
   public void editCar(int id, String name, String address, String phone){
       try{
           String query = "Update ManageCust set name=?, address=?, phone=? where id=? ";
           PreparedStatement pstmt = DB.getConnection().prepareStatement(query);
             pstmt.setString(1,name);
            pstmt.setString(2,address);
            pstmt.setString(3,phone);
            pstmt.setInt(4, id);
           
           if(pstmt.executeUpdate() !=0){
               JOptionPane.showMessageDialog(null, "Car manage updated", "Edit", 1);
           }
           else{
               JOptionPane.showMessageDialog(null, "Id problem Car manage not updated! Sorry", "Edit",2);
           }
       }
       catch(Exception e){
           e.printStackTrace();
       }
   }
        
public void deleteCar(int id){
    try{
        String query = "Delete  from ManageCust where id=?";
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

public ArrayList<cust11> carList(){
    ArrayList<cust11> customer = new ArrayList<>();
    String query= "Select * from ManageCust";
        try {
            PreparedStatement pstmt = DB.getConnection().prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
               // dashboard11 dashi1;
               cust11 cust = new cust11(rs.getInt(1), rs.getString(2),
                        rs.getString(3), rs.getString(4));
                
             //   System.out.println(dashi1);
                customer.add(cust);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(dashboard11.class.getName()).log(Level.SEVERE, null, ex);
        }
        return customer;
}
}
