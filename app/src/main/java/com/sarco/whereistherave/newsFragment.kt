package com.sarco.whereistherave

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sarco.whereistherave.databinding.FragmentNewsBinding

class newsFragment : Fragment() {
    // TODO: Rename and change types of parameters

    private lateinit var mBinding: FragmentNewsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        mBinding = FragmentNewsBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return mBinding.root
    }

}