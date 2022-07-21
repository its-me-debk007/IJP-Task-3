package `in`.project.task3.utils

import android.app.Application
import com.google.android.material.color.DynamicColors

class ProjectApplication : Application() {
	override fun onCreate() {
		super.onCreate()
		DynamicColors.applyToActivitiesIfAvailable(this)
	}
}