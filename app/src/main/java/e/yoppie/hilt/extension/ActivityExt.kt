package e.yoppie.hilt.extension

import android.app.Activity
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

fun <T : ViewDataBinding> Activity.binding(@LayoutRes res: Int) = lazy<T> {
    DataBindingUtil.setContentView<T>(this, res).also {
        it.executePendingBindings()
    }
}
