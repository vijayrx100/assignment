package assignment2;

public class EmployeeDetalis
{
	public void  EmployeeName(String employeeName, int empId) {
	System.out.println(employeeName);
	System.out.println(empId);
	}
	public void getEmployeeAddress(String empAddress) {
		
		System.out.println(empAddress); 
		}
	public void printEmployeesalary(double empSalary) {
		System.out.println(empSalary);
	}
	public void printEmployeemobilenumber(long mobnum) {	
	System.out.println(mobnum);
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
EmployeeDetalis employee=new EmployeeDetalis();
employee.EmployeeName("kavi,", 1);
employee.getEmployeeAddress("65/-657,Chennai");
employee.printEmployeesalary(3200000.00);
employee.printEmployeemobilenumber(6382608576l);
	}
	
	
}


