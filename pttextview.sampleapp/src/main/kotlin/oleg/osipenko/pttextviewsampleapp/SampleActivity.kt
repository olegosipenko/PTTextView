package oleg.osipenko.pttextviewsampleapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import com.jakewharton.rxbinding.widget.RxSeekBar
import com.jakewharton.rxbinding.widget.RxTextView
import kotlinx.android.synthetic.activity_sample.*
import org.jetbrains.anko.visibility
import pttextview.utils.PTTypefaceManager
import rx.Subscription

public class SampleActivity : AppCompatActivity() {

    var seekBarSubscription: Subscription? = null
    var editTextSubscription: Subscription? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample)
        val typeface = PTTypefaceManager.getTypeface(this, getIntent().getIntExtra(INDEX, 0))
        val viewArray = arrayOf(sampleText, inputText, textInput, text)
        for (view in viewArray)
            view.setTypeface(typeface)

        seekBarSubscription = RxSeekBar.changes(seekBar)
                .map { i -> i + MIN_SIZE }
                .subscribe { i ->
                    run {
                        text.setText(getResources().getString(R.string.choose_the_size) + " " + i + "sp")
                        if (inputText.visibility == View.VISIBLE) inputText.setTextSize(i.toFloat())
                        sampleText.setTextSize(i.toFloat())
                    }
                }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_sample, menu)
        return true
    }

    override fun onDestroy() {
        super.onDestroy()
        seekBarSubscription?.unsubscribe()
        editTextSubscription?.unsubscribe()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        val id = item.getItemId()

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_sample) {
            textInput.setVisibility(View.GONE)
            inputText.setVisibility(View.GONE)
            sampleText.setVisibility(View.VISIBLE)
            sampleText.setTextSize((seekBar.getProgress() + MIN_SIZE).toFloat())
            editTextSubscription?.unsubscribe()
            return true
        } else if (id == R.id.action_input) {
            textInput.setVisibility(View.VISIBLE)
            inputText.setVisibility(View.VISIBLE)
            sampleText.setVisibility(View.GONE)
            inputText.setTextSize((seekBar.getProgress() + MIN_SIZE).toFloat())
            editTextSubscription = RxTextView.textChanges(textInput)
                    .subscribe { text ->
                        run {
                            inputText.setText(text)
                        }
                    }
        }

        return super.onOptionsItemSelected(item)
    }
}
