package com.nicco.architectures.android.mvc

import com.nicco.architectures.android.base.network.NetworkFake

class MVCController {

    lateinit var networkFake: NetworkFake

    fun getInfos() {
        networkFake = NetworkFake()
        networkFake.createMVCInfos()
    }
}