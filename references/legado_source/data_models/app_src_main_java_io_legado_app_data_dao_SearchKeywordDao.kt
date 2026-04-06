// Source: /app/src/main/java/io/legado/app/data/dao/SearchKeywordDao.kt
文件名：SearchKeywordDao.kt
文件大小：1036 字节
================================================================================
文件内容：
package io.legado.app.data.dao

import androidx.room.*
import io.legado.app.data.entities.SearchKeyword
import kotlinx.coroutines.flow.Flow


@Dao
interface SearchKeywordDao {

    @get:Query("SELECT * FROM search_keywords")
    val all: List<SearchKeyword>

    @Query("SELECT * FROM search_keywords ORDER BY usage DESC")
    fun flowByUsage(): Flow<List<SearchKeyword>>

    @Query("SELECT * FROM search_keywords ORDER BY lastUseTime DESC")
    fun flowByTime(): Flow<List<SearchKeyword>>

    @Query("SELECT * FROM search_keywords where word like '%'||:key||'%' ORDER BY usage DESC")
    fun flowSearch(key: String): Flow<List<SearchKeyword>>

    @Query("select * from search_keywords where word = :key")
    fun get(key: String): SearchKeyword?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(vararg keywords: SearchKeyword)

    @Update
    fun update(vararg keywords: SearchKeyword)

    @Delete
    fun delete(vararg keywords: SearchKeyword)

    @Query("DELETE FROM search_keywords")
    fun deleteAll()

}

