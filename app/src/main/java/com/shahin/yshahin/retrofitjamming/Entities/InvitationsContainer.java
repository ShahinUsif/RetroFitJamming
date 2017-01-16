package com.shahin.yshahin.retrofitjamming.Entities;

/**
 * Created by y.shahin on 1/7/2017.
 */


import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class InvitationsContainer {

    @SerializedName("ListInvititionEntity")
    @Expose
    private List<ListInvititionEntity> listInvititionEntity = null;
    @SerializedName("PagesCount")
    @Expose
    private String pagesCount;

    public List<ListInvititionEntity> getListInvititionEntity() {
        return listInvititionEntity;
    }

    public void setListInvititionEntity(List<ListInvititionEntity> listInvititionEntity) {
        this.listInvititionEntity = listInvititionEntity;
    }

    public InvitationsContainer withListInvititionEntity(List<ListInvititionEntity> listInvititionEntity) {
        this.listInvititionEntity = listInvititionEntity;
        return this;
    }

    public String getPagesCount() {
        return pagesCount;
    }

    public void setPagesCount(String pagesCount) {
        this.pagesCount = pagesCount;
    }

    public InvitationsContainer withPagesCount(String pagesCount) {
        this.pagesCount = pagesCount;
        return this;
    }

    @Override
    public String toString() {
        String invitationsData = "";
        for(ListInvititionEntity li : listInvititionEntity) {
            invitationsData += li.toString() + "\n";
        }

        return invitationsData;
    }
}