package com.ziadsyahrul.mahadapps.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.ziadsyahrul.mahadapps.R
import com.ziadsyahrul.mahadapps.activities.image.ImageArticle

class DetailArticleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_article)



        val detail = intent.getParcelableExtra<ImageArticle>(ArticleActivity.INTENT_PARCELABLE)

        val imgSrc = findViewById<ImageView>(R.id.img_detail_article)
        val titleArticle = findViewById<TextView>(R.id.txt_detail_article)
        val descArticle = findViewById<TextView>(R.id.txtDescArticle)

        imgSrc.setImageResource(detail!!.imageSrc)
        titleArticle.text = detail.imageTitle
        descArticle.text = detail.imageDesc

    }
}