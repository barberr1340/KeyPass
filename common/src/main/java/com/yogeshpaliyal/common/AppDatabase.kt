package com.yogeshpaliyal.common

import androidx.room.Database
import androidx.room.RoomDatabase
import com.yogeshpaliyal.common.data.AccountModel
import com.yogeshpaliyal.keypass.db.DbDao

/*
* @author Yogesh Paliyal
* yogeshpaliyal.foss@gmail.com
* https://techpaliyal.com
* created on 30-01-2021 20:37
*/
@Database(
    entities = [AccountModel::class],
    version = 5, exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {

    // define DAO start
    abstract fun getDao(): DbDao
    // define DAO end
}