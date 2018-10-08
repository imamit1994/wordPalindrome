package com.example.WordPalindromeTest.model;

import org.springframework.stereotype.Component;

@Component
public class Word {
	private String word;
	private boolean palindrome;
	private boolean anagramofPalindrome;
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public boolean isPalindrome() {
		return palindrome;
	}
	public void setPalindrome(boolean palindrome) {
		this.palindrome = palindrome;
	}
	public boolean isAnagramofPalindrome() {
		return anagramofPalindrome;
	}
	public void setAnagramofPalindrome(boolean anagramofPalindrome) {
		this.anagramofPalindrome = anagramofPalindrome;
	}
	
	
}
