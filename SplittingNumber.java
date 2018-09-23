/*
Задача 128: "Максимальное" разбиение числа
Задача: дано натуральное числа N. Необходимо разложить его на натуральные слагаемые таким образом, чтобы их произведение было максимальным.
Входные данные: N - натуральное число от 4 до 100
Вывод: максимальное произведение слагаемых при разбиении числа N
Пример:
N = 5
Answer = 6 (5 = 2 + 3 -> 2 * 3 = 6)


Число нужно разбивать на слагаемые: 2, или 3. 
Слагаемое "1" - сразу отбрасываем, т.к. оно никак нее влияет на произведение. 
Любые другие числа >3, можно разложить на более мелкие, которые дадут большее произведение: a+b <= a*b, a>=2, b>=2
Рассмотрим число 6:
	6 = 2 + 2 + 2, 2*2*2 = 8
	6 = 3 + 3, 3*3 = 9
Таким образом, лучше разбивать число на максимальное кол-во 3-ек, и минимум 2-ек
*/
public class SplittingNumber {

	public static long getMaxProduct(int number) {
		long maxProduct = 0;
		if (number % 3 == 0) {
			maxProduct = (long) Math.pow(3, number / 3);
		} else if (number % 3 == 1) {
			maxProduct = 2 * 2 * (long) Math.pow(3, (number - 2 - 2) / 3);
		} else if (number % 3 == 2) {
			maxProduct = 2 * (long) Math.pow(3, (number - 2) / 3);
		}
		return maxProduct;
	}
	
	public static void main(String[] args) {
		System.out.printf("Max product of summands of number %d: %d\n", 5, getMaxProduct(5));
		System.out.printf("Max product of summands of number %d: %d\n", 10, getMaxProduct(10));
		System.out.printf("Max product of summands of number %d: %d\n", 20, getMaxProduct(20));
		System.out.printf("Max product of summands of number %d: %d\n", 100, getMaxProduct(100));
	}
}
