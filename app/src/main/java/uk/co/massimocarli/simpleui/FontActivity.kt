package uk.co.massimocarli.simpleui

import android.graphics.Typeface
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class FontActivity : AppCompatActivity() {

  companion object {
    const val FONT_PATH = "font/font_example.ttf"
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.button_bg_activity_main)
    val buttonFont = Typeface.createFromAsset(assets, FONT_PATH)
    val resFont =
    arrayOf(R.id.button1, R.id.button2, R.id.button3).forEach {
      findViewById<Button>(it).typeface = buttonFont
      //findViewById<Button>(it).typeface = resources.getFont(R.font.font_example)
    }
  }
}