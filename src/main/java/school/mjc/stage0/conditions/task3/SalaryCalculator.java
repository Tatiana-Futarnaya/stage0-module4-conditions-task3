package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if(salary>0){
            if(salary<=10000){
                System.out.println((double) salary-salary*15/100);
            }

            if (salary>10000 && salary<=20000){
                System.out.println((double)salary-salary*18/100);
            }

            if(salary>20000){
                System.out.println((double)salary-salary*20/100);
            }
        }else{
            System.out.println( "wrong input!");
        }

    }
}
