// Source: /app/src/main/java/io/legado/app/base/VMBaseFragment.kt
文件名：VMBaseFragment.kt
文件大小：198 字节
================================================================================
文件内容：
package io.legado.app.base

import androidx.lifecycle.ViewModel

abstract class VMBaseFragment<VM : ViewModel>(layoutID: Int) : BaseFragment(layoutID) {

    protected abstract val viewModel: VM

}

