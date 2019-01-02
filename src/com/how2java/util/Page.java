package com.how2java.util;

/*
 Page类用于存放分页信息：
start: 开始位置
count: 每页的个数
last: 最后一页的位置
caculateLast()方法: 通过总数total和每页的个数计算出最后一页的位置*/
public class Page {
	int start = 0;
	int count = 5;
	int last = 0;
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		if (start>=0){
			this.start = start;
		}else{
			this.start=0;
		}
		
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getLast() {
		return last;
	}
	public void setLast(int last) {
		this.last = last;
	}
	
	public void caculateLast (int total){
		if (0 == total % count){
			last = total - count;
		}else {
			last = total - total%count;
		}
	}
	
}
