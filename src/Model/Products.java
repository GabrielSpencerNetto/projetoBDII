package Model;

public class Products {
    
    private int ProductID; //pk
    private String ProductName;
    private int SupplierID; //fk
    private int CategoryID; //fk
    private String QuantityPerUnit;
    private double UnitPrice;
    private double UnitsInStok;
    private double UnitsOnOrder;
    private double ReorderLevel;
    private int Discontinued; // 1 ou 0
    
    public Products() {
    }

    public Products(int productID, String productName, int supplierID, int categoryID, String quantityPerUnit,
            double unitPrice, double unitsInStok, double unitsOnOrder, double reorderLevel, int discontinued) {
        ProductID = productID;
        ProductName = productName;
        SupplierID = supplierID;
        CategoryID = categoryID;
        QuantityPerUnit = quantityPerUnit;
        UnitPrice = unitPrice;
        UnitsInStok = unitsInStok;
        UnitsOnOrder = unitsOnOrder;
        ReorderLevel = reorderLevel;
        Discontinued = discontinued;
    }

    public int getProductID() {
        return ProductID;
    }

    public void setProductID(int productID) {
        ProductID = productID;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public int getSupplierID() {
        return SupplierID;
    }

    public void setSupplierID(int supplierID) {
        SupplierID = supplierID;
    }

    public int getCategoryID() {
        return CategoryID;
    }

    public void setCategoryID(int categoryID) {
        CategoryID = categoryID;
    }

    public String getQuantityPerUnit() {
        return QuantityPerUnit;
    }

    public void setQuantityPerUnit(String quantityPerUnit) {
        QuantityPerUnit = quantityPerUnit;
    }

    public double getUnitPrice() {
        return UnitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        UnitPrice = unitPrice;
    }

    public double getUnitsInStok() {
        return UnitsInStok;
    }

    public void setUnitsInStok(double unitsInStok) {
        UnitsInStok = unitsInStok;
    }

    public double getUnitsOnOrder() {
        return UnitsOnOrder;
    }

    public void setUnitsOnOrder(double unitsOnOrder) {
        UnitsOnOrder = unitsOnOrder;
    }

    public double getReorderLevel() {
        return ReorderLevel;
    }

    public void setReorderLevel(double reorderLevel) {
        ReorderLevel = reorderLevel;
    }

    public int getDiscontinued() {
        return Discontinued;
    }

    public void setDiscontinued(int discontinued) {
        Discontinued = discontinued;
    }

    @Override
    public String toString() {
        return "Products [CategoryID=" + CategoryID + ", Discontinued=" + Discontinued + ", ProductID=" + ProductID
                + ", ProductName=" + ProductName + ", QuantityPerUnit=" + QuantityPerUnit + ", ReorderLevel="
                + ReorderLevel + ", SupplierID=" + SupplierID + ", UnitPrice=" + UnitPrice + ", UnitsInStok="
                + UnitsInStok + ", UnitsOnOrder=" + UnitsOnOrder + "]";
    }

    

}
