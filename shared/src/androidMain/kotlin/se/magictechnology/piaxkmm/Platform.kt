package se.magictechnology.piaxkmm

actual class Platform actual constructor() {
    actual val platform: String = "Android ${android.os.Build.VERSION.SDK_INT}"
}

actual class SparaSiffra {
    actual fun spara(siffra: Int) {
    }

    actual fun ladda(): Int {
        return 0
    }
}