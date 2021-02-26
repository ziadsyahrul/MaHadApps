package com.ziadsyahrul.mahadapps.activities.adapter

import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ziadsyahrul.mahadapps.R
import com.ziadsyahrul.mahadapps.activities.image.ImageArticle

class ArticleAdapter(
    private val context: Context,
    private val images: List<ImageArticle>,
    val listener: (ImageArticle) -> Unit
): RecyclerView.Adapter<ArticleAdapter.ImageViewHolder>() {
    class ImageViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val imageSrc = view.findViewById<ImageView>(R.id.imgArticle)
        val title = view.findViewById<TextView>(R.id.txtArticle)
        val button = view.findViewById<Button>(R.id.button)
        fun bindView(image: ImageArticle, listener: (ImageArticle) -> Unit){
            imageSrc.setImageResource(image.imageSrc)
            title.text = image.imageTitle
            button.setOnClickListener { listener(image) }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder =
        ImageViewHolder(LayoutInflater.from(context).inflate(R.layout.item_article,parent, false))

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        holder.bindView(images[position], listener)
    }

    override fun getItemCount(): Int = images.size
}