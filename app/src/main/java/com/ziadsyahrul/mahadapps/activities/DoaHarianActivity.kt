package com.ziadsyahrul.mahadapps.activities

import android.app.Activity
import android.content.Intent
import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.view.inputmethod.EditorInfo
import android.widget.Button
import android.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ziadsyahrul.mahadapps.R
import com.ziadsyahrul.mahadapps.activities.adapter.AdapterDoa
import com.ziadsyahrul.mahadapps.activities.model.ModelDoa
import org.json.JSONException
import org.json.JSONObject
import java.io.IOException
import java.nio.charset.StandardCharsets

class DoaHarianActivity : AppCompatActivity() {

    var adapterDoa: AdapterDoa? = null
    var modelDoa: MutableList<ModelDoa> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doa_harian)

        findViewById<Button>(R.id.btn_back_doa).setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
            window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_STABLE or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
        }

        if (Build.VERSION.SDK_INT >= 21) {
            setWindowFlag(this, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, false)
            window.statusBarColor = Color.TRANSPARENT
        }

        findViewById<SearchView>(R.id.searchDoa).setImeOptions(EditorInfo.IME_ACTION_DONE)
        findViewById<SearchView>(R.id.searchDoa).setOnQueryTextListener(object : android.widget.SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(p0: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(p0: String?): Boolean {
                adapterDoa?.filter?.filter(p0)
                return true
            }

        })

        //transparent background searchview
        val searchPlateId = findViewById<SearchView>(R.id.searchDoa).getContext().resources.getIdentifier("android:id/search_plate",
            null, null)
        val searchPlate = findViewById<SearchView>(R.id.searchDoa).findViewById<View>(searchPlateId)
        searchPlate?.setBackgroundColor(Color.TRANSPARENT)

        findViewById<RecyclerView>(R.id.rvListDoa).setLayoutManager(LinearLayoutManager(this))
        findViewById<RecyclerView>(R.id.rvListDoa).setHasFixedSize(true)

        //get data
        getDoaHarian()
    }

    private fun getDoaHarian() {
        try {
            val stream = assets.open("doaharian.json")
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
                    val dataModel = ModelDoa()
                    dataModel.strId = jsonObjectData.getString("id")
                    dataModel.strTitle = jsonObjectData.getString("title")
                    dataModel.strArabic = jsonObjectData.getString("arabic")
                    dataModel.strLatin = jsonObjectData.getString("latin")
                    dataModel.strTranslation = jsonObjectData.getString("translation")
                    modelDoa.add(dataModel)
                }
                adapterDoa = AdapterDoa(modelDoa)
                findViewById<RecyclerView>(R.id.rvListDoa).adapter = adapterDoa
            } catch (e: JSONException) {
                e.printStackTrace()
            }
        } catch (ignored: IOException) {
        }
    }

    companion object {
        fun setWindowFlag(activity: Activity, bits: Int, on: Boolean) {
            val window = activity.window
            val layoutParams = window.attributes
            if (on) {
                layoutParams.flags = layoutParams.flags or bits
            } else {
                layoutParams.flags = layoutParams.flags and bits.inv()
            }
            window.attributes = layoutParams
        }
    }
}