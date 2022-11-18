/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOPExercise3;

/**
 *
 * @author ASUS
 */
public class Cafe {
        public static void main(String[] args) {
            Customer customer;
            Order order;
            
            customer = new Customer();
            customer.setName("Jon Java");
            
            order = new Order();
            order.setOrder("Caramel Macchiato");
            order.setCustomerName(customer);
            
            System.out.println(order.toString());
            
            
            
            
        }
}
