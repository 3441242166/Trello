package com.example.administrator.hundredtimes.presenter

import android.content.Context
import android.util.Log
import com.example.administrator.hundredtimes.AppDataBase
import com.example.administrator.hundredtimes.view.IMainView
import com.example.administrator.trello.bean.Project
import com.example.base.BaseVpPresenter

class MainPresenter(view: IMainView?, context: Context?) : BaseVpPresenter<IMainView>(view,context) {

    fun getProjectList() {
        Log.i(TAG,"getProjectList")

        Thread(Runnable {
            val list = AppDataBase.instance.projectDao().getAll()
            Log.i(TAG,"list size = ${list.size}")

            mView.setMenuData(list)
        }).start()
    }

    fun insertProject(){
        Log.i(TAG,"insertProject")

        Thread(Runnable {
            AppDataBase.instance.projectDao().insertAll(Project("title"))
            Log.i(TAG,"insert success ")
        }).start()
    }

}