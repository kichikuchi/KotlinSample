package com.kichikuchi.kotlinsample.client

/**
 * Created by KazunoriKikuchi on 2018/01/08.
 */

import retrofit2.http.GET
import retrofit2.http.Query
import io.reactivex.Observable
import com.kichikuchi.kotlinsample.model.Article

interface ArticleClient {

    @GET("/api/v2/items")
    fun search(@Query("query") query: String): Observable<List<Article>>
}