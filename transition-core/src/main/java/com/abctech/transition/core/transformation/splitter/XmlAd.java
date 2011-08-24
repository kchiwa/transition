package com.abctech.transition.core.transformation.splitter;

import org.w3c.dom.Document;

import java.util.ArrayList;
import java.util.List;

public class XmlAd {
    private String ad;
    private String adType;
    private List<String> bodyList = new ArrayList<String>();
    private List<String> legList = new ArrayList<String>();
    private List<Document> skeletonList = new ArrayList<Document>();
    private List<String> finishedGoods = new ArrayList<String>();

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getAdType() {
        return adType;
    }

    public void setAdType(String adType) {
        this.adType = adType;
    }

    public List<String> getBodyList() {
        return bodyList;
    }

    public void setBodyList(List<String> bodyList) {
        this.bodyList = bodyList;
    }

    public List<String> getLegList() {
        return legList;
    }

    public void setLegList(List<String> legList) {
        this.legList = legList;
    }

    public List<Document> getSkeletonList() {
        return skeletonList;
    }

    public void setSkeletonList(List<Document> skeletonList) {
        this.skeletonList = skeletonList;
    }

    public List<String> getFinishedGoods() {
        return finishedGoods;
    }

    public void setFinishedGoods(List<String> finishedGoods) {
        this.finishedGoods = finishedGoods;
    }
}
