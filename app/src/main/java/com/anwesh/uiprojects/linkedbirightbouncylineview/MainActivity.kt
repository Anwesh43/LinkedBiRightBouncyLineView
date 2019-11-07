package com.anwesh.uiprojects.linkedbirightbouncylineview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.birightbouncylineview.BiRightBouncyLineView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        BiRightBouncyLineView.create(this)
    }
}
