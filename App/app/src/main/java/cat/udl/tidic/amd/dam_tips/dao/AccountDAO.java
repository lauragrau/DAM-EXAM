package cat.udl.tidic.amd.dam_tips.dao;



import com.google.gson.JsonObject;

import cat.udl.tidic.amd.dam_tips.models.Question;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface AccountDAO {

    @POST("account/create_token")
    Call<JsonObject> createTokenUser();

    @POST("account/delete_token")
    Call<Void> deleteTokenUser(@Body JsonObject token);


   /* @POST("/trivial/question/add")
      Call<Void> addQuestion(@Body Question question);*/

}
