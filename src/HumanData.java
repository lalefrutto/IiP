public class HumanData {

    private char gender;
    private byte plural;
    private byte age;
    private String race;
    private byte parity;
    private boolean married;
    private short bwt;
    private byte smokeN;
    private byte drinkN;
    private boolean firstep;
    private boolean welfare;
    private String smoker;
    private boolean drinker;
    private short wpre;
    private short wgain;
    private byte education;
    private byte gestation;

    public HumanData(String gender, String plural, String age, String race, String parity, String married, String bwt, String smokeN, String drinkN, String firstep, String welfare, String smoker, String drinker, String wpre, String wgain, String education, String gestation) {
        this.gender = gender.charAt(0);
        this.plural = Byte.parseByte(plural);
        this.age = Byte.parseByte(age);
        this.race = race;
        this.parity = Byte.parseByte(parity);
        this.married = Boolean.parseBoolean(married);
        this.bwt = Short.parseShort(bwt);
        this.smokeN = Byte.parseByte(smokeN);
        this.drinkN = Byte.parseByte(drinkN);
        this.firstep = Boolean.parseBoolean(firstep);
        this.welfare = Boolean.parseBoolean(welfare);
        this.smoker = smoker;
        this.drinker = Boolean.parseBoolean(drinker);
        this.wpre = Short.parseShort(wpre);
        this.wgain = Short.parseShort(wgain);
        this.education = Byte.parseByte(education);
        this.gestation = Byte.parseByte(gestation);
    }

    public char getGender() {
        return gender;
    }

    public byte getPlural() {
        return plural;
    }

    public byte getAge() {
        return age;
    }

    public String getRace() {
        return race;
    }

    public byte getParity() {
        return parity;
    }

    public boolean getMarried() {
        return married;
    }

    public double getBwt() {
        return bwt;
    }

    public byte getSmokeN() {
        return smokeN;
    }

    public byte getDrinkN() {
        return drinkN;
    }

    public boolean getFirstep() {
        return firstep;
    }

    public boolean getWelfare() {
        return welfare;
    }

    public String getSmoker() {
        return smoker;
    }

    public boolean getDrinker() {
        return drinker;
    }

    public short getWpre() {
        return wpre;
    }

    public short getWgain() {
        return wgain;
    }

    public byte getEducation() {
        return education;
    }

    public int getGestation() {
        return gestation;
    }


}
