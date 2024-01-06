package com.mozhimen.scank.zxing.test

import android.os.Bundle
import android.widget.Toast
import com.mozhimen.basick.elemk.androidx.appcompat.bases.databinding.BaseActivityVB
import com.mozhimen.scank.zxing.ScanKZxing
import com.mozhimen.scank.zxing.test.databinding.ActivityMainBinding

class MainActivity : BaseActivityVB<ActivityMainBinding>() {
    override fun initView(savedInstanceState: Bundle?) {
        vb.scankDemoBtnCreate.setOnClickListener {
            if (vb.scankDemoEdit.text.isEmpty()) {
                Toast.makeText(this, "请输入code", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            vb.scankDemoImg.setImageBitmap(
                ScanKZxing.createQRCodeBitmap(
                    vb.scankDemoEdit.text.toString(),
                    vb.scankDemoImg.width
                )
            )
        }
    }
}