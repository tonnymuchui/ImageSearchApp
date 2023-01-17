package com.codinginflow.imagesearchapp.ui.gallery

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.codinginflow.imagesearchapp.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class GalleryFragment: Fragment(R.layout.fragment_gallery) {
    private val viewModel by viewModels<GalleryViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.photos.observe(viewLifecycleOwner){

        }
    }
}