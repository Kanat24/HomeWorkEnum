package racing;

public class Sponsor {
    private String nameSponsor;
    private int summa;


    public String getNameSponsor() {
        return nameSponsor;
    }

    public Sponsor(String nameSponsor, int summa) {
        this.nameSponsor = nameSponsor;
        this.summa = summa;
    }

    public void setNameSponsor(String nameSponsor) {
        this.nameSponsor = nameSponsor;
    }

    public int getSumma() {
        return summa;
    }

    public void setSumma(int summa) {
        this.summa = summa;
    }
    public void sponsorRace(){
        System.out.println("Спонсор "+ getNameSponsor()+" проспонсировал на " + getSumma());
    }

    @Override
    public String toString() {
        return "Sponsor{" +
                "nameSponsor='" + nameSponsor + '\'' +
                ", summa=" + summa +
                '}';
    }
}
