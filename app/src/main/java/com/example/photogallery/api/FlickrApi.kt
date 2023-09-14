package com.example.photogallery.api

import retrofit2.http.GET

private const val API_KEY = "73884025c7954ba9b7461d415734d600"
interface FlickrApi {
    @GET("services/rest/?method=flickr.interestingness.getList" +
        "&api_key=$API_KEY" +
        "&format=json" +
        "&nojsoncallback=1" +
        "&extras=url_s"
    )
    suspend fun fetchPhotos(): FlickrResponse
}
