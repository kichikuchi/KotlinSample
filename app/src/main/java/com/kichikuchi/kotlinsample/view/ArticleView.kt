package com.kichikuchi.kotlinsample.view

import android.util.AttributeSet
import android.widget.FrameLayout
import android.widget.TextView
import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.widget.ImageView
import com.kichikuchi.kotlinsample.model.Article
import com.kichikuchi.kotlinsample.R

/**
 * Created by KazunoriKikuchi on 2018/01/07.
 */

class ArticleView: FrameLayout {
    constructor(context: Context?) : super(context)

    constructor(context: Context?,
                attrs: AttributeSet?) : super(context, attrs)

    constructor(context: Context?,
                attrs: AttributeSet?,
                defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    constructor(context: Context?,
                attrs: AttributeSet?,
                defStyleAttr: Int,
                defStyleRes: Int) : super(context, attrs, defStyleAttr, defStyleRes)

    var profileImageView: ImageView? = null

    var titleTextView: TextView? = null

    var userNameTextView: TextView? = null

    init {
        LayoutInflater.from(context).inflate(R.layout.view_article, this)
        profileImageView = findViewById<ImageView>(R.id.profile_image_view)
        titleTextView = findViewById<TextView>(R.id.title_text_view)
        userNameTextView = findViewById<TextView>(R.id.user_name_text_view)
    }

    fun setArticle(article: Article) {
        titleTextView?.text = article.title
        userNameTextView?.text = article.user.name

        profileImageView?.setBackgroundColor(Color.RED)
    }
}