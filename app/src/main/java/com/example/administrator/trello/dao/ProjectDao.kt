package com.example.administrator.hundredtimes.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Delete
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import com.example.administrator.trello.bean.Project


@Dao
interface ProjectDao {

    @Query("SELECT * FROM Project")
    fun getAll():List<Project>

    @Query("SELECT * FROM Project WHERE id IN (:id)")
    fun getById(id:Int):List<Project>

    @Insert
    fun insertAll(project: Project)

    @Delete
    fun delete(project: Project)

}