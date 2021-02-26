package com.ziadsyahrul.mahadapps.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ziadsyahrul.mahadapps.R
import com.ziadsyahrul.mahadapps.activities.adapter.AdapterDoa
import com.ziadsyahrul.mahadapps.activities.adapter.AdapterHadits
import com.ziadsyahrul.mahadapps.activities.model.ModelDoa
import com.ziadsyahrul.mahadapps.activities.model.ModelHadits
import org.json.JSONException
import org.json.JSONObject
import java.io.IOException
import java.nio.charset.StandardCharsets

class HaditsActivity : AppCompatActivity() {

    var adapterHadits: AdapterHadits? = null
    var modelHadits: MutableList<ModelHadits> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hadits)

        findViewById<Button>(R.id.btn_back_hadits).setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        findViewById<RecyclerView>(R.id.rvListHadits).setLayoutManager(LinearLayoutManager(this))
        findViewById<RecyclerView>(R.id.rvListHadits).setHasFixedSize(true)

        getHadits()

    }

    private fun getHadits() {
        try {
            val stream = assets.open("datahadits.json")
            val size = stream.available()
            val buffer = ByteArray(size)
            stream.read(buffer)
            stream.close()
            val strResponse = String(buffer, StandardCharsets.UTF_8)
            try {
                val jsonObject = JSONObject(strResponse)
                val jsonArray = jsonObject.getJSONArray("data")
                for (i in 0 until jsonArray.length()) {
                    val jsonObjectData = jsonArray.getJSONObject(i)
                    val dataModel = ModelHadits()
                    dataModel.strId = jsonObjectData.getString("id")
                    dataModel.strTitle = jsonObjectData.getString("title")
                    dataModel.strArabic = jsonObjectData.getString("arabic")
                    dataModel.strTranslation = jsonObjectData.getString("translation")
                    modelHadits.add(dataModel)
                }
                adapterHadits = AdapterHadits(modelHadits)
                findViewById<RecyclerView>(R.id.rvListHadits).adapter = adapterHadits
            } catch (e: JSONException) {
                e.printStackTrace()
            }
        } catch (ignored: IOException) {
        }
    }
}