package com.example.test_layoutu1.DB

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import java.io.IOException

object DatabaseCreate {
    fun saveAssetsToDB(context: Context) {
        val databaseHelper = DatabaseHelper(context)
        val db = databaseHelper.writableDatabase
        db.clearDatabase()
        val insertAssets = context.assets
        try {
            val destination = "IMG_PNG"
            val files = insertAssets.list(destination)

            if (files != null) {
                for (fileName in files) {
                    val path = "$destination/$fileName"
                    val contentValues = ContentValues().apply {
                        put("image_path", path)
                    }
                    db.insert("TabelaObrazow", null, contentValues)
                }
            }
        } catch (e: IOException) {
            e.printStackTrace()
        }
        db.close()
    }

    private fun SQLiteDatabase.clearDatabase() {
        val tables = arrayOf("obrazy", "teksty", "vidgif")
        tables.forEach { table ->
            delete(table, null, null)
        }
    }
}