package com.codinginflow.imagesearchapp.data

import com.codinginflow.imagesearchapp.api.UnsplashApi
import javax.inject.Inject

class UnsplashRepository @Inject constructor(private val url: UnsplashApi) {
}