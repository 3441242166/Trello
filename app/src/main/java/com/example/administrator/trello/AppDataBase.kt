package com.example.administrator.hundredtimes

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import com.example.administrator.hundredtimes.dao.BlackboardDao
import com.example.administrator.hundredtimes.dao.ProjectDao
import com.example.administrator.hundredtimes.dao.RemarkDao
import com.example.administrator.trello.bean.Blackboard
import com.example.administrator.trello.bean.Project
import com.example.administrator.trello.bean.Remark
import com.example.projectcore.Config


@Database(entities = [Project::class, Blackboard::class, Remark::class], version = 1, exportSchema = false)
abstract class AppDataBase: RoomDatabase() {

    companion object {
        val instance: AppDataBase by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
            Room.databaseBuilder(Config.getApplication()
                    ,AppDataBase::class.java
                    ,"myDataBase")
                    .build()
        }
    }

    abstract fun projectDao(): ProjectDao

    abstract fun blackboardDao(): BlackboardDao

    abstract fun remarkDao(): RemarkDao

}
