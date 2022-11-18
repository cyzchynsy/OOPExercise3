/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOPExercise3;

/**
 *
 * @author ASUS
 */
public class Order {
    private Customer owner;
    private String order;
    
    public Order(){
        owner = null;
        order = "unassigned";
    }
    
    public String getOrder () {
        return order;
    }
    
    public String getCustomerName() {
        return owner.getName();
    }
    
    public void setOrder (String customerOrder) {
        order = customerOrder;
    }
    
    public void setCustomerName(Customer customer) {
        owner = customer;
    }
    
    @Override
    
    public String toString() {
    return "Customer Name: " + owner.getName() + "\n"
            + "Order: " + order;
    }
}
