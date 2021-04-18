package com.example.market;

public class MoresellersList {
    private String moreSellname;
    private String moreSelllocation;
    private String MoreSellerDesc;
    private String moreSellerImg;

    public MoresellersList() {
    }

    public MoresellersList(String moreSellname, String moreSelllocation, String moreSellerDesc, String moreSellerImg) {
        this.moreSellname = moreSellname;
        this.moreSelllocation = moreSelllocation;
        MoreSellerDesc = moreSellerDesc;
        this.moreSellerImg = moreSellerImg;
    }

    public String getMoreSellname() {
        return moreSellname;
    }

    public void setMoreSellname(String moreSellname) {
        this.moreSellname = moreSellname;
    }

    public String getMoreSelllocation() {
        return moreSelllocation;
    }

    public void setMoreSelllocation(String moreSelllocation) {
        this.moreSelllocation = moreSelllocation;
    }

    public String getMoreSellerDesc() {
        return MoreSellerDesc;
    }

    public void setMoreSellerDesc(String moreSellerDesc) {
        MoreSellerDesc = moreSellerDesc;
    }

    public String getMoreSellerImg() {
        return moreSellerImg;
    }

    public void setMoreSellerImg(String moreSellerImg) {
        this.moreSellerImg = moreSellerImg;
    }
}
