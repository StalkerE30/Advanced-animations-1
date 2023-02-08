package ru.netology.statsview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.netology.R
import ru.netology.statsview.ui.Statsview


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val view = findViewById<Statsview>(R.id.statsView)
        view.postDelayed({
        view.data =  listOf(
                50F,
                50F,
                50F,
                50F,
            )
        }, 3000)

//        val textView = findViewById<TextView>(R.id.label)
//        view.startAnimation(
//            AnimationUtils.loadAnimation(this,R.anim.view_animation).apply {
//                setAnimationListener(object: Animation.AnimationListener{
//                    override fun onAnimationStart(p0: Animation?) {
//                        textView.text = "onAnimationStart"
//                    }
//
//                    override fun onAnimationEnd(p0: Animation?) {
//                        textView.text = "onAnimationEnd"
//                    }
//
//                    override fun onAnimationRepeat(p0: Animation?) {
//                        textView.text = "onAnimationRepeat"
//                    }
//
//                })
//
//
//            }
//        )
    }
}