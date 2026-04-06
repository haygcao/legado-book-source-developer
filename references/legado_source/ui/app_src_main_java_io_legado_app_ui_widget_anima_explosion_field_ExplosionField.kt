// Source: /app/src/main/java/io/legado/app/ui/widget/anima/explosion_field/ExplosionField.kt
文件名：ExplosionField.kt
文件大小：623 字节
================================================================================
文件内容：
package io.legado.app.ui.widget.anima.explosion_field

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.view.Window

object ExplosionField {

    fun attach2Window(activity: Activity): ExplosionView {
        val rootView = activity.findViewById<View>(Window.ID_ANDROID_CONTENT) as ViewGroup
        val explosionField = ExplosionView(activity)
        rootView.addView(
            explosionField, ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT
            )
        )
        return explosionField
    }

}

