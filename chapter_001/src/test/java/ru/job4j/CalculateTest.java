package ru.job4j;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *Описание класса CalculateTest
 *
 *@author Ramil' Gilyazev 
 *@version task 1.4
 *@since 07.10.2017
 */
 public class CalculateTest{
/**
* Test echo method.
*/ @Test
public void whenTakeNameThenThreeEchoPlusName(){
	String input = "Ramil";
	String expect = "Echo,echo,echo:Ramil";
	Calculate calc = new Calculate();
	String result = calc.echo(input);
	assertThat(result,is(expect));
	}
 }