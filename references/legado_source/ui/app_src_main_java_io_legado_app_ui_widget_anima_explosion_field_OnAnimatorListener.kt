// Source: /app/src/main/java/io/legado/app/ui/widget/anima/explosion_field/OnAnimatorListener.kt
文件名：OnAnimatorListener.kt
文件大小：203 字节
================================================================================
文件内容：
package io.legado.app.ui.widget.anima.explosion_field

import android.animation.Animator
import android.view.View

interface OnAnimatorListener {
    fun onAnimationEnd(animator: Animator, view: View)
}

