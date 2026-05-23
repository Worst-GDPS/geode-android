package com.wrstgdps.geode

import androidx.annotation.Keep
import com.wrstgdps.geode.utils.Constants

@Keep
object LauncherFix {
    fun loadLibrary() {
        System.loadLibrary(Constants.LAUNCHER_FIX_LIB_NAME)
    }

    external fun setDataPath(dataPath: String)

    external fun setOriginalDataPath(dataPath: String)

    external fun enableExceptionsRenaming()

    external fun performPatches()
}