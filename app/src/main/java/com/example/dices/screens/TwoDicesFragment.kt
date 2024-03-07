package com.example.dices.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.dices.R
import com.example.dices.databinding.FragmentTwoDicesBinding

class TwoDicesFragment : Fragment() {
    lateinit var binding: FragmentTwoDicesBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTwoDicesBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        rollDice()
        binding.button2.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val dice = OneDiceFragment.Dice(6)
        val dice2 = OneDiceFragment.Dice(6)
        val cubeRoll = dice.roll()
        val cubeRoll2 = dice2.roll()
        val diceImage = binding.imDice1
        val diceImage2 = binding.imDice2
        when (cubeRoll) {
            1 -> diceImage.setImageResource(R.drawable.dice_1)
            2 -> diceImage.setImageResource(R.drawable.dice_2)
            3 -> diceImage.setImageResource(R.drawable.dice_3)
            4 -> diceImage.setImageResource(R.drawable.dice_4)
            5 -> diceImage.setImageResource(R.drawable.dice_5)
            6 -> diceImage.setImageResource(R.drawable.dice_6)
        }
        when (cubeRoll2) {
            1 -> diceImage2.setImageResource(R.drawable.dice_1)
            2 -> diceImage2.setImageResource(R.drawable.dice_2)
            3 -> diceImage2.setImageResource(R.drawable.dice_3)
            4 -> diceImage2.setImageResource(R.drawable.dice_4)
            5 -> diceImage2.setImageResource(R.drawable.dice_5)
            6 -> diceImage2.setImageResource(R.drawable.dice_6)
        }

    }
}