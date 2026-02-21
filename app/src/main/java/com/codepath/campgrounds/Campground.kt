package com.codepath.campgrounds

import android.support.annotation.Keep
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

// TODO: Create a data class for the Data Response
@Keep
@Serializable
data class CampgroundResponse(
    @SerialName("results")
    val data: List<Campground>?
)

// TODO: Implement remaining keys of the Campground data class
@Keep
@Serializable
data class Campground(
    @SerialName("title")
    val name: String?,
    @SerialName("overview")
    val description: String?,
    @SerialName("poster_path")
    val posterPath: String?,
    @SerialName("backdrop_path")
    val backdropPath: String?
) : java.io.Serializable {
    val posterImageUrl: String
        get() = if (!posterPath.isNullOrEmpty())
            "https://image.tmdb.org/t/p/w500$posterPath"
        else ""

    val backdropImageUrl: String
        get() = if (!backdropPath.isNullOrEmpty())
            "https://image.tmdb.org/t/p/w780$backdropPath"
        else ""
}


// TODO: Create a data class for the Image Response
@Keep
@Serializable
data class CampgroundImage(
    @SerialName("url") val url: String?,
    @SerialName("title") val title: String?
) : java.io.Serializable