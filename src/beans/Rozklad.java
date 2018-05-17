package beans;

public class Rozklad {
    private int Kod;
    private String DayOfWeek;
    private int Para;
    private String Grupa;
    private String Vikladach;
    private String Predmet;
    private int Auditoria;
    private int Week;

    public Rozklad( String dayOfWeek, int para, String grupa, String vikladach, String predmet, int auditoria, int week) {
        this.DayOfWeek = dayOfWeek;
        this.Para = para;
        this.Grupa = grupa;
        this.Vikladach = vikladach;
        this.Predmet = predmet;
        this.Auditoria = auditoria;
        this.Week = week;
    }

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

    public String getGrupa() {
        return Grupa;
    }

    public void setGrupa(String grupa) {
        Grupa = grupa;
    }

    public String getVikladach() {
        return Vikladach;
    }

    public void setVikladach(String vikladach) {
        Vikladach = vikladach;
    }

    public String getPredmet() {
        return Predmet;
    }

    public void setPredmet(String predmet) {
        Predmet = predmet;
    }


    public int getAuditoria() {
        return Auditoria;
    }

    public void setAuditoria(int auditoria) {
        Auditoria = auditoria;
    }
}
