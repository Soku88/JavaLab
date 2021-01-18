package com.soku.board.model;

public class BoardDTO {
	private int rowCountPerPage;
	private int startIdx;
	

	public int getStartIdx() {
		return startIdx;
	}

	public void setStartIdx(int startIdx) {
		this.startIdx = startIdx;
	}

	public int getRowCountPerPage() {
		return rowCountPerPage;
	}

	public void setRowCountPerPage(int rowCountPerPage) {
		this.rowCountPerPage = rowCountPerPage;
	}

}
