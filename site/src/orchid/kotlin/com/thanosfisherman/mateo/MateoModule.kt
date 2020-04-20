package com.thanosfisherman.mateo

import com.eden.orchid.api.registration.OrchidModule
import com.eden.orchid.api.theme.Theme
import com.eden.orchid.utilities.addToSet

class MateoModule : OrchidModule() {

    override fun configure() {
        addToSet<Theme, MateoTheme>()
    }
}
