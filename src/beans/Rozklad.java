package beans;

public class Rozklad {
    private int Kod;
    private String DayOfWeek;
    private int Para;
    private int Grupa;
    private int Vikladach;
    private int Predmet;
    private int Auditoria;
    private int Week;

    public int getKod() {
        return Kod;
    }

    public void setKod(int kod) {
        this.Kod = kod;
    }

    public String getDayOfWeek() {
        return DayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        DayOfWeek = dayOfWeek;
    }

    public int getGrupa() {
        return Grupa;
    }

    public void setGrupa(int grupa) {
        Grupa = grupa;
    }

    public int getVikladach() {
        return Vikladach;
    }

    public void setVikladach(int vikladach) {
        Vikladach = vikladach;
    }

    public int getPredmet() {
        return Predmet;
    }

    public void setPredmet(int predmet) {
        Predmet = predmet;
    }

    public int getAuditoria() {
        return Auditoria;
    }

    public void setAuditoria(int auditoria) {
        Auditoria = auditoria;
    }

    public int getWeek() {
        return Week;
    }

    public void setWeek(int week) {
        Week = week;
    }

    public int getPara() {
        return Para;
    }

    public void setPara(int para) {
        Para = para;
    }
}
