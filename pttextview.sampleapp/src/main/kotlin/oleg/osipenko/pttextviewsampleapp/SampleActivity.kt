package oleg.osipenko.pttextviewsampleapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.jakewharton.rxbinding.widget.RxSeekBar
import kotlinx.android.synthetic.activity_sample.sampleText
import kotlinx.android.synthetic.activity_sample.seekBar
import kotlinx.android.synthetic.activity_sample.text
import pttextview.utils.PTTypefaceManager
import rx.Subscription

public class SampleActivity : AppCompatActivity() {

    var subscription: Subscription? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample)
        val typeface = PTTypefaceManager.getTypeface(this, getIntent().getIntExtra(INDEX, 0))
        sampleText.setTypeface(typeface)

        subscription = RxSeekBar.changes(seekBar)
                .map { i -> i + 12 }
                .subscribe { i ->
                    run {
                        text.setText(getResources().getString(R.string.choose_the_size) + " " + i + "sp")
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
        subscription?.unsubscribe()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        val id = item.getItemId()

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true
        }

        return super.onOptionsItemSelected(item)
    }
}
