/*
 Program 02:
-----------
Write a Program on OOPs to define Employee class properties and behaviour.

properties/Field/Attribute :

employeeId : int;
employeeName : String;
employeeSalary : double;

Initialize these properties with the help of method using parameter variable.

behavior/Method:
setEmployeeData( int id, String name, double salary) : public void
getEmployeeData() : public void


Note : Create three more programs based on your imagination.
 */
package com.jru.oop;
record Emplyee(Integer id, String name, Double salary) {
	//Compact constructor
	Emplyee{
		if(id<0) {
			System.out.println("Invalid id");
			System.exit(0);
		}
	}
/*
 * 1. Compact constructor (Only data validation)
 * 2. getter method method name by default our variable name 
 * 		like (Integer id) ==> getter method name id().
 * 3. Setter method is not available 
 * 4. toString method is available in this record .
 */
}

public class EmployeeMnagement {
	public static void main(String[] args) {
		Emplyee emp = new Emplyee(-101, "kadir", 95000D);
		System.out.println(emp);
		
	}

}
