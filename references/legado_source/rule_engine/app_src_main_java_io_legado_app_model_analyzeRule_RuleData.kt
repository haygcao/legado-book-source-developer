// Source: /app/src/main/java/io/legado/app/model/analyzeRule/RuleData.kt
文件名：RuleData.kt
文件大小：628 字节
================================================================================
文件内容：
package io.legado.app.model.analyzeRule

import io.legado.app.utils.GSON

class RuleData : RuleDataInterface {

    override val variableMap by lazy {
        hashMapOf<String, String>()
    }

    override fun putBigVariable(key: String, value: String?) {
        if (value == null) {
            variableMap.remove(key)
        } else {
            variableMap[key] = value
        }
    }

    override fun getBigVariable(key: String): String? {
        return null
    }

    fun getVariable(): String? {
        if (variableMap.isEmpty()) {
            return null
        }
        return GSON.toJson(variableMap)
    }

}

