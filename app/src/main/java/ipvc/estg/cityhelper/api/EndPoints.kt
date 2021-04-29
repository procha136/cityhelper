package ipvc.estg.cityhelper.api

import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface EndPoints {

    @FormUrlEncoded
    @POST("checklogin")
    fun checkLogin(
        @Field("email") email: String,
        @Field("password") password: String?): Call<LoginResponse>

}