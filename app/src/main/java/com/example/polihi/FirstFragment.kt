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

        items.add(ListItem(R.drawable.thumb1, "Language Basics - How to learn Them", "An in depth look at how...\nby Romi Stas", "FREE"))
        items.add(ListItem(R.drawable.thumb2, "English Language Learning", "Trying to learn english?...\nby Anthony Antwood", "sub"))
        items.add(ListItem(R.drawable.thumb3,"Lesson1: English for beginners","Perfect video for ...\nby Andreea Sedi","$5" ))
        items.add(ListItem(R.drawable.thumb4, "Join ULC LIVE lesson!","You can ask anything..\nby ULC","FREE"))
        items.add(ListItem(R.drawable.thumb5,"Learn to speak spanish","Spanish is one of the..\nby indiamart","$12"))
        items.add(ListItem(R.drawable.thumb6,"Croatian 1o1 lesson","Master the basics of Croati.. \nby croatian101","$25"))
        items.add(ListItem(R.drawable.thumb7,"Ukrainian Language Lessons","Beginner's First Steps in..\nby ucarain45","sub"))
        items.add(ListItem(R.drawable.thumb8,"Japanese body language","Want to learn to speak..\nby Hiroko","$40"))
        items.add(ListItem(R.drawable.thumb9,"Russian dictation L18","From Zero to Fluency..\nby Real Russian","sub"))
        items.add(ListItem(R.drawable.thumb10,"Language School L1","Best course to learn..\nby Emilia Blunt","sub"))

        val adapter = CustomAdapter(requireContext(), items)
        listView.adapter = adapter

        listView.setOnItemClickListener { parent, view, position, id ->
            // Navigate to VideoFragment when an item is clicked
            findNavController().navigate(R.id.action_FirstFragment_to_videoFragment2)
        }
    }

override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}