package se.magictechnology.piaxkmm

import platform.Foundation.NSUserDefaults
import platform.UIKit.UIDevice
import platform.darwin.NSInteger

actual class Platform actual constructor() {
    actual val platform: String = UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion
}


class dummygrej {

    fun dummysak()
    {
        NSUserDefaults.standardUserDefaults.setInteger(7, "siffra")
    }

}

actual class SparaSiffra {
    actual fun spara(siffra: Int) {
        NSUserDefaults.standardUserDefaults.setInteger(siffra.toLong(), "siffra")
    }

    actual fun ladda(): Int {

        if(NSUserDefaults.standardUserDefaults.objectForKey("siffra") != null)
        {
            var siffra = NSUserDefaults.standardUserDefaults.integerForKey("siffra")
            return siffra.toInt()
        }

        return 0
    }
}