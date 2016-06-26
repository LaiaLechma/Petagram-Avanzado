package com.laialechma.PetagramAvanzado.restApi;

/**
 * Created by Laia Lechma on 26/06/2016.
 */
public final class ConstantesRestApi {
    //https://api.instagram.com/v1/users/3440942386/?access_token=3439765745.50b0ada.92b095037f0b492a84bf22c84e64ce2a
    public static final String VERSION = "/v1/";
    public static final String ROOT_URL = "https://api.instagram.com" + VERSION;
    public static final String ACCESS_TOKEN = "3439765745.50b0ada.92b095037f0b492a84bf22c84e64ce2a";
    public static final String KEY_ACCESS_TOKEN = "?access_token=";
    public static final String KEY_GET_RECENT_MEDIA_USER = "users/self/media/recent/";
    public static final String URL_GET_RECENT_MEDIA_USER = KEY_GET_RECENT_MEDIA_USER + KEY_ACCESS_TOKEN + ACCESS_TOKEN;

}
