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

However, this form of encryption is not very secure. In fact, it is not secure at all. Someone trying to crack this would only have to try 26 different combinations for the cipher table, which is a trivial task for a computer.

The Vigenere Cipher improves upon this by using multiple substitution alphabets.

## The Vigenere Cipher
The cipher table for a Vigenere cipher consists of the alphabet written out 26 times in 26 different rows, each alphabet shifted one letter to the left compared to the previous alphabet.  
The alphabet used for substitution depends on a keyword, known as our key.

This is what the table looks like for the Vigenere Cipher:

A|B|C|D|E|F|G|H|I|J|K|L|M|N|O|P|Q|R|S|T|U|V|W|X|Y|Z
:-----:|:-----:|:-----:|:-----:|:-----:|:-----:|:-----:|:-----:|:-----:|:-----:|:-----:|:-----:|:-----:|:-----:|:-----:|:-----:|:-----:|:-----:|:-----:|:-----:|:-----:|:-----:|:-----:|:-----:|:-----:|:-----:
B|C|D|E|F|G|H|I|J|K|L|M|N|O|P|Q|R|S|T|U|V|W|X|Y|Z|A
C|D|E|F|G|H|I|J|K|L|M|N|O|P|Q|R|S|T|U|V|W|X|Y|Z|A|B
D|E|F|G|H|I|J|K|L|M|N|O|P|Q|R|S|T|U|V|W|X|Y|Z|A|B|C
E|F|G|H|I|J|K|L|M|N|O|P|Q|R|S|T|U|V|W|X|Y|Z|A|B|C|D
F|G|H|I|J|K|L|M|N|O|P|Q|R|S|T|U|V|W|X|Y|Z|A|B|C|D|E
G|H|I|J|K|L|M|N|O|P|Q|R|S|T|U|V|W|X|Y|Z|A|B|C|D|E|F
H|I|J|K|L|M|N|O|P|Q|R|S|T|U|V|W|X|Y|Z|A|B|C|D|E|F|G
I|J|K|L|M|N|O|P|Q|R|S|T|U|V|W|X|Y|Z|A|B|C|D|E|F|G|H
J|K|L|M|N|O|P|Q|R|S|T|U|V|W|X|Y|Z|A|B|C|D|E|F|G|H|I
K|L|M|N|O|P|Q|R|S|T|U|V|W|X|Y|Z|A|B|C|D|E|F|G|H|I|J
L|M|N|O|P|Q|R|S|T|U|V|W|X|Y|Z|A|B|C|D|E|F|G|H|I|J|K
M|N|O|P|Q|R|S|T|U|V|W|X|Y|Z|A|B|C|D|E|F|G|H|I|J|K|L
N|O|P|Q|R|S|T|U|V|W|X|Y|Z|A|B|C|D|E|F|G|H|I|J|K|L|M
O|P|Q|R|S|T|U|V|W|X|Y|Z|A|B|C|D|E|F|G|H|I|J|K|L|M|N
P|Q|R|S|T|U|V|W|X|Y|Z|A|B|C|D|E|F|G|H|I|J|K|L|M|N|O
Q|R|S|T|U|V|W|X|Y|Z|A|B|C|D|E|F|G|H|I|J|K|L|M|N|O|P
R|S|T|U|V|W|X|Y|Z|A|B|C|D|E|F|G|H|I|J|K|L|M|N|O|P|Q
S|T|U|V|W|X|Y|Z|A|B|C|D|E|F|G|H|I|J|K|L|M|N|O|P|Q|R
T|U|V|W|X|Y|Z|A|B|C|D|E|F|G|H|I|J|K|L|M|N|O|P|Q|R|S
U|V|W|X|Y|Z|A|B|C|D|E|F|G|H|I|J|K|L|M|N|O|P|Q|R|S|T
V|W|X|Y|Z|A|B|C|D|E|F|G|H|I|J|K|L|M|N|O|P|Q|R|S|T|U
W|X|Y|Z|A|B|C|D|E|F|G|H|I|J|K|L|M|N|O|P|Q|R|S|T|U|V
X|Y|Z|A|B|C|D|E|F|G|H|I|J|K|L|M|N|O|P|Q|R|S|T|U|V|W
Y|Z|A|B|C|D|E|F|G|H|I|J|K|L|M|N|O|P|Q|R|S|T|U|V|W|X
Z|A|B|C|D|E|F|G|H|I|J|K|L|M|N|O|P|Q|R|S|T|U|V|W|X|Y

Here is an example of using the viginere cipher to encrypt a string of text.

For this example, I'll be using my first name, jaeheon, as the text to encrypt, and my last name, shim, as the key.

**Step 1** 
Step 1 is to repeat my key until it is the same length as the text I want to encrypt. Likewise, if my key was longer than the text, it would be truncated to match the length.

shimshi 

As you can see, I repeated the key and then truncated it to fit the length of my text but not exceed it. In practice there would not be a huge problem if the key was longer than the text, but it is still good to trim it so that we can avoid code errors.

**Step 2**
The second step is to actually encode the letters.
For every letter in my text, I will first find the row in the cipher table that starts with the corresponding letter of the key. For example, if I wanted to encode the second letter of my name I would need to find the row that starts with h, since that is the second letter of my key.

A|B|C|D|E|F|G|H|I|J|K|L|M|N|O|P|Q|R|S|T|U|V|W|X|Y|Z
:-----:|:-----:|:-----:|:-----:|:-----:|:-----:|:-----:|:-----:|:-----:|:-----:|:-----:|:-----:|:-----:|:-----:|:-----:|:-----:|:-----:|:-----:|:-----:|:-----:|:-----:|:-----:|:-----:|:-----:|:-----:|:-----:
H|I|J|K|L|M|N|O|P|Q|R|S|T|U|V|W|X|Y|Z|A|B|C|D|E|F|G

Now to find the actual letter to substitute, we can treat this as a normal substitution cipher and get the letter that corresponds with the second letter in the text to encrypt. In this case that would be h, because **a** corresponds with **h** in the table. This can be repeated with every letter in the text being encrypted.

By using this process, the shift of the substitution table is determined by the key, and there are multiple degrees of shifting as not every letter in the key is the same.

The same process can be repeated backwards to decrypt text.

My...   
[GitHub Profile](https://github.com/jaeheonshim)   
[Twitter Handle](https://twitter.com/jaeheonshim)   
[Personal Blog](https://jaeheonshim.com) 