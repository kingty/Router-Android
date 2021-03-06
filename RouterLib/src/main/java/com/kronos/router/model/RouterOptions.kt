package com.kronos.router.model

import android.app.Activity
import android.os.Bundle

import com.kronos.router.RouterCallback

/**
 * Created by zhangyang on 16/7/16.
 */
class RouterOptions {

    var openClass: Class<out Activity>? = null
    var callback: RouterCallback? = null
    private val _defaultParams: Bundle by lazy {
        Bundle()
    }
    var weight = 0

    var defaultParams: Bundle?
        get() = this._defaultParams
        set(defaultParams) {

            _defaultParams.putAll(defaultParams)

        }

    constructor() {

    }

    constructor(defaultParams: Bundle) {
        this.defaultParams = defaultParams
    }


    fun putParams(key: String, value: String) {
        _defaultParams.putString(key, value)
    }
}
