package com.example.movieshow.tvshow

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.example.movieshow.R
import com.example.movieshow.databinding.FragmentMovieBinding
import com.example.movieshow.databinding.FragmentTvshowBinding
import com.example.movieshow.movie.MovieListAdapter
import com.example.movieshow.viewmodel.MovieViewModel
import com.example.movieshow.viewmodel.TvshowViewModel
import com.example.movieshow.viewmodel.ViewModelFactory

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [TvshowFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class TvshowFragment : Fragment() {
    lateinit var fragmentTvshowBinding: FragmentTvshowBinding

    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        fragmentTvshowBinding = FragmentTvshowBinding.inflate(layoutInflater, container, false)
        return fragmentTvshowBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (activity != null) {

            val factory = ViewModelFactory.getInstance(requireActivity())
            val viewModel = ViewModelProvider(this, factory)[TvshowViewModel::class.java]

            val tvAdapter = TvshowListAdapter()
            viewModel.getTv().observe(viewLifecycleOwner, {tv ->
                tvAdapter.setTvshow(tv)
                tvAdapter.notifyDataSetChanged()
            })

            with(fragmentTvshowBinding.rvTv) {
                layoutManager = GridLayoutManager(context,2)
                setHasFixedSize(true)
                adapter = tvAdapter
            }
        }
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment TvshowFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            TvshowFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}