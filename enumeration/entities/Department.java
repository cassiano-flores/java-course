package enumeration.entities;

//class Department represents a Worker association
public class Department {
    
    private String name;

    public Department() {
    }

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //when a worker.getDepartment() is used, dont need to code worker.getDepartment().getName(), because this class already have a toString
    @Override
    public String toString() {
        return name;
    }
}