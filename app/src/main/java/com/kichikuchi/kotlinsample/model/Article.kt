package com.kichikuchi.kotlinsample.model

/**
 * Created by KazunoriKikuchi on 2018/01/07.
 */

data class Article(val id: String,
                   val title: String,
                   val url: String,
                   val user: User)