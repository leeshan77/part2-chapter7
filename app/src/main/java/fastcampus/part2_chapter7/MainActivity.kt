package fastcampus.part2_chapter7


import android.Manifest
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private val recordBtn: RecordButton by lazy {
        findViewById(R.id.recordBtn)
    }

    private val requiredPermissions = arrayOf(Manifest.permission.RECORD_AUDIO)

    private var state = State.BEFORE_RECORING

    private val resetBtn: Button by lazy {
        findViewById(R.id.resetBtn)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        initViews()
    }

    private fun requestAudioPermission() {
        requestPermissions()
    }

    private fun initViews() {
        recordBtn.updateIconWithState(state)

    }
}