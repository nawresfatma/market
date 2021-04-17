package com.example.market;

public class MoresellersList {
    private String MoreSellname;
    private String Moreselllocation;
    private String Moresellerdesc;
    private String MoresellerImg;

    public MoresellersList() {
    }

    public MoresellersList(String moreSellname, String moreselllocation, String moresellerdesc, String moresellerImg) {
        MoreSellname = moreSellname;
        Moreselllocation = moreselllocation;
        Moresellerdesc = moresellerdesc;
        MoresellerImg = moresellerImg;
    }


    public String getMoreSellname() {
        return MoreSellname;
    }

    public void setMoreSellname(String moreSellname) {
        MoreSellname = moreSellname;
    }

    public String getMoreselllocation() {
        return Moreselllocation;
    }

    public void setMoreselllocation(String moreselllocation) {
        Moreselllocation = moreselllocation;
    }

    public String getMoresellerdesc() {
        return Moresellerdesc;
    }

    public void setMoresellerdesc(String moresellerdesc) {
        Moresellerdesc = moresellerdesc;
    }

    public String getMoresellerImg() {
        return MoresellerImg;
    }

    public void setMoresellerImg(String moresellerImg) {
        MoresellerImg = moresellerImg;
    }
}
