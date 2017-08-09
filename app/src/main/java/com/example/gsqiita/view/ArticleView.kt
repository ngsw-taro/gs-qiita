package com.example.gsqiita.view

import android.content.Context
import android.databinding.BindingMethod
import android.databinding.BindingMethods
import android.databinding.DataBindingUtil
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.RelativeLayout
import com.example.gsqiita.R
import com.example.gsqiita.databinding.ViewArticleBinding
import com.example.gsqiita.model.Article

@BindingMethods(BindingMethod(type = Article::class, attribute = "bind:article", method = "setArticle"))
class ArticleView : RelativeLayout {

    constructor(context: Context?) : super(context)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int, defStyleRes: Int) : super(context, attrs, defStyleAttr, defStyleRes)

    val binding: ViewArticleBinding =
            DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.view_article, this, true)

    fun setArticle(article: Article) {
        binding.article = article
    }
}