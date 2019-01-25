package com.example.administrator.hundredtimes.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Delete
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import com.example.administrator.trello.bean.Blackboard


@Dao
interface BlackboardDao {

    @Query("SELECT * FROM Blackboard")
    fun getAll():List<Blackboard>

    @Query("SELECT * FROM Blackboard WHERE id IN (:id)")
    fun getById(id:Int):List<Blackboard>

    @Insert
    fun insertAll(project: Blackboard)

    @Delete
    fun delete(project: Blackboard)
}