package com.tid.es

open class Runner {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            CoroutineEx().coroutineLaunch()
            ThreadEx().threadLaunch()
        }
    }
}


