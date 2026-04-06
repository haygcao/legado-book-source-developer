// Source: /app/src/main/java/io/legado/app/ui/book/import/remote/ServersViewModel.kt
文件名：ServersViewModel.kt
文件大小：384 字节
================================================================================
文件内容：
package io.legado.app.ui.book.import.remote

import android.app.Application
import io.legado.app.base.BaseViewModel
import io.legado.app.data.appDb
import io.legado.app.data.entities.Server

class ServersViewModel(application: Application): BaseViewModel(application) {


    fun delete(server: Server) {
        execute {
            appDb.serverDao.delete(server)
        }
    }

}

