package com.looxidlabs.carrotcloning.home.ui


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager
import com.looxidlabs.carrotcloning.R
import com.looxidlabs.carrotcloning.home.adapter.HomeFragmentAdapter
import com.looxidlabs.carrotcloning.home.data.HomeFragmentData
import com.looxidlabs.carrotcloning.home.viewmodel.HomeFragmentViewModel

class HomeFragment : Fragment(), View.OnClickListener {

    lateinit var homeFragmentViewModel : HomeFragmentViewModel
    lateinit var homeFragmentAdapter : HomeFragmentAdapter
    lateinit var requestManager : RequestManager
    lateinit var rvHome : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestManager = Glide.with(requireContext())
        homeFragmentAdapter = HomeFragmentAdapter(requestManager)
        homeFragmentViewModel = ViewModelProvider(this).get(HomeFragmentViewModel::class.java)

        val data1 = HomeFragmentData(1, R.drawable.ic_alarm, "1번", "중계동", "10000원")
        val data2 = HomeFragmentData(2, R.drawable.ic_chat_basic, "1번", "중계동", "10000원")
        val data3 = HomeFragmentData(3, R.drawable.ic_home_selected, "1번", "중계동", "10000원")
        val data4 = HomeFragmentData(4, R.drawable.ic_home_selected, "1번", "중계동", "10000원")
        val data5 = HomeFragmentData(5, R.drawable.ic_hamburger, "1번", "중계동", "10000원")

        homeFragmentViewModel.insert(data1)
        homeFragmentViewModel.insert(data2)
        homeFragmentViewModel.insert(data3)
        homeFragmentViewModel.insert(data4)
        homeFragmentViewModel.insert(data5)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onStart() {
        super.onStart()

        rvHome = requireActivity().findViewById(R.id.rv_home_items)

        val lm = LinearLayoutManager(context)
        rvHome.adapter = homeFragmentAdapter
        rvHome.layoutManager = lm

        homeFragmentViewModel.getAll()?.observe(this, Observer<List<HomeFragmentData>> { homeFragmentData ->
            // Update UI
            homeFragmentAdapter.setItems(homeFragmentData)
        })

    }

    override fun onClick(v: View?) {
        //click event
    }

}