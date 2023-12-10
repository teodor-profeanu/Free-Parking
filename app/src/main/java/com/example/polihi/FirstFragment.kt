package com.example.polihi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import androidx.navigation.fragment.findNavController
import com.example.polihi.databinding.FragmentFirstBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

private var _binding: FragmentFirstBinding? = null
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

      _binding = FragmentFirstBinding.inflate(inflater, container, false)
      return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.feedButton.setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_feedFragment)
        }

        binding.userButton.setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_loginFragment)
        }

        val listView = binding.lessonsListView
        val items = ArrayList<ListItem>()
        items.add(ListItem(R.drawable.thumb1, "Language Basics - How to learn Them", "An in depth look at how...\nby Romi Stas", "$"))
        items.add(ListItem(R.drawable.thumb2, "English Language Learning", "Trying to learn english?...\nby Anthony Antwood", ""))
        val adapter = CustomAdapter(requireContext(), items)
        listView.adapter = adapter
    }

override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}