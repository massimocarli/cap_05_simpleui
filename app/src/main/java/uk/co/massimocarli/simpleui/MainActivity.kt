package uk.co.massimocarli.simpleui

import android.graphics.drawable.AnimatedVectorDrawable
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    // Change the layout here and try!
    setContentView(R.layout.animated_vector_layout)
    findViewById<ImageView>(R.id.animatedImage)?.setOnClickListener {
      (it.background as AnimatedVectorDrawable).start()
    }
  }
}
