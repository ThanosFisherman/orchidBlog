package com.thanosfisherman.mateo

import com.eden.orchid.api.OrchidContext
import com.eden.orchid.api.options.annotations.*
import com.eden.orchid.api.options.archetypes.ConfigArchetype
import com.eden.orchid.api.theme.Theme
import com.eden.orchid.api.theme.assets.CssPage
import javax.inject.Inject

@Description("A theme based on the Bootstrap 3 documentation, and good for code documentation.", name = "Mateo")
@Archetype(value = ConfigArchetype::class, key = "Mateo")
class MateoTheme @Inject constructor(
    context: OrchidContext
) : Theme(context, "MateoTheme") {

    override fun loadAssets() {
        // these assets include relative references to font files, which become invalid if the asset it downloaded locally and so need to stay as external assets even in production
        addCss(
            CssPage(
                this,
                "theme",
                context.getResourceEntry(
                    "https://unpkg.com/ionicons@4.2.2/dist/css/ionicons.min.css",
                    null
                ),
                "font-awesome.min",
                null
            )
        )
        addCss(
            CssPage(
                this,
                "theme",
                context.getResourceEntry(
                    "https://fonts.googleapis.com/css?family=Source+Sans+Pro:400,600",
                    null
                ),
                "font-awesome.min",
                null
            )
        )
        addCss(
            CssPage(
                this,
                "theme",
                context.getResourceEntry(
                    "https://fonts.googleapis.com/css?family=Prata&display",
                    null
                ),
                "font-awesome.min",
                null
            )
        )
        addCss("assets/css/main.scss")

        // add JS assets
        addJs("assets/js/vendors/jquery-3.3.1.min.js")
        addJs("assets/js/vendors/simple-jekyll-search.min.js")
        addJs("assets/js/vendors/slick.min.js")

        addJs("assets/js/vendors/instafeed.min.js")
        addJs("assets/js/vendors/jquery.fitvids.js")
        addJs("assets/js/vendors/masonry.pkgd.min.js")
        addJs("assets/js/vendors/imagesloaded.pkgd.min.js")
        addJs("assets/js/vendors/transition.js")
        addJs("assets/js/vendors/zoom.min.js")
        addJs("assets/js/common.js")
    }
}
