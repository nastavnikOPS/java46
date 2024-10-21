package lesson9;

public abstract class Rastenie {
    private int avarageAge;
    private String sposobPoliva;

    public int getAvarageAge() {
        return avarageAge;
    }

    public void setAvarageAge(int avarageAge) {
        this.avarageAge = avarageAge;
    }

    public String getSposobPoliva() {
        return sposobPoliva;
    }

    public void setSposobPoliva(String sposobPoliva) {
        this.sposobPoliva = sposobPoliva;
    }
    public abstract void printInfo();

}