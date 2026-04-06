// Source: /app/src/main/java/io/legado/app/utils/viewbindingdelegate/ActivityViewBindings.kt
文件名：ActivityViewBindings.kt
文件大小：671 字节
================================================================================
文件内容：
@file:Suppress("RedundantVisibilityModifier", "unused")

package io.legado.app.utils.viewbindingdelegate

import android.view.LayoutInflater
import androidx.core.app.ComponentActivity
import androidx.viewbinding.ViewBinding

/**
 * Create new [ViewBinding] associated with the [ComponentActivity]
 */
@JvmName("viewBindingActivity")
inline fun <T : ViewBinding> ComponentActivity.viewBinding(
    crossinline bindingInflater: (LayoutInflater) -> T,
    setContentView: Boolean = false
) = lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
    val binding = bindingInflater.invoke(layoutInflater)
    if (setContentView) {
        setContentView(binding.root)
    }
    binding
}

