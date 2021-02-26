package com.ziadsyahrul.mahadapps.activities.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ziadsyahrul.mahadapps.R
import com.ziadsyahrul.mahadapps.activities.model.ModelDoa
import com.ziadsyahrul.mahadapps.activities.model.ModelHadits

class AdapterHadits(private val modelHadits:MutableList<ModelHadits>):
RecyclerView.Adapter<AdapterHadits.ListViewHolder>(){


    private var modelHaditsListFull: List<ModelHadits> = modelHadits


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list_hadits, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val dataModel = modelHadits[position]

        holder.tvIdHadits.text = dataModel.strId
        holder.tvTitleHadits.text = dataModel.strTitle
        holder.tvArabicHadits.text = dataModel.strArabic
        holder.tvTerjemahanHadits.text = dataModel.strTranslation

    }

    override fun getItemCount(): Int {
        return modelHadits.size
    }


    class ListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var tvIdHadits: TextView
        var tvTitleHadits: TextView
        var tvArabicHadits: TextView
        var tvTerjemahanHadits: TextView

        init {
            tvIdHadits = itemView.findViewById(R.id.tvIdHadits)
            tvTitleHadits = itemView.findViewById(R.id.tvTitleHadits)
            tvArabicHadits = itemView.findViewById(R.id.tvArabicHadits)
            tvTerjemahanHadits = itemView.findViewById(R.id.tvTerjemahanHadits)
        }

    }

    init {
        modelHaditsListFull = ArrayList(modelHadits)
    }

}