package com.example.polihi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.polihi.databinding.FeedBinding

class FeedFragment : Fragment() {

    private var _binding: FeedBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FeedBinding.inflate(inflater, container, false)

        binding.lessonsButton.setOnClickListener {
            findNavController().navigate(R.id.action_feedFragment_to_FirstFragment)
        }

        val listView = binding.lessonsListView
        val items = ArrayList<ListItem>()
        items.add(
            ListItem(
                R.drawable.thumb2,
                "English Language Learning",
                "Trying to learn english?...\nby Anthony Antwood",
                ""
            )
        )
        val adapter = CustomAdapter(requireContext(), items)
        listView.adapter = adapter

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}