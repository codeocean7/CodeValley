package com.zealsoft.codevalley.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.zealsoft.codevalley.DataModel.LanguageModel
import com.zealsoft.codevalley.R

class LanguageAdapter(val ctx:Context, val chlngList:List<LanguageModel>):RecyclerView.Adapter<LanguageAdapter.LanguageViewHolder>()
{
    override fun getItemCount(): Int
    {
        return this.chlngList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, position: Int): LanguageViewHolder{
        return LanguageViewHolder(LayoutInflater.from(ctx).inflate(R.layout.language_model_list_layout,parent,false))
    }

    override fun onBindViewHolder(holder: LanguageViewHolder, position: Int)
    {
        val singleChlng=chlngList.get(position)

        holder.txtLanguageName.text=singleChlng.languageName
        holder.imgLanguageIcon.setImageResource(singleChlng.languageIcon)
    }
    class LanguageViewHolder(v:View):RecyclerView.ViewHolder(v)
    {
        val txtLanguageName=v.findViewById<TextView>(R.id.txtLnggName)
        val imgLanguageIcon=v.findViewById<ImageView>(R.id.imgLnggIcon)
    }
}

