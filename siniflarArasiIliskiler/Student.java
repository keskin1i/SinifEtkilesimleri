package siniflarArasiIliskiler;

public class Student {
    private String name;
    private String surName;
    private String stNo;
    private String adress;
    private int note;


    public Student(String name, String surName, String stNo, String adress, int note) {
        this.name = name;
        this.surName = surName;
        this.stNo = stNo;
        this.adress = adress;
        if (note<0||100<note){
            note=0;
        }
        this.note=note;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getStNo() {
        return this.stNo;
    }

    public void setStNo(String stNo) {
        this.stNo = stNo;
    }

    public String getAdress() {
        return this.adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        if (note<0||100<note){
            note=0;
        }
        this.note = note;
    }
}
