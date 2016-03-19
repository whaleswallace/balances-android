package in.iamkelv.balances.services;

import in.iamkelv.balances.models.AccountResponse;
import in.iamkelv.balances.models.AuthResponse;
import in.iamkelv.balances.models.Balances;
import in.iamkelv.balances.models.BalancesResponse;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface ApiEndpointInterface {

    @FormUrlEncoded
    @Headers("Content-Type: application/x-www-form-urlencoded")
    @POST("auth")
    Call<AuthResponse> authUser(@Field("username") String username, @Field("password") String password);

    @FormUrlEncoded
    @Headers("Content-Type: application/x-www-form-urlencoded")
    @POST("balances")
    Call<BalancesResponse> checkBalances(@Field("username") String username, @Field("password") String password);

    @FormUrlEncoded
    @Headers("Content-Type: application/x-www-form-urlencoded")
    @POST("all")
    Call<AccountResponse> checkBalancesAndPurchases(@Field("username") String username, @Field("password") String password);

}
