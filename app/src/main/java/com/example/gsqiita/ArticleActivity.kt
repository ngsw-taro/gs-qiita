package com.example.gsqiita

import android.content.Context
import android.content.Intent
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.gsqiita.databinding.ActivityArticleBinding
import com.example.gsqiita.model.Article

class ArticleActivity : AppCompatActivity() {

    companion object {

        private const val ARTICLE_EXTRA: String = "article"

        fun intent(context: Context, article: Article): Intent =
                Intent(context, ArticleActivity::class.java)
                        .putExtra(ARTICLE_EXTRA, article)
    }

    val binding: ActivityArticleBinding by lazy {
        DataBindingUtil.setContentView<ActivityArticleBinding>(this, R.layout.activity_article)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.article = intent.getParcelableExtra(ARTICLE_EXTRA)
    }
}
