package com.example.administrator.hundredtimes.adapter

import android.graphics.Color
import android.util.Log
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.example.administrator.trello.R
import com.example.administrator.trello.bean.Project

class ProjectAdapter(data: List<Project>?) : BaseQuickAdapter<Project, BaseViewHolder>(R.layout.item_project, data) {
    val TAG = "ProjectAdapter"

    override fun convert(helper: BaseViewHolder, item: Project) {
        Log.i(TAG,"convert")
        helper.setText(R.id.tv_title,item.title)


        Log.i(TAG,"color is ${item.imgPath}")

        if(item.imgPath[0] == '#'){
            (helper.getView(R.id.iv_bck) as ImageView).setBackgroundColor(Color.parseColor(item.imgPath))
        }else{
            Glide.with(mContext).load(item.imgPath).into(helper.getView(R.id.iv_bck))
        }
    }
}