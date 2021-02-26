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

class AdapterDoa(private val modelBacaan: MutableList<ModelDoa>) :
    RecyclerView.Adapter<AdapterDoa.ListViewHolder>(), Filterable {


    private var modelBacaanListFull: List<ModelDoa> = modelBacaan


    private val modelBacaanFilter: Filter = object : Filter(){
        override fun performFiltering(p0: CharSequence): FilterResults {
            val filteredList: MutableList<ModelDoa> = ArrayList()
            if (p0 == null || p0.length == 0) {
                filteredList.addAll(modelBacaanListFull)
            } else {
                val filteredPattern = p0.toString().toLowerCase()
                for (modelDoaFilter in modelBacaanListFull) {
                    if (modelDoaFilter.strTitle!!.toLowerCase().contains(filteredPattern)) {
                        filteredList.add(modelDoaFilter)
                    }
                }
            }
            var results = FilterResults()
            results.values = filteredList
            return results
        }

        override fun publishResults(p0: CharSequence, p1: FilterResults) {
            modelBacaan.clear()
            modelBacaan.addAll(p1.values as List<ModelDoa>)
            notifyDataSetChanged()
        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.list_item_doa, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(listViewHolder: ListViewHolder, i: Int) {
        val dataModel = modelBacaan[i]
        listViewHolder.tvId.text = dataModel.strId
        listViewHolder.tvTitle.text = dataModel.strTitle
        listViewHolder.tvArabic.text = dataModel.strArabic
        listViewHolder.tvLatin.text = dataModel.strLatin
        listViewHolder.tvTerjemahan.text = dataModel.strTranslation
    }

    override fun getItemCount(): Int {
        return modelBacaan.size
    }

    override fun getFilter(): Filter {
        return modelBacaanFilter
    }

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvId: TextView
        var tvTitle: TextView
        var tvArabic: TextView
        var tvLatin: TextView
        var tvTerjemahan: TextView

        init {
            tvId = itemView.findViewById(R.id.tvId)
            tvTitle = itemView.findViewById(R.id.tvTitle)
            tvArabic = itemView.findViewById(R.id.tvArabic)
            tvLatin = itemView.findViewById(R.id.tvLatin)
            tvTerjemahan = itemView.findViewById(R.id.tvTerjemahan)
        }
    }

    init {
        modelBacaanListFull = ArrayList(modelBacaan)
    }
}