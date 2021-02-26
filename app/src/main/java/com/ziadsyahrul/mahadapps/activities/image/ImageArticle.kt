package com.ziadsyahrul.mahadapps.activities.image

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ImageArticle(
    val imageSrc : Int,
    val imageTitle: String,
    val imageDesc : String
): Parcelable