package and5.abrar.chapter3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_lifecycle.*

class ActivityLifecycle : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lifecycle)

        textlifecycle.text = "OnCreate"
    }

    override fun onStart() {
        super.onStart()
        textlifecycle.append("\n OnStart")
    }

    override fun onResume() {
        super.onResume()
        textlifecycle.append("\n OnResume")
    }

    override fun onPause() {
        super.onPause()
        textlifecycle.append("\n OnPause")
    }

    override fun onStop() {
        super.onStop()
        textlifecycle.append("\n OnStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        textlifecycle.append("\n OnDestro")
    }
}