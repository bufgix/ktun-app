package com.app.ktun.ktunhome.Model;

public class Duyuru {
    int ID;
    String BASLIK;

    String YAYINTARIHIBAS;
    String YAYINTARIHIBIT;
    String KAYITTARIHI;
    String FOTOPATH;
    String ANAHTARKELIMELER;
    String KISAICERIK;
    String ICERIK;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getBASLIK() {
        return BASLIK;
    }

    public void setBASLIK(String BASLIK) {
        this.BASLIK = BASLIK;
    }

    public String getKISAICERIK() {
        return KISAICERIK;
    }

    public void setKISAICERIK(String KISAICERIK) {
        this.KISAICERIK = KISAICERIK;
    }

    public String getICERIK() {
        return ICERIK;
    }

    public void setICERIK(String ICERIK) {
        this.ICERIK = ICERIK;
    }


    public String getYAYINTARIHIBAS() {
        return YAYINTARIHIBAS;
    }

    public void setYAYINTARIHIBAS(String YAYINTARIHIBAS) {
        this.YAYINTARIHIBAS = YAYINTARIHIBAS;
    }

    public String getYAYINTARIHIBIT() {
        return YAYINTARIHIBIT;
    }

    public void setYAYINTARIHIBIT(String YAYINTARIHIBIT) {
        this.YAYINTARIHIBIT = YAYINTARIHIBIT;
    }

    public String getKAYITTARIHI() {
        return KAYITTARIHI;
    }

    public void setKAYITTARIHI(String KAYITTARIHI) {
        this.KAYITTARIHI = KAYITTARIHI;
    }

    public String getFOTOPATH() {
        return FOTOPATH;
    }

    public void setFOTOPATH(String FOTOPATH) {
        this.FOTOPATH = FOTOPATH;
    }

    public String getANAHTARKELIMELER() {
        return ANAHTARKELIMELER;
    }

    public void setANAHTARKELIMELER(String ANAHTARKELIMELER) {
        this.ANAHTARKELIMELER = ANAHTARKELIMELER;
    }
}
