package com.example.administrator.hundredtimes.view

import com.example.administrator.trello.bean.Project
import com.example.base.IView

interface IMainView :IView {
    fun showEmptyView()
    fun setMenuData(data: List<Project>)
}