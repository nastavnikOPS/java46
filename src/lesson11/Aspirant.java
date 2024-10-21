package lesson11;

public class Aspirant extends Student{
    private String scientificWork;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String scientificWork) {
        super(firstName, lastName, group, averageMark);
        this.scientificWork = scientificWork;
    }

    public String getScientificWork() {
        return scientificWork;
    }

    public void setScientificWork(String scientificWork) {
        this.scientificWork = scientificWork;
    }

    @Override
    public double getScholarship() {
        if (super.getAverageMark() == 5.0){
            return 2500;
        }else {
            return 2200;
        }
    }

    @Override
    public String toString() {
        return "Aspirant{" +
                "firstName = '" + getFirstName() + '\'' +
                ", lastName = '" + getLastName() + '\'' +
                ", group = '" + getGroup() + '\'' +
                ", averageMark = " + getAverageMark() + '\'' +
                ", scientificWork = '" + scientificWork + '\'' +
                '}';
    }
}
