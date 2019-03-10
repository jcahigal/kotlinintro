package com.tid.es

import com.tid.es.util.ConcurrenceUtils
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class CoroutineEx {

    init {
        println("\n\nCoroutineEx:")
    }

    fun coroutineLaunch() {
        runBlocking {
            // coroutine scope, without having to join all of them explicitly
            launch(coroutineContext) {// new coroutine in this context
                // Start a coroutine
                println("In start : ${ConcurrenceUtils.getThreadAlias()}")
                delay(2000) // non-blocking delay
                println("In ended : ${ConcurrenceUtils.getThreadAlias()}")
            }

            run {
                println("Out start: ${ConcurrenceUtils.getThreadAlias()}")
                delay(3000)
                println("Out ended: ${ConcurrenceUtils.getThreadAlias()}")
            }
        }
    }

}