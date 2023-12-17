package com.example.test_layoutu1.DB

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DatabaseHelper(context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {
    companion object {
        private const val DATABASE_NAME = "AndroTutorialAPP.db"
        private const val DATABASE_VERSION = 1
    }
    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL("DROP TABLE IF EXISTS ${TabelaObrazow.TABLE_NAME}")
        db.execSQL("DROP TABLE IF EXISTS ${TabelaTekstu.TABLE_NAME}")
        db.execSQL("DROP TABLE IF EXISTS ${TabelaVidGif.TABLE_NAME}")

        val createImageTableQuery = "CREATE TABLE ${TabelaObrazow.TABLE_NAME} (" +
                "${TabelaObrazow.COLUMN_ID} INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "${TabelaObrazow.COLUMN_IMAGE_PATH} TEXT)"
        db.execSQL(createImageTableQuery)


        val createTextTableQuery = "CREATE TABLE ${TabelaTekstu.TABLE_NAME} (" +
                "${TabelaTekstu.COLUMN_ID} INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "${TabelaTekstu.COLUMN_TEXT} TEXT)"
        db.execSQL(createTextTableQuery)

        val createVidGifTableQuery = "CREATE TABLE ${TabelaVidGif.TABLE_NAME} (" +
                "${TabelaVidGif.COLUMN_ID} INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "${TabelaVidGif.COLUMN_VID_PATH} TEXT)"
        db.execSQL(createVidGifTableQuery)
    }
    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL("DROP TABLE IF EXISTS ${TabelaObrazow.TABLE_NAME}")
        db.execSQL("DROP TABLE IF EXISTS ${TabelaTekstu.TABLE_NAME}")
        db.execSQL("DROP TABLE IF EXISTS ${TabelaVidGif.TABLE_NAME}")
    }
}