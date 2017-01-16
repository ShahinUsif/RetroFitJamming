package com.shahin.yshahin.retrofitjamming.Entities;

/**
 * Created by y.shahin on 1/7/2017.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ListInvititionEntity {

    @SerializedName("BranchName")
    @Expose
    private String branchName;
    @SerializedName("ClientName")
    @Expose
    private String clientName;
    @SerializedName("Co_name")
    @Expose
    private String coName;
    @SerializedName("Countvalue")
    @Expose
    private Integer countvalue;
    @SerializedName("DocumentID")
    @Expose
    private Integer documentID;
    @SerializedName("DocumentName")
    @Expose
    private String documentName;
    @SerializedName("DocumentPath_Mobile")
    @Expose
    private String documentPathMobile;
    @SerializedName("Has_document")
    @Expose
    private Integer hasDocument;
    @SerializedName("In_date")
    @Expose
    private String inDate;
    @SerializedName("In_invitation_id")
    @Expose
    private String inInvitationId;
    @SerializedName("IsSeen")
    @Expose
    private Integer isSeen;
    @SerializedName("ProductGroup")
    @Expose
    private String productGroup;
    @SerializedName("Stage")
    @Expose
    private String stage;
    @SerializedName("Subject")
    @Expose
    private String subject;
    @SerializedName("Type")
    @Expose
    private String type;

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public ListInvititionEntity withBranchName(String branchName) {
        this.branchName = branchName;
        return this;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public ListInvititionEntity withClientName(String clientName) {
        this.clientName = clientName;
        return this;
    }

    public String getCoName() {
        return coName;
    }

    public void setCoName(String coName) {
        this.coName = coName;
    }

    public ListInvititionEntity withCoName(String coName) {
        this.coName = coName;
        return this;
    }

    public Integer getCountvalue() {
        return countvalue;
    }

    public void setCountvalue(Integer countvalue) {
        this.countvalue = countvalue;
    }

    public ListInvititionEntity withCountvalue(Integer countvalue) {
        this.countvalue = countvalue;
        return this;
    }

    public Integer getDocumentID() {
        return documentID;
    }

    public void setDocumentID(Integer documentID) {
        this.documentID = documentID;
    }

    public ListInvititionEntity withDocumentID(Integer documentID) {
        this.documentID = documentID;
        return this;
    }

    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    public ListInvititionEntity withDocumentName(String documentName) {
        this.documentName = documentName;
        return this;
    }

    public String getDocumentPathMobile() {
        return documentPathMobile;
    }

    public void setDocumentPathMobile(String documentPathMobile) {
        this.documentPathMobile = documentPathMobile;
    }

    public ListInvititionEntity withDocumentPathMobile(String documentPathMobile) {
        this.documentPathMobile = documentPathMobile;
        return this;
    }

    public Integer getHasDocument() {
        return hasDocument;
    }

    public void setHasDocument(Integer hasDocument) {
        this.hasDocument = hasDocument;
    }

    public ListInvititionEntity withHasDocument(Integer hasDocument) {
        this.hasDocument = hasDocument;
        return this;
    }

    public String getInDate() {
        return inDate;
    }

    public void setInDate(String inDate) {
        this.inDate = inDate;
    }

    public ListInvititionEntity withInDate(String inDate) {
        this.inDate = inDate;
        return this;
    }

    public String getInInvitationId() {
        return inInvitationId;
    }

    public void setInInvitationId(String inInvitationId) {
        this.inInvitationId = inInvitationId;
    }

    public ListInvititionEntity withInInvitationId(String inInvitationId) {
        this.inInvitationId = inInvitationId;
        return this;
    }

    public Integer getIsSeen() {
        return isSeen;
    }

    public void setIsSeen(Integer isSeen) {
        this.isSeen = isSeen;
    }

    public ListInvititionEntity withIsSeen(Integer isSeen) {
        this.isSeen = isSeen;
        return this;
    }

    public String getProductGroup() {
        return productGroup;
    }

    public void setProductGroup(String productGroup) {
        this.productGroup = productGroup;
    }

    public ListInvititionEntity withProductGroup(String productGroup) {
        this.productGroup = productGroup;
        return this;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public ListInvititionEntity withStage(String stage) {
        this.stage = stage;
        return this;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public ListInvititionEntity withSubject(String subject) {
        this.subject = subject;
        return this;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ListInvititionEntity withType(String type) {
        this.type = type;
        return this;
    }

    @Override
    public String toString() {
        String invitationData = String.format("Invitation : \n %s \n %s \n %s \n %s \n %s \n %s \n ", subject, type, stage, (isSeen==1?"Seen":"Not Seen"), inDate, documentPathMobile);

        return invitationData;
    }
}