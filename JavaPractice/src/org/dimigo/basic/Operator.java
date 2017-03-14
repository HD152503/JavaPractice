/**
 * 
 */
package org.dimigo.basic;

/**
* <pre>
*  org.dimigo.basic
*	|_ Operator
*
* 1. 개요 :
* 2. 작성일 : 2017. 3. 14.
* </pre>
 * @author : kisejun
 * @version : 1.0
 */
public class Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int price = 1700000;
		int employer = 3;
		int number = 1500;
		
		
		System.out.println("<< 디미베네 연간 인건비 >>");
		System.out.println("월 평균 급여 : " + String.format("%,d", price) + "원");
		System.out.println("점포 내 직원 수 : " +employer + "명");
		System.out.println("점포 수 : " + String.format("%,d",number) + "개");
		System.out.println("");
		System.out.println("연간 인건비 : " +String.format("%,d", (long)price*12*employer*number) + "원");
		

	}

}
