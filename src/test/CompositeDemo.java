package test;

import com.composite_pattern.component.Department;
import com.composite_pattern.composite_element.HeadDepartment;
import com.composite_pattern.leafs.FinancialDepartment;
import com.composite_pattern.leafs.SalesDepartment;
import org.junit.Test;

public class CompositeDemo {

    @Test
    public void departmentTest(){
        Department salesDepartment = new SalesDepartment(1, "Sales department");
        Department financialDepartment = new FinancialDepartment(2, "Financial department");
        HeadDepartment headDepartment = new HeadDepartment(3, "Head department");

        headDepartment.addDepartment(salesDepartment);
        headDepartment.addDepartment(financialDepartment);
        headDepartment.printDepartmentName();
    }
}
