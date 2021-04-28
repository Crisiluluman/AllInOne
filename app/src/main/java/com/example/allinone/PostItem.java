package com.example.allinone;

public class PostItem {

    private String postItemName;
    private int postItemIconId;

    public PostItem(String postItemName, int postItemIconId) {
        this.postItemName = postItemName;
        this.postItemIconId = postItemIconId;
    }

    public int getPostItemIconId() {
        return postItemIconId;
    }

    public String getPostItemName() {
        return postItemName;
    }


}
