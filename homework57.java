/**
Написать игру "Угадай число".
Суть игры: программа "запоминает" случайное число в диапазоне от 1 до 100 включительно (каждый запуск программы число должно быть другим). Пользователь последовательно вводит числа с клавиатуры, пытаясь угадать это число. На каждую попытку программа выдаёт подсказку:
 - если загаданое число больше введеного: "Try again - guessed number is bigger"
 - если загаданое число меньше введеного: "Try again - guessed number is smaller"
Пользователь вводит числа до тех пор, пока не угадает число. Когда число угадано, программа печатает поздравление следующего вида:
 - если число попыток меньше 3: "You guessed a number, but looks like you're a cheater!"
 - если число попыток меньше 7, но больше 3 (включая): "Congrats, you guessed a number!"
 - если число попыток больше 7 (включая): "You guessed a number, but can be better!"

Пример работы программы (загаданое число - 30):  
 Guess a number: 10
Try again - guessed number is bigger
20
Try again - guessed number is bigger
40
Try again - guessed number is smaller
30
Congrats, you guessed a number!

Подсказка номер 1: Для ввода числа из клавиатуры воспользоваться классом Scanner, примеры взять в интернете или у коллег по фабрике.
Подсказка номер 2: В процессе тестирования и отладки вашей программы загаданное число можно выводить в самом начале, а в конце печатать количество попыток. Например:

Guess a number (30):
...
Congrats, you guessed a number! (4)
*/

import java.io.*; //

public class homework57
{
	public static void main(String[] args) throws Exception
	{
		int magicNumber = 1+(int)(Math.random() *100); //загадываем число
		int readNumb = 0; // обьявляем и инициализируем переменную для ввода с клавиатуры
		int counter = 0; // обьявляем переменную
		
		System.out.println("Unknown number in the range 1 to 100 - Guess !?");
		BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
		
		do {
			readNumb = Integer.parseInt(reader.readLine()); //читаем строку и парсим ее сразу в целочисленную переменную
			counter++;
			if (magicNumber > readNumb) System.out.println("Try again - guessed number is bigger");
			if (magicNumber < readNumb) System.out.println("Try again - guessed number is smaller");
			}
		while (!(magicNumber==readNumb));
		
		if (counter < 3) System.out.println("You guessed a number, but looks like you're a cheater!");
		else if (counter >= 3 && counter < 7) System.out.println("Congrats, you guessed a number!");
		else if (counter >= 7) System.out.println("You guessed a number, but can be better!");
	}
}