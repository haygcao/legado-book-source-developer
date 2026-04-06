// Source: /app/src/main/java/io/legado/app/base/adapter/animations/SlideInLeftAnimation.kt
文件名：SlideInLeftAnimation.kt
文件大小：356 字节
================================================================================
文件内容：
package io.legado.app.base.adapter.animations

import android.animation.Animator
import android.animation.ObjectAnimator
import android.view.View


class SlideInLeftAnimation : BaseAnimation {


    override fun getAnimators(view: View): Array<Animator> =
        arrayOf(ObjectAnimator.ofFloat(view, "translationX", -view.rootView.width.toFloat(), 0f))
}

