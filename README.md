- The docfile of the solutions are attached [here ](https://docs.google.com/document/d/13EB6p-ti2EWc10-giEn9ORfiY0ui8BCYummSHKMpk54/edit?usp=sharing)
# 1. Find The Second Highest Score from the Given CGPA
The code finds the second highest number in an array of doubles. It initializes `max` and `sHighest` to the first element of the array. As it iterates through the array:

1. If a number is greater than `max`, it updates `sHighest` to the current `max`, then sets `max` to this new number.
2. If a number is not greater than `max` but is greater than `sHighest`, it updates `sHighest`.

Finally, it prints the second highest number (`sHighest`). 

# 2. Sort given CGPA Scores According to the order of Highest CGPA.
The code sorts an array of doubles in descending order using a simple bubble sort algorithm. 

1. It iterates through the array with two nested loops.
2. The outer loop selects an element (`arr[i]`), and the inner loop compares it to the elements that follow (`arr[j]`).
3. If an element (`arr[j]`) is greater than the current element (`arr[i]`), they are swapped.
4. After sorting, it prints the elements of the array in order.

# 3. Search CGPA Using binary search Algorithm.
The code performs a binary search to find a specific CGPA in a sorted array. Here’s how it works:

1. It initializes an array of CGPA values and sorts it using `Arrays.sort()`.
2. It prompts the user to enter a CGPA to search for.
3. The binary search algorithm is implemented with two pointers, `low` and `high`, to find the target CGPA:
   - It calculates the middle index (`mid`) and compares the middle element to the target.
   - If the middle element matches the target, it sets a flag and stores the index.
   - If the middle element is less than the target, it adjusts `low`; if greater, it adjusts `high`.
4. After the search, it prints whether the target CGPA was found and its index, or a message indicating it wasn't found.

# 4. Generate 10 random integers ,print them and find max and min from them.
The code generates an array of 10 random integers between 1 and 9. Here's a brief summary of how it works:

1. It initializes an integer array and creates a `Random` object.
2. It fills the array with random integers and prints them.
3. It initializes `max` and `min` to the first element of the array.
4. It iterates through the array to find the maximum and minimum values by comparing each element to `max` and `min`.
5. Finally, it prints the maximum and minimum values found in the array.

# 5. Count Notes From the given amount.
The code counts and displays the number of currency notes needed to make a specified amount. Here's how it works:

1. It defines an array of note denominations (1000, 500, 200, etc.).
2. It prompts the user to enter a positive amount.
3. If the amount is valid, it iterates through the note denominations.
4. For each denomination, it calculates how many notes are needed and updates the remaining amount accordingly.
5. It prints the denomination and the count of notes for each type used.

# 6. Pattern Printing.
The code generates a pattern of numbers in a triangular format. Here's a brief summary:

1. The first loop (from 5 to 1) creates a decreasing pattern, printing numbers from 1 to `i` for each line.
2. The second loop (from 2 to 5) generates an increasing pattern, again printing numbers from 1 to `i`.
3. The result is a diamond-like shape of numbers, with the top half decreasing and the bottom half increasing.

# 7. Find out two lowest highest of babies.
The code finds and displays the two shortest heights from a list of baby heights entered by the user. Here's a concise summary:

1. It initializes an array to store the heights of 10 babies and prompts the user to input the values.
2. It uses a nested loop to sort the heights in ascending order using a simple bubble sort algorithm.
3. After sorting, it prints the two lowest heights (the first two elements of the sorted array).

# 8. Count words,chars,vowels, consonant from given string.
The code counts and displays the number of words, characters, vowels, and consonants in a given string. Here’s a brief summary:

1. It initializes a string and converts it to lowercase.
2. It sets up counters for words, characters, vowels, and consonants.
3. It iterates through each character in the string:
   - Increments the word count for spaces and the character count for non-space characters.
   - Increments the vowel count if the character is a vowel and the consonant count for non-space, non-vowel characters.
4. Finally, it adds one to the word count (to account for the last word) and prints the results.

# 9. Find the number of Occurance of characters in a String.
The code counts the occurrences of each character in a given string (ignoring spaces) and displays the results. Here's a brief summary:

1. It initializes a string and converts it to lowercase.
2. It creates a character array from the string.
3. It uses a `LinkedHashMap` to store characters and their counts while preserving the order of their first appearance.
4. It iterates through the character array:
   - If the character is not a space, it updates the count in the map (either adding a new entry or incrementing an existing one).
5. Finally, it prints each character along with its count.

# 10. Print Numbers which are not duplicate from the given array.
The code identifies and prints the numbers that appear only once in an array. Here's a brief summary:

1. It initializes an array of integers containing duplicates.
2. It uses a `HashMap` to count the occurrences of each number.
3. It iterates through the array, updating the count in the map for each number.
4. Finally, it loops through the map and prints each number that has a count of one, indicating it is not duplicated.

# 11. Remove vowels from a string.
The code removes vowels from a given string and handles multiple spaces. Here’s a brief summary:

1. It initializes a string and converts it to lowercase.
2. It creates a string of vowels and a `StringBuilder` to build the new string without vowels.
3. It iterates through the characters of the string, appending only non-vowel characters to the `StringBuilder`.
4. After removing vowels, it converts the result to a character array.
5. It prints each character, skipping any consecutive spaces, to ensure only single spaces are displayed between words.

# 12. Exract Digit from paragraph and calculate the price. 
The code calculates the total cost of purchasing a laptop and a mouse after applying a discount. Here’s a brief summary:

1. It defines a string containing product prices and quantities.
2. Using regex, it extracts all numeric values from the string and stores them in a list.
3. It retrieves the laptop price, mouse price, quantity, and discount percentage from the list.
4. It calculates the total price by adding the laptop price to the product of the mouse price and quantity.
5. It computes the discount amount and subtracts it from the total price.
6. Finally, it prints the final cost after the discount, formatted to two decimal places.



