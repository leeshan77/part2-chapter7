package fastcampus.part2_chapter7

import android.content.Context
import android.os.Parcel
import android.os.Parcelable
import android.util.AttributeSet
import android.widget.ImageButton
import androidx.appcompat.widget.AppCompatImageButton

class RecordButton(
    context: Context,
    attrs: AttributeSet
): AppCompatImageButton(context, attrs) {

    fun updateIconWithState(state: State) {
        when (state) {
            State.BEFORE_RECORING -> {
                setImageResource(R.drawable.ic_record)
            }
            State.ON_RECORING -> {
                setImageResource(R.drawable.ic__stop)    
            }
            State.AFTER_RECORING -> {
                setImageResource(R.drawable.ic_play)    
            }
            State.ON_PLAYING -> {
                setImageResource(R.drawable.ic__stop)        
            }
        }

    }

}