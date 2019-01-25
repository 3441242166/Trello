package com.example.administrator.hundredtimes.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Delete
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import com.example.administrator.trello.bean.Remark


@Dao
interface RemarkDao {

    @Query("SELECT * FROM Remark")
    fun getAll():List<Remark>

    @Query("SELECT * FROM Remark WHERE id IN (:id)")
    fun getById(id:Int):List<Remark>

    @Insert
    fun insertAll(project: Remark)

    @Delete
    fun delete(project: Remark)

}