package com.sict.recycleviewgiuaky.Data;
public class DataSong {
    private int imgitem;
    private String namesong;
    private String namesing;
    public DataSong(int imgitem, String namesong, String namesing) {
        this.imgitem = imgitem;
        this.namesong = namesong;
        this.namesing = namesing;
    }

    public int getImgitem() {
        return imgitem;
    }

    public void setImgitem(int imgitem) {
        this.imgitem = imgitem;
    }

    public String getNamesong() {
        return namesong;
    }

    public void setNamesong(String namesong) {
        this.namesong = namesong;
    }

    public String getNamesing() {
        return namesing;
    }

    public void setNamesing(String namesing) {
        this.namesing = namesing;
    }
}
