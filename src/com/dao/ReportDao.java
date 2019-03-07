package com.dao;

import java.util.List;

import com.bean.Report;

public interface ReportDao {
	public String addReport(Report r);
	public Report getReportById(String id);
	public List<Report> getAllReporter();
}
