package quiz4a;

// 2.1
/**
 * การให้ class Manager ขยายมาจาก Enployee 
 * กำหนดให้ department เป็น String,bonus เป็น double โดยทั้งสองตัวให้
 * กำหนดการเข้าถึงเป็น private ทั้งคู่(private = คลาสหรือสมาชิกสามารถเข้าถึงได้ภายในคลาสเดียวกันเท่านั้น)
 */
public class Manager extends Employee {
    private String department;
    private double bonus;

    
    // 2.2
    /**
     * สร้าง Method Manager ไว้ส่ง output
     * การใช้ super เพื่อเข้าถึงข้อมูลของคลาสเเม่
     * ใช้ this เพื่อเรียกตัวเอง
     */
    public Manager(int employeeId, String name, double salary, String department, double bonus) {
        super(employeeId, name, salary);
        this.department = department;
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }
    // 2.3
    /**
     * void ให้ method นี้ไม่ print ออก
     * บรรทัด "Employee ID: "ส่งออกเป็น Employee ID: + getEmployeeId
     * บรรทัด "Name: "ส่งออกเป็น Name: + getName
     * บรรทัด "Salary: " "ส่งออกเป็น Salary: + calculateSalary
     * บรรทัด "Department: "ส่งออกเป็น Department: + department
     * บรรทัด ""Bonus: " "ส่งออกเป็น "Bonus: + bonus
     * ตรงบรรทัด for ให้ ส่งprint  detail ที่อยู่ใน {}
     */
    public void displayDetails() {
        String[] details = {
            "Employee ID: " + getEmployeeId(),
            "Name: " + getName(),
            "Salary: " + calculateSalary(),
            "Department: " + department,
            "Bonus: " + bonus
        };
        for (String detail : details) {
            System.out.println(detail);
        }
    }

    //2.4
    /**
     * Method ให้เปรียบเทียบเนื้อหาของ String
     * ถ้าใช้ให้ปริ้น "Employee ID: " + getEmployeeId(),
                "Name: " + getName(),
                "Salary: " + calculateSalary(),
                "Department: " + department,
                "Bonus: " + bonus
        ถ้าไม่ใช่ให้ปริ้น
        String[] details = {
                "Employee ID: " + getEmployeeId(),
                "Name: " + getName()
            };
     */
    public void displayDetails(String condition) {
        if ("full".equalsIgnoreCase(condition)) {

            String[] details = {
                "Employee ID: " + getEmployeeId(),
                "Name: " + getName(),
                "Salary: " + calculateSalary(),
                "Department: " + department,
                "Bonus: " + bonus
            };
            for (String detail : details) {
                System.out.println(detail);
            }
        } else {

            String[] details = {
                "Employee ID: " + getEmployeeId(),
                "Name: " + getName()
            };
            for (String detail : details) {
                System.out.println(detail);
            }
        }
    }
}
