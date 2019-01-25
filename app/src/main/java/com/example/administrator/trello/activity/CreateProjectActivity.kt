package com.example.administrator.hundredtimes.activity

import android.widget.ImageView
import android.widget.TextView
import com.example.administrator.hundredtimes.presenter.CreateProjectPresenter
import com.example.administrator.hundredtimes.view.ICreateProjectView
import com.example.administrator.trello.R
import com.example.base.activity.BaseTopBarVpActivity

class CreateProjectActivity : BaseTopBarVpActivity<CreateProjectPresenter>(),ICreateProjectView {



    override fun setPresenter() = CreateProjectPresenter(this,this)

    override fun getFrameView() = 0

    override fun initContent() {

    }
}
