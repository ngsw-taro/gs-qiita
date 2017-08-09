package com.example.gsqiita.client

import com.example.gsqiita.model.Article
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface ArticleClient {

    @GET("/api/v2/items")
    fun search(@Query("query") query: String): Single<List<Article>>
}