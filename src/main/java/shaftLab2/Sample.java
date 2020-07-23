package shaftLab2;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class Sample {
	public String getSecondLargestNumber(List<Integer> numList) {

		if(numList == null || numList.isEmpty()) {
			return "リストが空です";
		}

		// リストには同じ値がふくまれている可能性があるため、setに変換する
		// この時、デフォルトで昇順となっている
		SortedSet<Integer> numSet = new TreeSet<>(numList);
		if(numSet.size() == 1) {
			return "2番目の数値がありません";
		}

		// 再度リストに変換して後ろから2番目を取得する
		List<Integer> list = new ArrayList<Integer>(numSet);
		Integer secondLargestNumber = list.get(list.size() - 2);

		return "2番目に大きいのは" + secondLargestNumber + "です";
	}
}
