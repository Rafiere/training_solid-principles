package dev.piccodev.CC_liskovsubstitutionprinciple.problem;

public class Item {

    private Integer id;
    private Integer quantity;
    private String description;
    private boolean packaged;

    public boolean inStock() {
        return quantity > 0;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isPackaged() {
        return packaged;
    }

    public void setPackaged(boolean packaged) {
        this.packaged = packaged;
    }
}
