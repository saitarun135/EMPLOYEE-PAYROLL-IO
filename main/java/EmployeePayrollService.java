import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {
   public enum IOService {CONSOLE_IO,FILE_IO,DB_IO,REST_IO}
   private List<EmployeePayRollData> employeePayrollList;
   public EmployeePayrollService(){}
   public EmployeePayrollService(List<EmployeePayRollData> employeePayrollList){}

    public static void main(String[] args) {

            Scanner consoleInputReader = new Scanner(System.in);
            ArrayList<EmployeePayRollData> employeePayrollList = new ArrayList<>();
            EmployeePayrollService employeePayrollService = new EmployeePayrollService(employeePayrollList);
            employeePayrollService.readEmployeePayrollData(consoleInputReader);
            employeePayrollService.writeEmployeePayrollData();

    }
    private void readEmployeePayrollData(Scanner consoleInputReader){
        System.out.println("Enter Employee id");
        int id =consoleInputReader.nextInt();
        System.out.println("Enter Employee name");
        String name=consoleInputReader.next();
        System.out.println("Enter Employee Salary");
        double salary=consoleInputReader.nextDouble();
        employeePayrollList.add(new EmployeePayRollData(id,name,salary));
    }
private void writeEmployeePayrollData(){
       System.out.println("Writing employee payroll roaster to console \n" +employeePayrollList);
}


}
