/**
 * ����� ����������� ������ ������ ������
 *
 * @param n - ���������
 * @param d - �����������
 */
class Rational(n: Int, d: Int) {
  require(d != 0)

  private val g = gcd(n.abs, d.abs)
  val numer: Int = n / g
  val denom: Int = d / g

  def this(n: Int) = this(n, 1) // �������������� �����������

  override def toString: String = getClass.getName + "=" + numer + "/" + denom // �������������� toString

  /**
   * �������� ���������� � ������� ������
   *
   * @param that - ���������� �����
   * @return     - ����� ������
   */
  def + (that: Rational): Rational =
    new Rational(numer * that.denom + that.numer * denom, denom * that.denom)

  /**
   * �������� ������ ����� � ������� ������
   *
   * @param i - ����� �����
   * @return  - �����
   */
  def + (i: Int): Rational =
    new Rational(i * denom + numer, denom)

  /**
   * ��������� ���������� � ������� ������
   *
   * @param that - ���������� �����
   * @return     - ������������ ������
   */
  def * (that: Rational): Rational =
    new Rational(numer * that.numer, denom * that.denom)

  def lessThan(that: Rational): Boolean =
    this.numer * that.denom < that.numer * this.denom

  /**
   * ��������� ����� �� ������ ������
   *
   * @param that - ����� ��� ��������� � �������
   * @return     - ���������� �����
   */
  def max(that: Rational): Rational =
    if (this.lessThan(that)) that else this

  /**
   * ���������� ����������� ������ ��������
   *
   * @param a - ������ �����
   * @param b - ������ �����
   * @return  - ���
   */
  @scala.annotation.tailrec
  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)
}
