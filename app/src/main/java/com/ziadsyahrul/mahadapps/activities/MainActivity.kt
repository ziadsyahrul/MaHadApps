package com.ziadsyahrul.mahadapps.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.interfaces.ItemClickListener
import com.denzcoskun.imageslider.models.SlideModel
import com.ziadsyahrul.mahadapps.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageList = ArrayList<SlideModel>()

        imageList.add(SlideModel(R.drawable.fix1, ScaleTypes.FIT))
        imageList.add(SlideModel(R.drawable.fix2, ScaleTypes.FIT))
        imageList.add(SlideModel(R.drawable.fix3, ScaleTypes.FIT))
        imageList.add(SlideModel(R.drawable.fix4, ScaleTypes.FIT))

        val imageSlider = findViewById<ImageSlider>(R.id.image_slider)
        imageSlider.setImageList(imageList)

        imageSlider.setItemClickListener(object : ItemClickListener {
            override fun onItemSelected(position: Int) {
                val intent = Intent(this@MainActivity, ArticleActivity::class.java)
                startActivity(intent)
            }
        })


        // doa harian
        val img_doa = findViewById<ImageView>(R.id.img_doa_harian)
        img_doa.setOnClickListener {
            val intent = Intent(this, DoaHarianActivity::class.java)
            startActivity(intent)
        }


        val img_dzikir_pagi = findViewById<ImageView>(R.id.img_dzikir_pagi)
        img_dzikir_pagi.setOnClickListener {
            val intent = Intent(this, DzikirPagiActivity::class.java)
            startActivity(intent)
        }

        val img_dzikir_petang = findViewById<ImageView>(R.id.img_dzikir_petang)
        img_dzikir_petang.setOnClickListener {
            val intent = Intent(this, DzikirPetangActivity::class.java)
            startActivity(intent)
        }

        val img_hadits = findViewById<ImageView>(R.id.img_dalil)
        img_hadits.setOnClickListener {
            val intent = Intent(this, HaditsActivity::class.java)
            startActivity(intent)
        }
    }
}
