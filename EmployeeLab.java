public static void main(String[] args)
{
public class EmployeeLab
{
   private String EmpName="";
   private double EmpSalary=0.0;
   private static int EmpNumCounter = 900;
   private int EmpNum=0;
  
   public EmployeeLab(String Sname, double dSalary)
   {
       this.EmpName = Sname;
       this.EmpSalary = dSalary;
       EmpNum = EmpNumCounter;
   }
       
public int getEmpNum()
{
  this.EmpNum=
    EmpNumCounter;
  EmpNumCounter++;
  return EmpNum;
}
       
   
  
   @Override
   public String toString() {
      
       return "Name="+this.EmpName+" Salary="+this.EmpSalary+this.EmpNum+"";
   }
}




