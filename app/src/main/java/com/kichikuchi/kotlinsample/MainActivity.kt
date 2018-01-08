package com.kichikuchi.kotlinsample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.kichikuchi.kotlinsample.model.Article
import com.kichikuchi.kotlinsample.model.User

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val listAdapter = ArticleListAdapter(applicationContext)
        listAdapter.articles = listOf(dummyArticle("kotlin入門", "太郎"), dummyArticle("java入門", "二郎"))

        val listView: ListView = findViewById<ListView>(R.id.list_view)
        listView.adapter = listAdapter
        listView.setOnItemClickListener { adapterView, view, position, id ->
            val article = listAdapter.articles[position]
            ArticleActivity.intent(this, article).let { startActivity(it) }
        }
    }

    private fun dummyArticle(title: String, userName: String): Article =
            Article(id = "",
                    title = title,
                    url = "https://kotlinlang.org/",
                    user = User(id = "", name = userName, profileImageUrl = ""))
}
