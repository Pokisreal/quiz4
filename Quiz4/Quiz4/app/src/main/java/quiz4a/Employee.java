package quiz4a;

// (1.1) เขียน Java Docs
/**
 * การสร้างobject เเละกำหนดประเภทตัวเเปรต่างๆ โดยให้ employeeId เป็น interger,name
 * เป็น String,salary เป็น double
 * กำหนดการเข้าถึงเป็น private ทั้งหมด(private = คลาสหรือสมาชิกสามารถเข้าถึงได้ภายในคลาสเดียวกันเท่านั้น)
 */
public class Employee {
    private int employeeId;
    private String name;
    private double salary;

    // (1.2)
    /**
     * สร้าง Method Enployee ไว้ส่ง output
     * ใช้ this เพื่อเรียกตัวเอง
     */
    public Employee(int employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = (salary > 0) ? salary : 0;
    }

    // (1.3)
    /**
     * ให้ Method นี้ return salary
     */

    public double calculateSalary() {
        return salary;
    }

    // (1.4)
    /**
     * ให้ Method นี้ Return employeeId
     */
    public int getEmployeeId() {
        return employeeId;
    }

    // (1.5)
    /**
     * ให้ Method นี้ Return name
     */
    public String getName() {
        return name;
    }
}