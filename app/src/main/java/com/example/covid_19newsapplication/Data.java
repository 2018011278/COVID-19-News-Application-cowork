package com.example.covid_19newsapplication;

public class Data {
    private  String newsTitle;
    private  String newsContent;
    public Data(){}
    public Data(String newsTitle, String newsContent){
        this.newsTitle = newsTitle;
        this.newsContent = newsContent;
    }
    public String getNewsTitle(){
        return newsTitle;
    }
    public String getNewsContent(){
        return newsContent;
    }
    public void setNewsTitle(String newsTitle){
        this.newsTitle = newsTitle;
    }
    public void setNewsContent(String newsContent){
        this.newsContent = newsContent;
    }
}
