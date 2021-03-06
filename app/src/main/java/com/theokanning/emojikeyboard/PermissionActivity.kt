package com.theokanning.emojikeyboard

import android.Manifest
import android.app.Activity
import android.os.Bundle
import android.support.v4.app.ActivityCompat

/**
 * Activity that currently only exists to request camera permission
 */
class PermissionActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_permission)
    }

    override fun onResume() {
        super.onResume()
        ActivityCompat.requestPermissions(
                this,
                arrayOf(Manifest.permission.CAMERA),
                PERMISSION_CAMERA_REQUEST_CODE)
    }

    override fun onRequestPermissionsResult(requestCode: Int,
                                            permissions: Array<String>,
                                            grantResults: IntArray) {
        // leave and remove task regardless of result
        finishAndRemoveTask()
    }

    companion object {
        private val PERMISSION_CAMERA_REQUEST_CODE = 123
    }
}
