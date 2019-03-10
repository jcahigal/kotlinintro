package com.tid.es

import com.tid.es.util.ConcurrenceUtils
import kotlin.concurrent.thread

class ThreadEx {

    init {
        println("\n\nThreadEx:")
    }

    fun threadLaunch() {
        thread {
            println("In start : ${ConcurrenceUtils.getThreadAlias()}")
            Thread.sleep(2000L)
            println("In ended : ${ConcurrenceUtils.getThreadAlias()}")
        }

        run {
            println("Out start: ${ConcurrenceUtils.getThreadAlias()}")
            Thread.sleep(3000L)
            println("Out ended: ${ConcurrenceUtils.getThreadAlias()}")
        }
    }
}

