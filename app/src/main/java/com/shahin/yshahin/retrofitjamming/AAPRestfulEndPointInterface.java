package com.shahin.yshahin.retrofitjamming;

import com.shahin.yshahin.retrofitjamming.Entities.CommentsScheme;
import com.shahin.yshahin.retrofitjamming.Entities.InvitationsContainer;
import com.shahin.yshahin.retrofitjamming.Entities.JSONScheme;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by y.shahin on 1/3/2017.
 */

public interface AAPRestfulEndPointInterface {

    @GET("GetListInvititionFiltered")
    Call<InvitationsContainer> GetListInvititionFiltered(@Query("StartPage") String StartPage,
                                                         @Query("userID") String userID,
                                                         @Query("subject") String subject,
                                                         @Query("customerName") String customerName,
                                                         @Query("country") String country,
                                                         @Query("invitationType") String invitationType,
                                                         @Query("productGroup") String productGroup,
                                                         @Query("companyGroup") String companyGroup,
                                                         @Query("marketingEngineer") String marketingEngineer,
                                                         @Query("proposalEngineer") String proposalEngineer,
                                                         @Query("fromDate") String fromDate,
                                                         @Query("toDate") String toDate,
                                                         @Query("closingDate") String closingDate,
                                                         @Query("sDataSourse") String sDataSourse,
                                                         @Query("sCatalog") String sCatalog);

    // Request method and URL specified in the annotation
    // Callback for the parsed response is the last parameter

    @GET("comments/")
    Call<List<CommentsScheme>> getAllComments();

    @GET("comments/{id}")
    Call<CommentsScheme> getCommentByID(@Path("id") int postID);

    @GET("comments")
    Call<List<CommentsScheme>> getCommentsByPost(@Query("postId") int postID);

    /**
     * AAP Methods
     *
     */

    @POST("getListInvitation")//?startPage={startPage}&userId={userId}&dataSource={dataSource}&sCatalog={sCatalog}
    Call<InvitationsContainer> getListInvitation(@Query("startPage") String startPage,
                                                 @Query("userId") String userId,
                                                 @Query("dataSource") String dataSource,
                                                 @Query("sCatalog") String sCatalog);

    @POST("CheckUserLogin/{UserName}/{Password}/{sDataSourse}/{sCatalog}")
    public void CheckUserLogin (@Body JSONScheme request
            , Callback<JSONScheme> response);



    @POST("saveInvitationSeen/{userID}/{invitationID}/{sDataSourse}/{sCatalog}")
    public void saveInvitationSeen(@Body JSONScheme request
            , Callback<JSONScheme> response);

    @POST("GetListInvititionData/{StartPage}/{userID}/{sDataSourse}/{sCatalog}")
    public void GetListInvititionData(@Body JSONScheme request
            , Callback<JSONScheme> response);

    @POST("GetListEmail/{StartPage}/{username}/{invitationID}/{sDataSourse}/{sCatalog}")
    public void GetListEmail(@Body JSONScheme request
            , Callback<JSONScheme> response);

    @POST("GetListEmailFiltered/{StartPage}/{username}/{invitationID}/{fromDate}/{toDate}/{sender}/{cc}/{subject}/{body}/{correspondenceType}/{sDataSourse}/{sCatalog}")
    public void GetListEmailFiltered(@Body JSONScheme request
            , Callback<JSONScheme> response);

    @POST("GetListVisit/{UserName}/{StartPage}/{VisitType}/{invitationID}/{sDataSourse}/{sCatalog}")
    public void GetListVisit(@Body JSONScheme request
            , Callback<JSONScheme> response);

    @POST("GetListVisitFiltered/{UserName}/{StartPage}/{VisitType}/{invitationID}/{activityName}/{assignedTo}/{caseReference}/{activityStatus}/{startingDate}/{sDataSourse}/{sCatalog}")
    public void GetListVisitFiltered(@Body JSONScheme request
            , Callback<JSONScheme> response);

    @POST("GetListVisitDisc/{Appoitmant_ID}/{Activity_ID}/{sDataSourse}/{sCatalog}")
    public void GetListVisitDisc(@Body JSONScheme request
            , Callback<JSONScheme> response);

    @POST("getListrelated_cases/{activity_id}/{sDataSourse}/{sCatalog}")
    public void getListrelated_cases(@Body JSONScheme request
            , Callback<JSONScheme> response);

    @POST("update_app_disc/{appid}/{recommendation}/{result}/{new_info}/{sDataSourse}/{sCatalog}")
    public void update_app_disc(@Body JSONScheme request
            , Callback<JSONScheme> response);

    @POST("update_case/{caseid}/{activity_id}/{ac_case_id}/{chance}/{recommendation}/{new_info}/{userid}/{computer_name}/{sDataSourse}/{sCatalog}")
    public void update_case(@Body JSONScheme request
            , Callback<JSONScheme> response);

    @POST("Retrive_Invitaion_byid/{invitationid}/{sDataSourse}/{sCatalog}")
    public void Retrive_Invitaion_byid(@Body JSONScheme request
            , Callback<JSONScheme> response);
    @POST("Retrive_Invitaion_byid_details/{invitationid}/{sDataSourse}/{sCatalog}")
    public void Retrive_Invitaion_byid_details(@Body JSONScheme request
            , Callback<JSONScheme> response);

    @POST("Retreive_Email_By_Email_ID/{email_id}/{sDataSourse}/{sCatalog}")
    public void Retreive_Email_By_Email_ID(@Body JSONScheme request
            , Callback<JSONScheme> response);

    @POST("Return_path_attachment/{filename}/{ci_item}/{correspondances_path}/{online_path}")
    public void Return_path_attachment(@Body JSONScheme request
            , Callback<JSONScheme> response);

    @POST("Return_path_invitation_attachment/{filename}/{filePath}/{attachment_path}/{shared_path}/{port_number}")
    public void Return_path_invitation_attachment(@Body JSONScheme request
            , Callback<JSONScheme> response);

    @POST("delete_file/{filename}")
    public void delete_file(@Body JSONScheme request
            , Callback<JSONScheme> response);

    @POST("delete_file_from_path/{filename}/{filepath}")
    public void delete_file_from_path(@Body JSONScheme request
            , Callback<JSONScheme> response);

    @POST("delete_case/{caseid}/{userid}/{computer_name}/{sDataSourse}/{sCatalog}")
    public void delete_case(@Body JSONScheme request
            , Callback<JSONScheme> response);

    @POST("getrelated_cases_info/{case_id}/{sDataSourse}/{sCatalog}")
    public void getrelated_cases_info(@Body JSONScheme request
            , Callback<JSONScheme> response);

    @POST("sendemail/{data}")
    public void sendemail(@Body JSONScheme request
            , Callback<JSONScheme> response);

    @POST("getcases/{StartPage}/{sDataSourse}/{sCatalog}")
    public void getcases(@Body JSONScheme request
            , Callback<JSONScheme> response);

    @POST("searchForCases/{StartPage}/{caseRef}/{sDataSourse}/{sCatalog}")
    public void searchForCases(@Body JSONScheme request
            , Callback<JSONScheme> response);

    @POST("saveNotificationsRegistration/{user_id}/{user_name}/{gcm_email}/{gcm_reg_id}/{sDataSourse}/{sCatalog}")
    public void saveNotificationsRegistration(@Body JSONScheme request
            , Callback<JSONScheme> response);

    @POST("saveDeviceLocation/{userID}/{longitude}/{latitude}/{deviceName}/{sDataSourse}/{sCatalog}")
    public void saveDeviceLocation(@Body JSONScheme request
            , Callback<JSONScheme> response);

    @POST("getAllDevicesUsersLocation/{sDataSourse}/{sCatalog}")
    public void getAllDevicesUsersLocation(@Body JSONScheme request
            , Callback<JSONScheme> response);

    @POST("getDeviceUserLocation/{userID}/{sDataSourse}/{sCatalog}")
    public void getDeviceUserLocation(@Body JSONScheme request
            , Callback<JSONScheme> response);

    @POST("GetListInvitationAttachments/{invitationID}/{userID}/{sDataSourse}/{sCatalog}")
    public void GetListInvitationAttachments(@Body JSONScheme request
            , Callback<JSONScheme> response);

    @POST("GetEmailBodyFromCorrespondences/{which}/{ci_item}/{correspondences_path}")
    public void GetEmailBodyFromCorrespondences(@Body JSONScheme request
            , Callback<JSONScheme> response);

    @POST("getAutoCompleteEngineers/{which}/{sDataSourse}/{sCatalog}")
    public void getAutoCompleteEngineers(@Body JSONScheme request
            , Callback<JSONScheme> response);

    @POST("GetListEmailClassified/{StartPage}/{username}/{invitationID}/{sDataSourse}/{sCatalog}")
    public void GetListEmailClassified(@Body JSONScheme request
            , Callback<JSONScheme> response);

    @POST("GetListEmailFilteredClassified/{StartPage}/{username}/{invitationID}/{fromDate}/{toDate}/{sender}/{cc}/{subject}/{body}/{correspondenceType}/{sDataSourse}/{sCatalog}")
    public void GetListEmailFilteredClassified(@Body JSONScheme request
            , Callback<JSONScheme> response);
    @POST("SaveMobileAppointment/{subject}/{category}/{visitType}/{status}/{privacy}/{priority}/{recommendation}/{newInformation}/{result}/{ownderID}/{assignedTo}/{estimateStart}/{estimateEnd}/{sCase}/{userID}/{sDataSourse}/{sCatalog}")
    public void SaveMobileAppointment(@Body JSONScheme request
            , Callback<JSONScheme> response);

    @POST("UpdateAppointmentStatus/{appointmentID}/{status}/{userID}/{sDataSourse}/{sCatalog}")
    public void UpdateAppointmentStatus(@Body JSONScheme request
            , Callback<JSONScheme> response);

    @POST("GetBranches/{sDataSourse}/{sCatalog}")
    public void GetBranches(@Body JSONScheme request
            , Callback<JSONScheme> response);

    @POST("GetUsers/{sDataSourse}/{sCatalog}")
    public void GetUsers(@Body JSONScheme request
            , Callback<JSONScheme> response);

}
