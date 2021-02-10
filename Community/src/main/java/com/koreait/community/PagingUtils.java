package com.koreait.community;

public class PagingUtils {
	private int maxPage;
	private int sideNum;
	private int currentPage = 1;
	private int startPage;
	private int lastPage;

	
	
	
	public int getMaxPage() {
		return maxPage;
	}

	public void setMaxPage(int maxPage) {
		this.maxPage = maxPage;
	}

	public int getSideNum() {
		return sideNum;
	}

	public void setSideNum(int sideNum) {
		this.sideNum = sideNum;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public int getLastPage() {
		return lastPage;
	}

	public void setLastPage(int lastPage) {
		this.lastPage = lastPage;
	}

}
