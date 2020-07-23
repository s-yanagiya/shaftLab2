package shaftLab2;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

class SampleTest {

	private Sample sample = new Sample();

	@Test
	public void getSecondLargestNumber_リストがnull() {
		// inputを設定
		List<Integer> input = null;

		// テストを実行
		String actual = sample.getSecondLargestNumber(input);

		// テスト期待値
		String expected = "リストが空です";

		// テスト結果を確認
		assertEquals(expected, actual);
	}

	@Test
	public void getSecondLargestNumber_リストが空() {
		// inputを設定
		List<Integer> input = new ArrayList<Integer>();

		// テストを実行
		String actual = sample.getSecondLargestNumber(input);

		// テスト期待値
		String expected = "リストが空です";

		// テスト結果を確認
		assertEquals(expected, actual);
	}

	@Test
	public void getSecondLargestNumber_リストの要素数が1() {
		// inputを設定
		List<Integer> input = Arrays.asList(200);

		// テストを実行
		String actual = sample.getSecondLargestNumber(input);

		// テスト期待値
		String expected = "2番目の数値がありません";

		// テスト結果を確認
		assertEquals(expected, actual);
	}

	@Test
	public void getSecondLargestNumber_リストの要素数が複数_数値が1種類() {
		// inputを設定
		List<Integer> input = Arrays.asList(200, 200, 200);

		// テストを実行
		String actual = sample.getSecondLargestNumber(input);

		// テスト期待値
		String expected = "2番目の数値がありません";

		// テスト結果を確認
		assertEquals(expected, actual);
	}

	@Test
	public void getSecondLargestNumber_リストの要素数が複数_数値が2種類_重複なし_昇順() {
		// inputを設定
		Integer expectedNumber = 200;
		List<Integer> input = Arrays.asList(expectedNumber, 300);

		// テストを実行
		String actual = sample.getSecondLargestNumber(input);

		// テスト期待値
		String expected = "2番目に大きいのは" + expectedNumber + "です";

		// テスト結果を確認
		assertEquals(expected, actual);
	}

	@Test
	public void getSecondLargestNumber_リストの要素数が複数_数値が2種類_重複なし_降順() {
		// inputを設定
		Integer expectedNumber = 200;
		List<Integer> input = Arrays.asList(300, expectedNumber);

		// テストを実行
		String actual = sample.getSecondLargestNumber(input);

		// テスト期待値
		String expected = "2番目に大きいのは" + expectedNumber + "です";

		// テスト結果を確認
		assertEquals(expected, actual);
	}

	@Test
	public void getSecondLargestNumber_リストの要素数が複数_数値が5種類_重複なし_昇順() {
		// inputを設定
		Integer expectedNumber = 200;
		List<Integer> input = Arrays.asList(10, 50, 100, expectedNumber, 300);

		// テストを実行
		String actual = sample.getSecondLargestNumber(input);

		// テスト期待値
		String expected = "2番目に大きいのは" + expectedNumber + "です";

		// テスト結果を確認
		assertEquals(expected, actual);
	}

	@Test
	public void getSecondLargestNumber_リストの要素数が複数_数値が5種類_重複なし_降順() {
		// inputを設定
		Integer expectedNumber = 200;
		List<Integer> input = Arrays.asList(300, expectedNumber, 100, 50, 10);

		// テストを実行
		String actual = sample.getSecondLargestNumber(input);

		// テスト期待値
		String expected = "2番目に大きいのは" + expectedNumber + "です";

		// テスト結果を確認
		assertEquals(expected, actual);
	}

	@Test
	public void getSecondLargestNumber_リストの要素数が複数_数値が5種類_重複あり_昇順() {
		// inputを設定
		Integer expectedNumber = 200;
		List<Integer> input = Arrays.asList(10, 50, 50, 100, 100, 100, expectedNumber, 300);

		// テストを実行
		String actual = sample.getSecondLargestNumber(input);

		// テスト期待値
		String expected = "2番目に大きいのは" + expectedNumber + "です";

		// テスト結果を確認
		assertEquals(expected, actual);
	}

	@Test
	public void getSecondLargestNumber_リストの要素数が複数_数値が5種類_重複あり_降順() {
		// inputを設定
		Integer expectedNumber = 200;
		List<Integer> input = Arrays.asList(300, 300, expectedNumber, expectedNumber, expectedNumber, expectedNumber, 100, 50, 10, 10);

		// テストを実行
		String actual = sample.getSecondLargestNumber(input);

		// テスト期待値
		String expected = "2番目に大きいのは" + expectedNumber + "です";

		// テスト結果を確認
		assertEquals(expected, actual);
	}

	@Test
	public void getSecondLargestNumber_リストの要素数が複数_数値が5種類_重複なし_ランダム() {
		// inputを設定
		Integer expectedNumber = 200;
		List<Integer> input = Arrays.asList(50, 10, 300, expectedNumber, 100);

		// テストを実行
		String actual = sample.getSecondLargestNumber(input);

		// テスト期待値
		String expected = "2番目に大きいのは" + expectedNumber + "です";

		// テスト結果を確認
		assertEquals(expected, actual);
	}

	@Test
	public void getSecondLargestNumber_リストの要素数が複数_数値が5種類_重複あり_ランダム() {
		// inputを設定
		Integer expectedNumber = 200;
		List<Integer> input = Arrays.asList(expectedNumber, 50, 10, 10, 50, 300, expectedNumber, 100, 300, 100, expectedNumber);

		// テストを実行
		String actual = sample.getSecondLargestNumber(input);

		// テスト期待値
		String expected = "2番目に大きいのは" + expectedNumber + "です";

		// テスト結果を確認
		assertEquals(expected, actual);
	}

}
