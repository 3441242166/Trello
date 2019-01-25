package com.example.administrator.hundredtimes.activity

import android.content.Intent
import android.os.Bundle
import android.support.v4.content.ContextCompat.startActivity
import android.support.v4.view.ViewPager
import com.example.administrator.trello.R
import com.example.base.activity.BaseVActivity


class MainActivity : BaseVActivity(){

    override fun setPresenter() = null

    //private lateinit var viewPager: ViewPager

    override fun getContentView() = R.layout.activity_main

    override fun init(savedInstanceState: Bundle?) {
        initView()
        initEvent()
    }

    private fun initEvent() {

//        fab_add.setOnClickListener{
//            startActivity(Intent(this,MovieListActivity::class.java))
//        }
    }

    private fun initView(){
        //viewPager = vp_content
    }

}