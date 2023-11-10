package siniflarArasiIliskiler;

public class Instructer {
    private String name;
    private String codet;
    private String department;

    public Instructer(String name, String codet, String department) {
        this.name = name;
        this.codet = codet;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCodet() {
        return codet;
    }

    public void setCodet(String codet) {
        this.codet = codet;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
