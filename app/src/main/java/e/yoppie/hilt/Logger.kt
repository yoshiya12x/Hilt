package e.yoppie.hilt

import android.util.Log
import javax.inject.Inject

class Logger @Inject constructor() {
    fun sendLog(){
        Log.d("HILT_LOGGER_TEST", "hilt logger test")
    }
}
