// Source: /app/src/main/java/io/legado/app/base/adapter/animations/AlphaInAnimation.kt
文件名：AlphaInAnimation.kt
文件大小：477 字节
================================================================================
文件内容：
package io.legado.app.base.adapter.animations

import android.animation.Animator
import android.animation.ObjectAnimator
import android.view.View


class AlphaInAnimation @JvmOverloads constructor(private val mFrom: Float = DEFAULT_ALPHA_FROM) :
    BaseAnimation {

    override fun getAnimators(view: View): Array<Animator> =
        arrayOf(ObjectAnimator.ofFloat(view, "alpha", mFrom, 1f))

    companion object {

        private const val DEFAULT_ALPHA_FROM = 0f
    }
}

