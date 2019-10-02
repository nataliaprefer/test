package class1;

import java.util.Scanner;

public class Class1 {
	public static void main(String... args) {
		var n = readNumber();

		var result = sumEvenNumber(n);
		printResult(result);
		// odd - нечетное
		var result2 = summaVsehChisel(n, 1);
		printResult(result2); 
	}

	public static int readNumber() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ведите число n, для нахождения суммы четных чисел");
		var n = scanner.nextInt();
		return n;
	}

	public static void printResult(int result) {
		System.out.println("Наша сумма:" + result);
	}

	///// Сумма всех чисел
	public static int summaVsehChisel(int n, int step) {
		var result = 0;
		for (var i = 0; i <= n; i = i + step)
			result = result + i;
		return result;
		// odd - нечетное
	}

	// Функция сумма четных чисел
	public static int sumEvenNumber(int n) {
		var result = summaVsehChisel(n, 2);
		return result;
	}
}
