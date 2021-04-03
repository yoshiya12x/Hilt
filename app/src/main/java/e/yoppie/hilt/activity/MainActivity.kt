package e.yoppie.hilt.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import dagger.hilt.android.AndroidEntryPoint
import e.yoppie.hilt.Logger
import e.yoppie.hilt.R
import e.yoppie.hilt.databinding.ActivityMainBinding
import e.yoppie.hilt.extension.binding
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by binding(R.layout.activity_main)

    @Inject
    lateinit var logger: Logger

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.kaechangButton.setOnClickListener {
            logger.sendLog()
            Snackbar.make(it, "なにー？", Snackbar.LENGTH_SHORT).show()
        }
    }
}
