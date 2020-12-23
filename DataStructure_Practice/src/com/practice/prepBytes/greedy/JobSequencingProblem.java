package com.practice.prepBytes.greedy;

import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Main {

	static class Job implements Comparable<Job> {
		int id;
		int deadline;
		int profit;

		@Override
		public int compareTo(Job otherJob) {
			return otherJob.profit - this.profit;
		}

		public Job(int id, int deadline, int profit) {
			this.id = id;
			this.deadline = deadline;
			this.profit = profit;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Main jobSequencing = new Main();
		ArrayList<Job> jobs = new ArrayList<Job>();
		for (int i = 0; i < n; i++) {
			int id = sc.nextInt();
			int dead = sc.nextInt();
			int pro = sc.nextInt();
			jobs.add(new Job(id, dead, pro));
		}
		Collections.sort(jobs);
		jobSequencing.printJobSequence(jobs, jobs.size());

	}

	private void printJobSequence(ArrayList<Job> jobs, int size) {
		Boolean[] slots = new Boolean[size];
		Arrays.fill(slots, false);

		int result[] = new int[size];

		for (int i = 0; i < size; i++) {
			for (int j = jobs.get(i).deadline - 1; j >= 0; j--) {
				if (!slots[j]) {
					result[j] = i;
					slots[j] = true;
					break;
				}
			}
		}
		int ans = 0;
		for (int i = 0; i < jobs.size(); i++) {
			if (slots[i])
				ans += jobs.get(result[i]).profit;
		}
		System.out.println(ans);
	}
}