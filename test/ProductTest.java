import org.junit.Test;

import static org.junit.Assert.*;

public class ProductTest {
    Product Pr1 = new Product("000001", "Pipeweed", "Long Bottom Leaf", 600.0);
    Product Pr2 = new Product("000002", "Lembas", "Elven Wayfare Bread", 200.0);
    Product Pr3 = new Product("000003", "Wine", "Woodland Elf Wine", 400.0);
    Product Pr4 = new Product("000004", "Mushrooms","Farme Took's Finest", 125.0);
    Product Pr5 = new Product("000005", "Mithril", "Enchanted Dwarven Armor", 300);


    @Test
    public void getName() {
        assertEquals("Pipeweed", Pr1.getName());
    }

    @Test
    public void setName() {
        Pr1.setName("Pippeweed");
        assertEquals("Pippeweed", Pr1.getName());
    }

    @Test
    public void getDescription() {
        assertEquals("Long Bottom Leaf", Pr1.getDescription());
    }

    @Test
    public void setDescription() {
        Pr1.setDescription("Long Bottom Leaf");
        assertEquals("Long Bottom Leaf", Pr1.getDescription());
    }

    @Test
    public void getID() {
        assertEquals("000001", Pr1.getID());
    }

    @Test
    public void setID() {
        Pr1.setID("000001");
        assertEquals("000001", Pr1.getID());
    }

    @Test
    public void getCost() {
        assertEquals(600.0, Pr1.getCost(), 0);
    }

    @Test
    public void setCost() {
        Pr1.setCost(600.0);
        assertEquals(600.0, Pr1.getCost(), 0);

    }

}