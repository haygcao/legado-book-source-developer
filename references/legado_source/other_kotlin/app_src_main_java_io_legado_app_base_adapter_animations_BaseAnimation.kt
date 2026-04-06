// Source: /app/src/main/java/io/legado/app/base/adapter/animations/BaseAnimation.kt
文件名：BaseAnimation.kt
文件大小：218 字节
================================================================================
文件内容：
package io.legado.app.base.adapter.animations

import android.animation.Animator
import android.view.View

/**
 * adapter item 动画
 */
interface BaseAnimation {

    fun getAnimators(view: View): Array<Animator>

}

