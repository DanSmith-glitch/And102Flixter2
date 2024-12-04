package com.example.moviepath
import android.support.annotation.Keep
import com.google.gson.annotations.SerializedName
import java.io.Serializable

@Keep
data class InMovie (
    @SerializedName("poster_path")
    var poster: String? = null,

    @SerializedName("title")
    var title: String? = null,

    @SerializedName("overview")
    var overview: String? = null,

    @SerializedName("release")
    var release: String? = null,

    @SerializedName("rating")
    var rating: String? = null
) : Serializable {}