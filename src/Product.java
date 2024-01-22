public class Product {
    private String name;
    private String description;
    private String ID;
    private double cost;
    private int YOB;


    public Product(String ID, String name, String description, double cost) {
        this.name = name;
        this.description = description;
        this.ID = ID;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String toCSVDataRecord(){    //csv is string
        return this.ID+ ", " +this.name+ ", " +this.description+ ", " +this.cost;
    }


}