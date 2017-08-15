package com.jy;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		DataWrap[] dataWraps = new DataWrap[] { new DataWrap(9, ""), new DataWrap(16, ""), new DataWrap(21, ""),
				new DataWrap(23, ""), new DataWrap(30, ""), new DataWrap(49, ""), new DataWrap(21, ""),
				new DataWrap(30, "") };

		System.out.println("排序前：" + Arrays.toString(dataWraps));

		bubbleSort(dataWraps);

		System.out.println("*********************排序结束*********************");

		System.out.println("排序后（从小到大）：" + Arrays.toString(dataWraps));
	}

	/**
	 * 冒泡排序
	 * 
	 * @param dataWraps
	 *            待排序的数组
	 */
	public static void bubbleSort(DataWrap[] dataWraps) {
		System.out.println("*********************开始排序*********************");
		int arrayLength = dataWraps.length;

		for (int i = 0; i < arrayLength - 1; i++) {
			// 当某趟没有交换，则表明整个数组已经处于排序状态，即可结束循环
			boolean isOrdered = true;

			for (int j = 0; j < arrayLength - 1 - i; j++) {
				if (dataWraps[j].compareTo(dataWraps[j + 1]) > 0) {
					swap(dataWraps, j, j + 1);
					isOrdered = false;
				}
			}
			// 每一趟后都打印出当前的排序结果
			System.out.println(Arrays.toString(dataWraps));
			// 当某趟没有交换，则表明整个数组已经处于排序状态，即可结束循环
			if (isOrdered)
				break;
		}
	}

	/**
	 * 交换数组中两个元素的值
	 * 
	 * @param dataWraps
	 *            待操作的数组
	 * @param i
	 *            其中一个待交换元素的索引
	 * @param j
	 *            另一个待交换元素的索引
	 */
	public static void swap(DataWrap[] dataWraps, int i, int j) {
		DataWrap temp = dataWraps[i];
		dataWraps[i] = dataWraps[j];
		dataWraps[j] = temp;
	}

}
