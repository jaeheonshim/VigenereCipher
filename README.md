# Vigenere Cipher
An implementation of the Vigenere Cipher, a simple form of a polyalphabetic cipher.

## How to use this program
In the source files, there is a class named Main which contains a main method. Executing that method will provide you with a console application for using the Vigenere cipher. Furthermore, all code for the actual cipher is located in the Cipher class, so you can build upon that code if you wish.

## Polyalphabetic Substitution
Polyalphabetic substitution is a method for encrypting text using a substitution alphabet. This means that letters from the original text get substituted into an alphabet to encrypt them. To decrypt the text, you need only the shift value and perform the substitution process backwards.   
 
Below is an example of a simple case of polyalphabetic substitution.

**A**|**B**|**C**|**D**|**E**|**F**|**G**|**H**|**I**|**J**|**K**|**L**|**M**|**N**|**O**|**P**|**Q**|**R**|**S**|**T**|**U**|**V**|**W**|**X**|**Y**|**Z**
:-----:|:-----:|:-----:|:-----:|:-----:|:-----:|:-----:|:-----:|:-----:|:-----:|:-----:|:-----:|:-----:|:-----:|:-----:|:-----:|:-----:|:-----:|:-----:|:-----:|:-----:|:-----:|:-----:|:-----:|:-----:|:-----:
**Z**|**A**|**B**|**C**|**D**|**E**|**F**|**G**|**H**|**I**|**J**|**K**|**L**|**M**|**N**|**O**|**P**|**Q**|**R**|**S**|**T**|**U**|**V**|**W**|**X**|**Y**

This cipher table is just the alphabet shifted to the right by one letter. This table can be used to substitute letters and encode text:

Jaeheon Shim -----> IZDGDNM RGHL

To form this encoding, I just found the letters of my name one by one on the first row of the text, and replaced that letter with the one directly below the row.

However, this form of encryption is not very secure. In fact, it is not secure at all. Someone trying to crack this would only have to try 26 different combinations for the cipher table, which is trivial for a computer.

The Vigenere Cipher improves upon this by using multiple substitution alphabets.

## The Vigenere Cipher
