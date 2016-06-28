package com.laialechma.PetagramAvanzado.restApi;

import com.laialechma.PetagramAvanzado.restApi.model.ContactoResponse;
import com.laialechma.PetagramAvanzado.restApi.model.FollowedResponse;
import com.laialechma.PetagramAvanzado.restApi.model.PerfilResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Laia Lechma on 26/06/2016.
 */
public interface EndpointsApi {

    @GET(ConstantesRestApi.URL_GET_RECENT_MEDIA_USER)
    Call<ContactoResponse> getRecentMedia();

    @GET(ConstantesRestApi.URL_GET_FOLLOWEDBY)
    Call<FollowedResponse> getFollowedBy();

    @GET(ConstantesRestApi.URL_GET_RECENT_MEDIA_OTHER)
    Call<PerfilResponse> getRecentMediaOtherPerfil(@Path("id") String id);
}
