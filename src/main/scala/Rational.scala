/**
 * Класс реализующий логику работы дробей
 *
 * @param n - числитель
 * @param d - знаменатель
 */
class Rational(n: Int, d: Int) {
  require(d != 0)

  private val g = gcd(n.abs, d.abs)
  val numer: Int = n / g
  val denom: Int = d / g

  def this(n: Int) = this(n, 1) // дополнительный конструктор

  override def toString: String = getClass.getName + "=" + numer + "/" + denom // переопределние toString

  /**
   * Сложение переданной и текущей дробей
   *
   * @param that - переданная дробь
   * @return     - сумма дробей
   */
  def + (that: Rational): Rational =
    new Rational(numer * that.denom + that.numer * denom, denom * that.denom)

  /**
   * Сложение целого числа и текущей дробей
   *
   * @param i - целое число
   * @return  - сумма
   */
  def + (i: Int): Rational =
    new Rational(i * denom + numer, denom)

  /**
   * Умножение переданной и текущей дробей
   *
   * @param that - переданная дробь
   * @return     - произведение дробей
   */
  def * (that: Rational): Rational =
    new Rational(numer * that.numer, denom * that.denom)

  def lessThan(that: Rational): Boolean =
    this.numer * that.denom < that.numer * this.denom

  /**
   * Выисление какая из дробей больше
   *
   * @param that - дробь для сравнения с текущей
   * @return     - наибольшая дробь
   */
  def max(that: Rational): Rational =
    if (this.lessThan(that)) that else this

  /**
   * Вычисление наибольшего общего делителя
   *
   * @param a - первое число
   * @param b - второе число
   * @return  - НОД
   */
  @scala.annotation.tailrec
  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)
}
