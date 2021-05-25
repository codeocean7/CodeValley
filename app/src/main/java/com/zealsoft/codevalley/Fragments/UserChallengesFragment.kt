package com.zealsoft.codevalley.Fragments

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.zealsoft.codevalley.Adapters.LanguageAdapter
import com.zealsoft.codevalley.DataModel.LanguageModel
import com.zealsoft.codevalley.R

class UserChallengesFragment : Fragment()
{
    var ctx:Context?=null
    override fun onAttach(context: Context)
    {
        super.onAttach(context)
        this.ctx=context
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {
        return inflater.inflate(R.layout.user_challenges_layout,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val rvProgrammingList= view?.findViewById<RecyclerView>(R.id.rvProgrammingLanguages)
        val chlngList=ArrayList<LanguageModel>()

        chlngList.add(LanguageModel(R.drawable.python,"PYTHON"))
        chlngList.add(LanguageModel(R.drawable.java,"JAVA"))
        chlngList.add(LanguageModel(R.drawable.c,"C"))
        chlngList.add(LanguageModel(R.drawable.cpp,"C++"))
        chlngList.add(LanguageModel(R.drawable.cshrp,"C#"))
        chlngList.add(LanguageModel(R.drawable.html,"HTML"))
        chlngList.add(LanguageModel(R.drawable.javscpt,"JAVASCRIPT"))
        chlngList.add(LanguageModel(R.drawable.php,"PHP"))
        chlngList.add(LanguageModel(R.drawable.sql,"SQL"))

        rvProgrammingList.layoutManager=GridLayoutManager(ctx,2)
        rvProgrammingList.adapter= LanguageAdapter(this.ctx!!,chlngList)

    }
}