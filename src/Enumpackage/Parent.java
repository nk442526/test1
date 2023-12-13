package Enumpackage;

public enum Parent{
    HDFC("hdfc", 10, true);

    private String val;
    private int id;
    private Boolean isActive;

    public void setVal(String val) {
        this.val = val;
    }
    public String getVal() {
        return val;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    //constructor of enum is by default private
    Parent(String val, int id, Boolean isActive){

        this.val = val;
        this.id = id;
        this.isActive = isActive;
    }
}
