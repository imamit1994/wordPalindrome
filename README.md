# wordPalindrome
this is the simple spring boot application which is use to find weather a word is palindrome or any of its anagram can be palindrome or not using rest web services

#sample input
http://localhost:8080/word/bzzubu

#samnple output
{
    "word": "bzzubu",
    "palindrome": false,
    "anagramofPalindrome": true
}


# class responsblity 
package: com.example.WordPalindromeTest
classs: WordPalindromeTestApplication
this class has main method which is used to start application

package : com.example.WordPalindromeTest.controller
class : WordController

WordController class contain all the logic for the application it has three methods
1)palindrome(@PathVariable("word") String word): this method is used for the url mapping
2)checkPalindrome(String s): This method will check weather string is palindrome or not
3)anagramOfPalindrome(String str): This method will check if any of anagram of input string can be palindrome or not

package: com.example.WordPalindromeTest.model
class: Word
simple pojo class
