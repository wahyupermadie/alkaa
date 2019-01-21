package com.escodro.alkaa.framework.extension

import androidx.test.uiautomator.By
import androidx.test.uiautomator.UiDevice
import androidx.test.uiautomator.Until

/**
 * Waits for the device launcher to appear on the screen.
 *
 * @param timeout maximum amount of time to wait in milliseconds
 */
fun UiDevice.waitForLaucher(timeout: Long = 1000) =
    wait(Until.hasObject(By.pkg(launcherPackageName).depth(0)), timeout)
