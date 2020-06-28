package br.com.codenation;

import java.util.*;

public class StatisticUtil {

	public static int average(int[] elements) {
		int sum = 0;
		for (int element : elements) {
			sum += element;
		}
		return sum / elements.length;
	}

	public static int mode(int[] elements) {
		int maior = 0;
		int result = 0;
		int count = 0;
		for (int element : elements) {
			for(int x : elements){
				if(x == element){
					count++;
				}
			}
			if(count > maior){
				maior = count;
				result = element;
			}
		}
		return result;
	}

	public static int median(int[] elements) {
		Arrays.sort(elements);
		if(elements.length % 2 == 0){
			return (elements[elements.length/2-1] + elements[elements.length/2]) / 2;
		}else{
			return elements[((elements.length - 1)/2)];
		}
	}
}