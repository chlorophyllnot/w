public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();

        // 添加 3 个员工 A, B, C
        manager.addEmployee("A", 25);
        manager.addEmployee("B", 30);
        manager.addEmployee("C", 22);

        // 删除员工 B
        manager.deleteEmployee("B");

        // 添加 2 个员工 A, D
        manager.addEmployee("A", 35);
        manager.addEmployee("D", 40);

        // 打印所有员工，应该是 A, C, D
        System.out.println("All employees:");
        manager.printEmployees();
    }
}