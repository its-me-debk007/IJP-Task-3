package `in`.project.task3.ui.activity

import `in`.project.task3.databinding.ActivityMainBinding
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
	private lateinit var binding: ActivityMainBinding
	private var isClicked = false

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		binding = ActivityMainBinding.inflate(layoutInflater)
		setContentView(binding.root)
		binding.apply {
			loveTheApp.setOnClickListener {
				isClicked = !isClicked
				if (isClicked) {
					rate.show()
					share.show()
					info.show()
				} else {
					rate.hide()
					share.hide()
					info.hide()
				}
			}
		}
	}
}