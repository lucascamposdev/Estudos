/* S - Single Responsibility Principle */

/* Cada classe deve ter uma única responsabilidade ou motivo para mudar. 
Isso torna a classe mais simples e facilita a manutenção. */



// Errado
public class Employee
{
    public string Name { get; set; }
    public double Salary { get; set; }

    public void CalculatePay()
    {
        // Lógica de cálculo do salário
    }

    public void GenerateReport()
    {
        // Lógica de geração de relatório
    }
}



// Correto
public class Employee
{
    public string Name { get; set; }
    public double Salary { get; set; }
}

public class SalaryCalculator
{
    public double CalculatePay(Employee employee)
    {
        return employee.Salary;
    }
}

public class ReportGenerator
{
    public void GenerateReport(Employee employee)
    {
    }
}