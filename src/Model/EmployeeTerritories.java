package Model;

public class EmployeeTerritories {
    
    private int EmployeeID; //FK Employee
    private int TerritoryID; //FK Territory
    
    public EmployeeTerritories() {
    }

    public EmployeeTerritories(int employeeID, int territoryID) {
        EmployeeID = employeeID;
        TerritoryID = territoryID;
    }

    public int getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(int employeeID) {
        EmployeeID = employeeID;
    }

    public int getTerritoryID() {
        return TerritoryID;
    }

    public void setTerritoryID(int territoryID) {
        TerritoryID = territoryID;
    }

    @Override
    public String toString() {
        return "EmployeeTerritories [EmployeeID=" + EmployeeID + ", TerritoryID=" + TerritoryID + "]";
    }

    

}
