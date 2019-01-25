package com.example.administrator.hundredtimes.fragment

import android.os.Bundle
import com.example.administrator.hundredtimes.presenter.MainPresenter
import com.example.administrator.hundredtimes.view.IMainView
import com.example.administrator.trello.bean.Project
import com.example.base.fragment.BaseVpFragment

class ListFragment : BaseVpFragment<MainPresenter>() ,IMainView{
    override fun showEmptyView() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setMenuData(data: List<Project>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setPresenter() = MainPresenter(this,context)

    override fun init(savedInstanceState: Bundle?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getContentView(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}