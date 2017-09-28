package com.example.areetaw.reportcard;
public class ReportCard {

    @Override
    public String toString() {
        return "Name: John Doe; APCS Grade: " + apcsGrade + "; Peer Tutoring Grade: "
                + ptGrade + "; Chemistry Grade: " + chemGrade + "; AP Government Grade: "
                + apgovGrade + "; AP Psychology Grade: " + appsychGrade;
    }

    private String apcsGrade;
    private String ptGrade;
    private String chemGrade;
    private String apgovGrade;
    private String appsychGrade;

    public ReportCard(String apcs, String pt, String chem, String apgov, String appsych) {
        this.apcsGrade = apcs;
        this.ptGrade = pt;
        this.chemGrade = chem;
        this.apgovGrade = apgov;
        this.appsychGrade = appsych;
    }

    public String getapcs() {
        return apcsGrade;
    }

    public void setApcsGrade(String apcs){
        this.apcsGrade = apcs;
    }

    public String getpt() {
        return ptGrade;
    }

    public void setPtGrade(String pt){
        this.ptGrade = pt;
    }

    public String getchem() {
        return chemGrade;
    }

    public void setChem(String chem){
        this.chemGrade = chem;
    }

    public String getapgov() {
        return apgovGrade;
    }

    public void setApgov(String apgov){
        this.apgovGrade = apgov;
    }

    public String getappsych() {
        return appsychGrade;
    }

    public void setAppsychGrade(String appsych){
        this.appsychGrade = appsych;
    }
}
