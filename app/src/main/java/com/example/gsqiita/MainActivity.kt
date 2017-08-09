package com.example.gsqiita

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ListView
import com.example.gsqiita.model.Article
import com.example.gsqiita.model.User

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val article = Article(id = "123",
                title = "Kotlin入門",
                url = "http://www.example.com/articls/123",
                user = User(id = "456", name = "たろう", profileImageUrl = ""))

        val listAdapter = ArticleListAdapter(this)
        listAdapter.articles = listOf(article)

        val listView: ListView = findViewById(R.id.list_view) as ListView
        listView.adapter = listAdapter
        listView.setOnItemClickListener { _, _, position, _ ->
            val article = listAdapter.articles[position]
            ArticleActivity.intent(this, article).let { startActivity(it) }
        }
    }
}
