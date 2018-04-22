package beans;

public class Groups {
    private int Kod;
    private String Nazva;
    private int	Specialnist;

    public int getKod() {
        return Kod;
    }

    public void setKod(int kod) {
        this.Kod = kod;
    }

    public String getNazva() {
        return Nazva;
    }

    public void setNazva(String nazva) {
        Nazva = nazva;
    }

    public int getSpecialnist() {
        return Specialnist;
    }

    public void setSpecialnist(int specialnist) {
        Specialnist = specialnist;
    }
}
