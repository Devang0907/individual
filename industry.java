
import java.util.*;

public class industry {
    
}

class InventoryManager {
   Hashtable<String,Integer> InventoryItems=new Hashtable<>();

    public void updateInventory(String User_itemName, int User_quantity) {
        // Update the inventory item's quantity
        for (Map.Entry<String,Integer> entry : InventoryItems.entrySet()) {
            String Item_Name = entry.getKey();
            Integer Quantity = entry.getValue();

            if(Item_Name==User_itemName){
              InventoryItems.put(Item_Name,User_quantity);
              System.out.println(User_itemName+"'s  Quantity is updated from "+Quantity+" to "+User_quantity);
            }
            else{
            System.out.println("No Item found like "+User_itemName);
            }
        }
    }

    public void reorderAlert(Hashtable<String,Integer> InventoryItems) {
        // Check if item quantity is below reorder level, send alert
        for (Map.Entry<String,Integer> entry : InventoryItems.entrySet()) {
            String Item_Name = entry.getKey();
            Integer Quantity = entry.getValue();

            if(Quantity<=100){
              System.out.println("You should have to order "+Item_Name);
            }
           
        }
    }
}


class WorkOrder {
    int orderId;
    String product;
    int quantity;
    // Other properties and methods
}

class ProductionManager {
    List<WorkOrder> workOrders;

    public void createWorkOrder(String product, int quantity) {
        // Create a new work order
    }

    public void updateProgress(WorkOrder order, int progress) {
        // Update the progress of a work order
    }
}


class Employee {
    String name;
    String role;
    long Salary;

    public Employee(String name, String role,long Salary) {
        this.name = name;
        this.role = role;
        this.Salary=Salary;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public long getSalary() {
        return Salary;
    }
    
}

class EmployeeManager {
    
    Hashtable<Integer,Employee> employees=new Hashtable<>();

    public void addEmployee(int emp_id,String name, String role,long Salary) {

        Employee New_emp=new Employee(name,role,Salary);
        employees.put(emp_id,New_emp);
    }

    public void getInfo_Employee(int user_emp_id){
        for (Map.Entry<Integer,Employee> entry : employees.entrySet()) {
            Integer emp_id = entry.getKey();
            Employee emp=entry.getValue();
            
            if(emp_id==user_emp_id){
              System.out.println("Detail of Employee with emp_id "+emp_id+" is :");
              System.out.println("Name : "+emp.getName()+"   Role : "+emp.getRole()+"   Salary : "+emp.Salary);
            }
            else{
                System.out.println("No Employee is exist with emp_id +"+user_emp_id);
            }
           
        }
    }
}


class QualityControl {
    public boolean inspectProduct(String product) {
        // Perform quality inspection for the product
        return true; // or false if failed
    }
}


