package com.example.administrator.hundredtimes.util

import java.util.*

val bckColorAr = arrayOf("#eb0303","#0054ff","#ffc600","#a8ede1"
        ,"#facd89","#cce5f6","#fe6a01","#565656","#333333","#f4658b")

fun getRandomColor():String{
    return bckColorAr[Math.abs(Random().nextInt() % bckColorAr.size)]
}