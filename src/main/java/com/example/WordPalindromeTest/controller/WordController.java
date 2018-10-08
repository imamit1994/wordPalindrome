package com.example.WordPalindromeTest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.WordPalindromeTest.model.Word;

@RestController
@RequestMapping("/word")
public class WordController {

	@Autowired
	private Word word_obj;

	@RequestMapping(value = "/{word}")
	public Word palindrome(@PathVariable("word") String word) {
		word_obj.setWord(word);
		word_obj.setPalindrome(checkPalindrome(word));// checkPalindrome() will check for palindrome
		word_obj.setAnagramofPalindrome(anagramOfPalindrome(word));// anagramOfPalindrome() will check if any of anagram can form palindrome or not
		return word_obj;
	}

	private static boolean checkPalindrome(String s) {
		int length = s.length();
		s=s.trim();//to remove whitespace from both end of the word word if any 
		String reverse = "";

		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + s.charAt(i);
		}
		if (s.equals(reverse)) {
			return true;
		} else {
			return false;
		}
	}
	
	private static boolean anagramOfPalindrome(String str){ 
		str=str.trim();//to remove whitespace from both end of the word word if any
        int[] count = new int[256];  
        for (int i = 0; i < str.length(); i++) 
            count[str.charAt(i)]++;  
        int odd = 0; 
        for (int i = 0; i < 256; i++) { 
            if ((count[i] & 1) != 0) 
                odd++; 
            if (odd > 1) 
                return false; 
        } 
        return true; 
    } 
}
